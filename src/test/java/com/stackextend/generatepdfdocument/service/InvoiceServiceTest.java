package com.stackextend.generatepdfdocument.service;

import com.stackextend.generatepdfdocument.model.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

class InvoiceServiceTest {

    CongestionInvoiceData congestionInvoiceData ;
    InvoiceService invoiceService = new InvoiceService();
    @Test
    void generateInvoiceForMuskan() throws IOException {
        setUp();
        invoiceService.generateInvoiceForMuskan(congestionInvoiceData, Locale.ENGLISH);
    }

public void setUp(){

    List<CongestionCBDSurcharge> congestionCBDSurchargeList = new ArrayList<>();
    IntStream.range(1,20).forEach(i->
            congestionCBDSurchargeList.add(new CongestionCBDSurcharge("fa"+i,new BigDecimal(i)))
    );

    List<CongestionMileageDetails> congestionMileageDetailsList = new ArrayList<>();

    IntStream.range(1,20).forEach(i->
            congestionMileageDetailsList.add(new CongestionMileageDetails(9.0,18.0,new Date()))
    );

    congestionInvoiceData  = new CongestionInvoiceData(congestionCBDSurchargeList,congestionMileageDetailsList);
    congestionInvoiceData.setAccount("MuskanAccount");
    congestionInvoiceData.setAccountHolder("Muskaan");
    congestionInvoiceData.setAddress("HSR");
    congestionInvoiceData.setAzugaCustomerNumber("Azuga123");
    congestionInvoiceData.setHomeState("Karnatak");
    congestionInvoiceData.setMake("2019");
    congestionInvoiceData.setModel("Model");
    congestionInvoiceData.setState("UP");
    congestionInvoiceData.setStateId(42);
    congestionInvoiceData.setVehicleId("vehicle987654");
    congestionInvoiceData.setVehicleName("myVehicle");
    congestionInvoiceData.setVin("VIN765443");




    }

}