package com.stackextend.generatepdfdocument.model;

import java.math.BigDecimal;
import java.util.List;

public class VehicleCongestionCBDSurchargeDetails {

	private BigDecimal totalZoneSurcharge;
	private List<CongestionCBDSurcharge> congestionCBDSurcharge;
	private String vehicleId;

	public VehicleCongestionCBDSurchargeDetails(
			List<CongestionCBDSurcharge> congestionCBDSurcharge) {
		
		this.congestionCBDSurcharge = congestionCBDSurcharge;
		this.totalZoneSurcharge = congestionCBDSurcharge.stream().map(it->it.zoneSurcharge).reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	

	public BigDecimal getTotalZoneSurcharge() {
		return totalZoneSurcharge;
	}



	public List<CongestionCBDSurcharge> getCongestionCBDSurcharge() {
		return congestionCBDSurcharge;
	}

	public String getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public static class CongestionCBDSurcharge{

		
		private String zoneEntryTime;
		private BigDecimal zoneSurcharge;

		public CongestionCBDSurcharge(String zoneEntryTime, BigDecimal zoneSurcharge) {
			this.zoneEntryTime = zoneEntryTime;
			this.zoneSurcharge = zoneSurcharge;
		}

		public String getZoneEntryTime() {
			return zoneEntryTime;
		}
		public void setZoneEntryTime(String zoneEntryTime) {
			this.zoneEntryTime = zoneEntryTime;
		}
		public BigDecimal getZoneSurcharge() {
			return zoneSurcharge;
		}
		public void setZoneSurcharge(BigDecimal zoneSurcharge) {
			this.zoneSurcharge = zoneSurcharge;
		}

	}
}
