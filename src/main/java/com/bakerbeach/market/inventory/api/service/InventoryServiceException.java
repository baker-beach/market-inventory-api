package com.bakerbeach.market.inventory.api.service;

import com.bakerbeach.market.commons.Message;
import com.bakerbeach.market.commons.Messages;
import com.bakerbeach.market.commons.ServiceException;

public class InventoryServiceException extends ServiceException {

	private static final long serialVersionUID = 1L;
	
	public InventoryServiceException(){
		super();
	}
	
	public InventoryServiceException(Messages messages) {
		super(messages);
	}
	
	public InventoryServiceException(Message message) {
		this.getMessages().add(message);
	}

}
