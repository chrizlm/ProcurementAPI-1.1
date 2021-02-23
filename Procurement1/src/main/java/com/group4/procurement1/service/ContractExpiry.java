package com.group4.procurement1.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.procurement1.model.Contract;

@Service
public class ContractExpiry {
	
	@Autowired
	Contract contract;
	
	public LocalDate expiryOfContract() {
		LocalDate eocd = contract.getDateAwarded();
		return eocd.plusDays(contract.getContractDurationDays());
	}

	public LocalDate expiryOfContractNotification() {
		return expiryOfContract().minusDays(30);
	}
	
}
