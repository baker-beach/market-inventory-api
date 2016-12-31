package com.bakerbeach.market.inventory.api.service;

import com.bakerbeach.market.commons.ServiceException;
import com.bakerbeach.market.core.api.model.Message;
import com.bakerbeach.market.core.api.model.Messages;

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
