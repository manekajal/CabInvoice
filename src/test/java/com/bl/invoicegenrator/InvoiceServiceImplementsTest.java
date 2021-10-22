package com.bl.invoicegenrator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceServiceImplementsTest {




    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
            InvoiceGenerator invoiceGenerator= new InvoiceGenerator();

           double distance = 2.0;
           int time = 5;
        double fare=  invoiceGenerator.calculateFare(distance,time );
        assertEquals(25,fare,0.0);

       }


}
