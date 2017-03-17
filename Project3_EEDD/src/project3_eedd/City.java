/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3_eedd;

import java.util.Arrays;
import java.util.regex.Pattern;
import static scala.io.BytePickle.string;

/**
 *
 * @author k_k_r
 */
public class City {

    private String Name;
    private String Label;
    private String Airport;

    public City(String Label) {
        this.Label = Label;
        this.setAirport(Label);
        this.setName(Label);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Label) {
        String[] splitter = Label.split("[(]");      
        this.Name = splitter[0];
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public void setAirport(String Label) {
        String[] splitter = Label.split("[(]");
        String s = splitter[1].replace(" ","");
        this.Airport = s.replace(")","");
    }

    public String getLabel() {
        return Label;
    }

    public String getAirport() {
        return Airport;
    }

    public void setAirport() {
        this.Airport = Airport;
    }

    @Override
    public String toString() {
        return Label;
    }

}
