package com.bakerbeach.market.inventory.api.service;

import com.bakerbeach.market.core.api.model.Order;
import com.bakerbeach.market.inventory.api.model.InventoryStatus;
import com.bakerbeach.market.inventory.api.model.TransactionData;

public interface InventoryService {

	InventoryStatus getInventoryStatus(String gtin) throws InventoryServiceException;

	TransactionData decrement(Order order) throws InventoryServiceException;

	void confirm(TransactionData transactionData, Order order) throws InventoryServiceException;

	void rollBack(TransactionData transactionData) throws InventoryServiceException;

	void incrementInventory(String gtin, Integer quantity) throws InventoryServiceException;

	void decrementInventory(String gtin, Integer quantity) throws InventoryServiceException;

	void setInventory(String gtin, Integer quantity) throws InventoryServiceException;

}
