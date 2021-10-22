package com.bl.invoicegenrator.models;

public class InvoiceDetails {
    public double distance;

    public int time;

    public int total_fare;

    public double cost_per_km;

    public int cost_per_time;
    public final double minimumCostPerKM;
    public final int costPerTime;
    public final int minFare;

    public InvoiceDetails(double distance, int time, int total_fare, double cost_per_km, int cost_per_time, double minimumCostPerKM, int costPerTime, int minFare) {
        this.distance = distance;
        this.time = time;
        this.total_fare = total_fare;
        this.cost_per_km = cost_per_km;
        this.cost_per_time = cost_per_time;
        this.minimumCostPerKM = minimumCostPerKM;
        this.costPerTime = costPerTime;
        this.minFare = minFare;
    }
}
