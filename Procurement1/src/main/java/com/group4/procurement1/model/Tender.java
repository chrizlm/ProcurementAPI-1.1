package com.group4.procurement1.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tender {
	@Id
	private int tenderId;
	private String tenderRefNo;
	private String tenderDescription;
	private String tenderCategory;
	private String procurementMethod;
	private String tenderStatus;
	private LocalDate tenderClose;
	
	
	public int getTenderId() {return tenderId;}

	public void setTenderId(int tenderId) {this.tenderId = tenderId;}

	public String getTenderRefNo() {return tenderRefNo;}
	
	public void setTenderRefNo(String tenderRefNo) {this.tenderRefNo = tenderRefNo;}
	
	public String getTenderDescription() {return tenderDescription;}
	
	public void setTenderDescription(String tenderDescription) {this.tenderDescription = tenderDescription;}
	
	public String getTenderCategory() {return tenderCategory;}
	
	public void setTenderCategory(String tenderCategory) {this.tenderCategory = tenderCategory;}
	
	public String getProcurementMethod() {return procurementMethod;}
	
	public void setProcurementMethod(String procurementMethod) {this.procurementMethod = procurementMethod;}
	
	public String getTenderStatus() {return tenderStatus;}
	
	public void setTenderStatus(String tenderStatus) {this.tenderStatus = tenderStatus;}
	
	public LocalDate getTenderClose() {return tenderClose;}
	
	public void setTenderClose(LocalDate tenderClose) {this.tenderClose = tenderClose;}

	@Override
	public String toString() {
		return "Tender [tenderId=" + tenderId + ", tenderRefNo=" + tenderRefNo + ", tenderDescription="
				+ tenderDescription + ", tenderCategory=" + tenderCategory + ", procurementMethod=" + procurementMethod
				+ ", tenderStatus=" + tenderStatus + ", tenderClose=" + tenderClose + "]";
	}


	
	

}
