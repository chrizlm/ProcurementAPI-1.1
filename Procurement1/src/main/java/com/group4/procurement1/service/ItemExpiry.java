package com.group4.procurement1.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.procurement1.model.Item;

@Service
public class ItemExpiry {
	
	@Autowired
	Item item;
	
	public LocalDate expiryOfItemNotification() {
		LocalDate eoind = item.getItemExpiryDate();
		return eoind.minusDays(30);
	}

}
