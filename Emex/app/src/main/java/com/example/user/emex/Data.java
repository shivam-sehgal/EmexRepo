package com.example.user.emex;

/**
 * Created by user on 4/15/2017.
 */

public class Data {
    private String date;
    private String distance;
    private String name;
    private String adress;

    /**
     *
     * @param date date of ride
     * @param distance distance of ride
     * @param name name of ride
     * @param adress adress of ride
     */
    public Data(final String date, final String distance, final String name, final String adress) {
        this.date = date;
        this.distance = distance;
        this.name = name;
        this.adress = adress;

    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date takes date
     */

    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * @return distane
     */
    public String getDistance() {
        return distance;
    }

    /**
     * @param distance takes distance
     */
    public void setDistance(final String distance) {
        this.distance = distance;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name takes name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress takes adress
     */
    public void setAdress(final String adress) {
        this.adress = adress;
    }
}
