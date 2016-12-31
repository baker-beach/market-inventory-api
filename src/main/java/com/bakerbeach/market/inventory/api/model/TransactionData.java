package com.bakerbeach.market.inventory.api.model;

import java.util.List;

import com.bakerbeach.market.core.api.model.OrderItem;

public interface TransactionData {
	
	List<OrderItem> getBookedItems();

}
