package com.bl.invoicegenrator.service;

import com.bl.invoicegenrator.models.InvoiceDetails;
import com.bl.invoicegenrator.models.RideDetail;

public interface InvoiceService {

    public double calculateRide(RideDetail invoiceDetails, double distace, int time);

}
