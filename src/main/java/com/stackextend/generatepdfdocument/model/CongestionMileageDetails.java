package com.stackextend.generatepdfdocument.model;

import java.util.Date;

public  class CongestionMileageDetails {


    private double totalMiles;

    private double mileSurcharge;

    private Date SurchargeDate;

    public CongestionMileageDetails(double totalMiles, double mileSurcharge, Date surchargeDate) {
        this.totalMiles = totalMiles;
        this.mileSurcharge = mileSurcharge;
        SurchargeDate = surchargeDate;
    }

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

    public Date getSurchargeDate() {
        return SurchargeDate;
    }

    public void setSurchargeDate(Date surchargeDate) {
        SurchargeDate = surchargeDate;
    }
}
