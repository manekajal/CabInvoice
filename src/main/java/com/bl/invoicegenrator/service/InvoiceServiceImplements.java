package com.bl.invoicegenrator.service;
import com.bl.invoicegenrator.models.InvoiceDetails;
import com.bl.invoicegenrator.models.RideDetail;

import java.util.ArrayList;

public class InvoiceServiceImplements implements InvoiceService {




    private static double MINIMUM_COST_PER_KILOMETER;
    private static int COST_PER_TIME;
    private static int MINIMUM_FARE;

    public void addValue(RideDetail rideDetail) {
        MINIMUM_COST_PER_KILOMETER = rideDetail.minimumCostPerKM;
        COST_PER_TIME = rideDetail.costPerTime;
        MINIMUM_FARE = rideDetail.minFare;
    }

    public double calculateRide(RideDetail invoiceDetails, double distance, int time) {
        addValue(invoiceDetails);
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }



}


