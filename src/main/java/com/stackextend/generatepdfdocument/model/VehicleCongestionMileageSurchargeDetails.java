package com.stackextend.generatepdfdocument.model;

import java.util.List;

public class VehicleCongestionMileageSurchargeDetails {


	private double totalMilesDriven;
	private double totalSurcharge;
	private String vehicleId;



	private List<CongestionMileageDetails> congestionMileageDetails;
	
	
	public VehicleCongestionMileageSurchargeDetails( String vehicleId,
			List<CongestionMileageDetails> congestionMileageDetails) {
		
		this.vehicleId = vehicleId;
		this.congestionMileageDetails = congestionMileageDetails;
		this.totalSurcharge =  congestionMileageDetails.stream().mapToDouble(it-> it.mileSurcharge).sum();
		this.totalMilesDriven = congestionMileageDetails.stream().mapToDouble(it-> it.totalMiles).sum();
	}


	public void setTotalSurcharge(double totalSurcharge) {
		this.totalSurcharge = totalSurcharge;
	}

	public List<CongestionMileageDetails> getCongestionMileageDetails() {
		return congestionMileageDetails;
	}

	public void setCongestionMileageDetails(List<CongestionMileageDetails> congestionMileageDetails) {
		this.congestionMileageDetails = congestionMileageDetails;
	}
	public double getTotalSurcharge() {
		return totalSurcharge;
	}

	public double getTotalMilesDriven() {
		return totalMilesDriven;
	}

	public void setTotalMilesDriven(double totalMilesDriven) {
		this.totalMilesDriven = totalMilesDriven;
	}
	public String getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}


	public static class CongestionMileageDetails{

		public CongestionMileageDetails(double totalMiles, double mileSurcharge, String surchargeDate) {
			super();
			this.totalMiles = totalMiles;
			this.mileSurcharge = mileSurcharge;
			this.surchargeDate = surchargeDate;
		}


		private double totalMiles;

		private double mileSurcharge;

		public String getSurchargeDate() {
			return surchargeDate;
		}

		public void setSurchargeDate(String surchargeDate) {
			this.surchargeDate = surchargeDate;
		}

		private String surchargeDate;


		public double getTotalMiles() {
			return totalMiles;
		}


		public void setTotalMiles(double totalMiles) {
			this.totalMiles = totalMiles;
		}


		public double getMileSurcharge() {
			return mileSurcharge;
		}


		public void setMileSurcharge(double mileSurcharge) {
			this.mileSurcharge = mileSurcharge;
		}

	}


}
