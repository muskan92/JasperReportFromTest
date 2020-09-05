package com.stackextend.generatepdfdocument.model;

import java.math.BigDecimal;
import java.util.List;

public class CongestionCBDSurcharge {
	
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
