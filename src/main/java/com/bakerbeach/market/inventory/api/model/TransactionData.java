package com.bakerbeach.market.inventory.api.model;

import java.util.List;

import com.bakerbeach.market.order.api.model.OrderItem;

public interface TransactionData {
	
	List<OrderItem> getBookedItems();

}
