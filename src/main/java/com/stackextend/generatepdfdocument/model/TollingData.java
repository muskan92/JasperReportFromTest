package com.stackextend.generatepdfdocument.model;

import java.util.List;

public class TollingData {
	private String accountHolder;
	private String address;
	private String azugaCustomerNumber;
	private String tesf;
	private int muskSal;



	private List<VehicleTollDetails> vehicleTollDetailsList;
	private List<VehicleTollDetails> abcList;

	public List<VehicleTollDetails> getAbcList() {
		return abcList;
	}

	public void setAbcList(List<VehicleTollDetails> abcList) {
		this.abcList = abcList;
	}

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
	public String getTesf() {
		return tesf;
	}

	public void setTesf(String tesf) {
		this.tesf = tesf;
	}

	public int getMuskSal() {
		return muskSal;
	}

	public void setMuskSal(int muskSal) {
		this.muskSal = muskSal;
	}

	@Override
	public String toString() {
		return "TollingData [accountHolder=" + accountHolder + ", address=" + address + ", azugaCustomerNumber="
				+ azugaCustomerNumber + ", vehicleTollDetailsList=" + vehicleTollDetailsList + "]";
	}

}
