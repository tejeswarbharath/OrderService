package com.practical.orderapplication.entity;

import java.util.List;

public record Order(String order_id, List<Item> items, double total_price) {
}
