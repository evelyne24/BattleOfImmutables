package com.deliveroo.battleofimmutables;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.deliveroo.battleofimmutables.model.lombok.Order;
import com.deliveroo.battleofimmutables.model.lombok.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<OrderItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Order order = makeOrder();
        showOrder(order);
    }


    private void showOrder(Order order) {
        Toast.makeText(this, order.toString(), Toast.LENGTH_LONG).show();
    }

    private Order makeOrder() {
        items.add(makeOrderItem("pizza", 4.99));
        items.add(makeOrderItem("burger", 10.99));
        return Order.builder().id(1).items(items).build();
    }

    private OrderItem makeOrderItem(String dishName, double price) {
        return OrderItem.builder().dishName(dishName).price(price).quantity(1).build();
    }

}
