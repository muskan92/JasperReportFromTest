package com.stackextend.generatepdfdocument.model;

import java.util.List;

public class TollingData {
	private String accountHolder;
	private String address;
	private String azugaCustomerNumber;

	private List<VehicleTollDetails> vehicleTollDetailsList;

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAzugaCustomerNumber() {
		return azugaCustomerNumber;
	}

	public void setAzugaCustomerNumber(String azugaCustomerNumber) {
		this.azugaCustomerNumber = azugaCustomerNumber;
	}

	public List<VehicleTollDetails> getVehicleTollDetailsList() {
		return vehicleTollDetailsList;
	}

	public void setVehicleTollDetailsList(List<VehicleTollDetails> vehicleTollDetailsList) {
		this.vehicleTollDetailsList = vehicleTollDetailsList;
	}

	@Override
	public String toString() {
		return "TollingData [accountHolder=" + accountHolder + ", address=" + address + ", azugaCustomerNumber="
				+ azugaCustomerNumber + ", vehicleTollDetailsList=" + vehicleTollDetailsList + "]";
	}

}
