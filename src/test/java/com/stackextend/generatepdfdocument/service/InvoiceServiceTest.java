package com.stackextend.generatepdfdocument.service;

import com.stackextend.generatepdfdocument.model.*;
import org.apache.commons.lang.math.IntRange;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {

    CongestionInvoiceData congestionInvoiceData = new CongestionInvoiceData();
    InvoiceService invoiceService = new InvoiceService();
    @Test
    void generateInvoiceForMuskan() throws IOException {
        setUp();

        invoiceService.generateInvoiceForMuskan(congestionInvoiceData, Locale.ENGLISH);

    }
public void setUp(){
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

    List<VehicleCongestionCBDSurchargeDetails.CongestionCBDSurcharge> congestionCBDSurcharge = new ArrayList<>();
    IntStream.range(1,10).forEach(i->
            congestionCBDSurcharge.add(
                    new VehicleCongestionCBDSurchargeDetails
                            .CongestionCBDSurcharge("fa"+i,new BigDecimal(i))
            )
            );

    VehicleCongestionCBDSurchargeDetails vehicleCongestionCBDSurchargeDetails =
            new VehicleCongestionCBDSurchargeDetails(congestionCBDSurcharge);
    congestionInvoiceData.setVehicleCongestionCBDSurchargeDetails(vehicleCongestionCBDSurchargeDetails);


    List<VehicleCongestionMileageSurchargeDetails.CongestionMileageDetails> congestionMileageDetailsList = new ArrayList<>();

    congestionInvoiceData.setCongestionMileageDetailsList(congestionMileageDetailsList);

    IntStream.range(1,10).forEach(i->
                    congestionMileageDetailsList.add(
                            new VehicleCongestionMileageSurchargeDetails.CongestionMileageDetails(
                                    9.0,18.0,"12-10-19"
                            )
                    )
            );

    VehicleCongestionMileageSurchargeDetails vehicleCongestionMileageDetails
            = new VehicleCongestionMileageSurchargeDetails("vehicle098765id",congestionMileageDetailsList);
    congestionInvoiceData.setVehicleCongestionMileageDetails(vehicleCongestionMileageDetails);
    }

}