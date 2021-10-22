package com.bl.invoicegenrator;

import com.bl.invoicegenrator.models.RideDetail;
import com.bl.invoicegenrator.service.InvoiceServiceImplements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceServiceImplementsTest {

    InvoiceServiceImplements invoiceServiceImplements = new InvoiceServiceImplements();

   @Test
    public void usingDistanceAndTime_calculateTotalFare(){
       InvoiceServiceImplements invoiceServiceImplements=new InvoiceServiceImplements();
       double distance = 10.0;
       int time = 8;
       double fare = invoiceServiceImplements.calculateRide(RideDetail.NORMAL, distance, time);
       assertEquals(100, fare, 0.0);
   }


}
