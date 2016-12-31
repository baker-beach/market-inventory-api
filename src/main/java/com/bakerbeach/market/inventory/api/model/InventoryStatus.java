package com.bakerbeach.market.inventory.api.model;

public interface InventoryStatus {
	
	boolean isAvailable();
	
	boolean isOutOfStock();
	
	Integer getMaximumOrderQuantity();

	String getGtin();

	Integer getOutOfStockLimit();

	Integer getStock();

}
