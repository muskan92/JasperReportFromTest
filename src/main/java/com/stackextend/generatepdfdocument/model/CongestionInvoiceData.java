package com.stackextend.generatepdfdocument.model;

import java.util.ArrayList;
import java.util.List;

public class CongestionInvoiceData {

	private String accountHolder;
	private String address;
	private String azugaCustomerNumber;
	private String state;
	private String account;
	private String homeState;
	private String vin;
	private String vehicleName;
	private int stateId;
	private String make;
	private String model;
	private String vehicleId;



	List<VehicleCongestionMileageSurchargeDetails.CongestionMileageDetails> congestionMileageDetailsList;

	private VehicleCongestionMileageSurchargeDetails vehicleCongestionMileageDetails;
	private VehicleCongestionCBDSurchargeDetails vehicleCongestionCBDSurchargeDetails;

	
	public CongestionInvoiceData(String accountHolder, String address, 
			String azugaCustomerNumber, String state) {
		this.accountHolder = accountHolder;
		this.address = address;
		this.azugaCustomerNumber = azugaCustomerNumber;
		this.state = state;
	}

	public CongestionInvoiceData() {

	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleCongestionMileageSurchargeDetails getVehicleCongestionMileageDetails() {
		return vehicleCongestionMileageDetails;
	}

	public void setVehicleCongestionMileageDetails(
			VehicleCongestionMileageSurchargeDetails vehicleCongestionMileageDetails) {
		this.vehicleCongestionMileageDetails = vehicleCongestionMileageDetails;
	}

	public VehicleCongestionCBDSurchargeDetails getVehicleCongestionCBDSurchargeDetails() {
		return vehicleCongestionCBDSurchargeDetails;
	}

	public void setVehicleCongestionCBDSurchargeDetails(
			VehicleCongestionCBDSurchargeDetails vehicleCongestionCBDSurchargeDetails) {
		this.vehicleCongestionCBDSurchargeDetails = vehicleCongestionCBDSurchargeDetails;
	}


	public List<VehicleCongestionMileageSurchargeDetails.CongestionMileageDetails> getCongestionMileageDetailsList() {
		return congestionMileageDetailsList;
	}

	public void setCongestionMileageDetailsList(List<VehicleCongestionMileageSurchargeDetails.CongestionMileageDetails> congestionMileageDetailsList) {
		this.congestionMileageDetailsList = congestionMileageDetailsList;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getHomeState() {
		return homeState;
	}

	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	



}
