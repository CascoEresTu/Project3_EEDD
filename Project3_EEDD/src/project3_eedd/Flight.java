/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_eedd;

/**
 *
 * @author cgcv
 */
public class Flight {

    private String CityFrom;
    private String CityTo;
    private String airline;
    private double cost;
    private double distance;

    public Flight(String CityFrom, String CityTo, String airline, double cost, double distance) {
        this.CityFrom = CityFrom;
        this.CityTo = CityTo;
        this.airline = airline;
        this.cost = cost;
        this.distance = distance;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Flight() {
    }

    public String getAirportFrom() {
        return CityFrom;
    }

    public void setAirportFrom(String CityFrom) {
        this.CityFrom = CityFrom;
    }

    public String getAirportTo() {
        return CityTo;
    }

    public void setAirportTo(String CityTo) {
        this.CityTo = CityTo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Flight{" + "CityFrom=" + CityFrom + ", CityTo=" + CityTo + ", airline=" + airline + ", cost=" + cost + ", distance=" + distance + '}';
    }

}
