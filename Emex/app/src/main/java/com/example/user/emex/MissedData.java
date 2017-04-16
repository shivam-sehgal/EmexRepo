package com.example.user.emex;

/**
 * Created by user on 4/15/2017.
 */

public class MissedData {

    private String date;
    private String distance;

    private String adress1;
    private String adress2;
    private String amount;

    /**
     * @param date     date of ride
     * @param distance distance of ride
     * @param adress1  start adress of ride
     * @param adress2  end adress of ride
     * @param amount   amount of ride
     */
    public MissedData(final String date, final String distance, final String adress1, final String adress2, final String amount) {
        this.date = date;
        this.distance = distance;

        this.adress1 = adress1;
        this.adress2 = adress2;
        this.amount = amount;
    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date give date
     */
    public void setDate(final String date) {
        this.date = date;
    }

    /**
     * @return distance
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
     * @return adress1
     */
    public String getAdress1() {
        return adress1;
    }

    /**
     * @param adress1 takes start adress
     */
    public void setAdress1(final String adress1) {
        this.adress1 = adress1;
    }

    /**
     * @return destination adress
     */
    public String getAdress2() {
        return adress2;
    }

    /**
     * @param adress2 takes destination adress
     */
    public void setAdress2(final String adress2) {
        this.adress2 = adress2;
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount set amount
     */
    public void setAmount(final String amount) {
        this.amount = amount;
    }


}
