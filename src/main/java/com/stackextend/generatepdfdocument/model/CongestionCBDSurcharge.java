package com.stackextend.generatepdfdocument.model;

import java.math.BigDecimal;
import java.util.Date;

public class CongestionCBDSurcharge {

	private Date zoneEntryTime;
	private BigDecimal zoneSurcharge;

	public CongestionCBDSurcharge(Date zoneEntryTime, BigDecimal zoneSurcharge) {
		this.zoneEntryTime = zoneEntryTime;
		this.zoneSurcharge = zoneSurcharge;
	}

	public Date getZoneEntryTime() {
		return zoneEntryTime;
	}
	public void setZoneEntryTime(Date zoneEntryTime) {
		this.zoneEntryTime = zoneEntryTime;
	}
	public BigDecimal getZoneSurcharge() {
		return zoneSurcharge;
	}
	public void setZoneSurcharge(BigDecimal zoneSurcharge) {
		this.zoneSurcharge = zoneSurcharge;
	}
}
