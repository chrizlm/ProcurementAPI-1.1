package com.group4.procurement1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



@Component
@Entity
public class Item {
	
	@Id
	private int itemId;
	private String itemName;
	private String itemDescription;
	private int itemQuantity;
	private Long batchNumber;
	private LocalDate dateReceiveed;
	private LocalDate itemExpiryDate;
	
	
	public int getItemId() {return itemId;}
	
	public void setItemId(int itemId) {this.itemId = itemId;}
	
	public String getItemName() {return itemName;}
	
	public void setItemName(String itemName) {this.itemName = itemName;}
	
	public String getItemDescription() {return itemDescription;}
	
	public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}
	
	public int getItemQuantity() {return itemQuantity;}
	
	public void setItemQuantity(int itemQuantity) {this.itemQuantity = itemQuantity;}
	
	public Long getBatchNumber() {return batchNumber;}
	
	public void setBatchNumber(Long batchNumber) {this.batchNumber = batchNumber;}
	
	public LocalDate getDateReceiveed() {return dateReceiveed;}
	
	public void setDateReceiveed(LocalDate dateReceiveed) {this.dateReceiveed = dateReceiveed;}
	
	public LocalDate getItemExpiryDate() {return itemExpiryDate;}
	
	public void setItemExpiryDate(LocalDate itemExpiryDate) {this.itemExpiryDate = itemExpiryDate;}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", itemQuantity=" + itemQuantity + ", batchNumber=" + batchNumber + ", dateReceiveed=" + dateReceiveed
				+ ", itemExpiryDate=" + itemExpiryDate + "]";
	}
	
		
}
