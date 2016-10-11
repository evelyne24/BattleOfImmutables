#!/usr/bin/env bash

## Usage examples:
# ./count_methods pojo/Card
# ./count_methods "autovalue/*"
# ./count_methods "ombok/*"

## Exit if errors
set -e

declare scriptPath=$(pwd)

_line() {
    seq  -f "#" -s '' 100 >> $1
    echo -e "\n" >> $1
}

_dexdump() {
 dexdump -f output.dex > $1
 _line $1
}

_dexMethodList() {
  $scriptPath/tools/dex-method-list output.dex >> $1
  _line $1
}

_dexMethodCount() {
   $scriptPath/tools/dex-method-counts output.dex >> $1
   _line $1
}

_javap() {
 javap -p -c com.deliveroo.battleofimmutables.model.${1//\//.} >> $2
 _line $file
}

 main() {
   ## Clean compile project
  ./gradlew clean compileDebugSources

   ## Go to compiled classes
   cd app/build/intermediates/classes/debug/ 

   ## Dex all classes
   dx --dex --output=output.dex com/deliveroo/battleofimmutables/model/$1.class

   file="$scriptPath/dumps/dump_${1//\//_}.txt"

   if [ -f $file ] ; then
    rm -f $file
   fi

   ## Output results in /dumps
   #_dexdump $file
   _dexMethodCount $file
   _dexMethodList $file

   if [[ $1 = *[!\\*]* ]]; then
    _javap $1 $file
   fi

   cd $scriptPath
}

main "$@"