package com.stackextend.generatepdfdocument.service;

import com.stackextend.generatepdfdocument.model.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {


    /*private String code;
    private AddressModel address = new AddressModel("muskan",
           "gupta",
            "hsr",
            "560101",
            "blor",
            "india");
    OrderEntryModel oem = new OrderEntryModel("product",3,9.0);
    OrderEntryModel oem1 = new OrderEntryModel("product1",31,91.0);

    List<OrderEntryModel> entries = new ArrayList<OrderEntryModel>();*/


    TollingData tollingData = new TollingData();

    @Test
    void generateInvoiceForMuskan() throws IOException {

        //entries.add(oem);
        //entries.add(oem1);
        //OrderModel om = new OrderModel("123",address,entries);
        tollingData.setAccountHolder("muskaan");
        tollingData.setAddress("adressffh");
        tollingData.setAzugaCustomerNumber("azuga123");
        VehicleTollDetails VehicleTollDetails = new VehicleTollDetails("12-03-2020","entry","3","4","5","6",new BigDecimal("9"));
        List<VehicleTollDetails> vehicleTollDetailsList = new ArrayList<>();
        vehicleTollDetailsList.add(VehicleTollDetails);
        tollingData.setVehicleTollDetailsList(vehicleTollDetailsList);
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoiceForMuskan(tollingData, Locale.ENGLISH);



    }
}