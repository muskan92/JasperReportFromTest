package com.stackextend.generatepdfdocument.model;

import java.math.BigDecimal;
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

	private BigDecimal totalZoneSurcharge;
	private Double totalMilesDriven;
	private Double totalSurcharge;
	private List<CongestionCBDSurcharge> congestionCBDSurchargeList;

	private List<CongestionMileageDetails> congestionMileageDetailsList;

	public CongestionInvoiceData(List<CongestionCBDSurcharge> congestionCBDSurchargeList,
								 List<CongestionMileageDetails> congestionMileageDetailsList
								 ) {
	this.congestionCBDSurchargeList = congestionCBDSurchargeList;
	this.congestionMileageDetailsList = congestionMileageDetailsList;
		this.totalSurcharge =  congestionMileageDetailsList.stream().mapToDouble(it-> it.getMileSurcharge()).sum();
		this.totalMilesDriven = congestionMileageDetailsList.stream().mapToDouble(it-> it.getTotalMiles()).sum();
		this.totalZoneSurcharge = congestionCBDSurchargeList.stream().map(it->it.getZoneSurcharge()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public Double getTotalMilesDriven() {
		return totalMilesDriven;
	}

	public void setTotalMilesDriven(Double totalMilesDriven) {
		this.totalMilesDriven = totalMilesDriven;
	}

	public Double getTotalSurcharge() {
		return totalSurcharge;
	}

	public void setTotalSurcharge(Double totalSurcharge) {
		this.totalSurcharge = totalSurcharge;
	}

	public BigDecimal getTotalZoneSurcharge() {
		return totalZoneSurcharge;
	}

	public void setTotalZoneSurcharge(BigDecimal totalZoneSurcharge) {
		this.totalZoneSurcharge = totalZoneSurcharge;
	}

	public List<CongestionCBDSurcharge> getCongestionCBDSurchargeList() {
		return congestionCBDSurchargeList;
	}

	public void setCongestionCBDSurchargeList(List<CongestionCBDSurcharge> congestionCBDSurchargeList) {
		this.congestionCBDSurchargeList = congestionCBDSurchargeList;
	}

	public List<CongestionMileageDetails> getCongestionMileageDetailsList() {
		return congestionMileageDetailsList;
	}

	public void setCongestionMileageDetailsList(List<CongestionMileageDetails> congestionMileageDetailsList) {
		this.congestionMileageDetailsList = congestionMileageDetailsList;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
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
