package com.stackextend.generatepdfdocument.model;

import java.math.BigDecimal;

public class VehicleTollDetails {
	private String date;
	private String location;
	private String entryTollPlaza;
	private String entryTollTime;
	private String exitTollPlaza;
	private String exitTollTime;
	private BigDecimal amount;
	
	public VehicleTollDetails(String date, String location, String entryTollPlaza, String entryTollTime,
			String exitTollPlaza, String exitTollTime, BigDecimal amount) {
		super();
		this.date = date;
		this.location = location;
		this.entryTollPlaza = entryTollPlaza;
		this.entryTollTime = entryTollTime;
		this.exitTollPlaza = exitTollPlaza;
		this.exitTollTime = exitTollTime;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEntryTollPlaza() {
		return entryTollPlaza;
	}

	public void setEntryTollPlaza(String entryTollPlaza) {
		this.entryTollPlaza = entryTollPlaza;
	}

	public String getEntryTollTime() {
		return entryTollTime;
	}

	public void setEntryTollTime(String entryTollTime) {
		this.entryTollTime = entryTollTime;
	}

	public String getExitTollPlaza() {
		return exitTollPlaza;
	}

	public void setExitTollPlaza(String exitTollPlaza) {
		this.exitTollPlaza = exitTollPlaza;
	}

	public String getExitTollTime() {
		return exitTollTime;
	}

	public void setExitTollTime(String exitTollTime) {
		this.exitTollTime = exitTollTime;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "VehicleTollDetails [date=" + date + ", location=" + location + ", entryTollPlaza=" + entryTollPlaza
				+ ", entryTollTime=" + entryTollTime + ", exitTollPlaza=" + exitTollPlaza + ", exitTollTime="
				+ exitTollTime + ", amount=" + amount + "]";
	}

}
