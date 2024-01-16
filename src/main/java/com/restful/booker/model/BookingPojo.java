package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {
    private String firstname;
    private String lastname;
    private long totalPrice;
    private boolean depositPaid;
    private String additionalNeeds;
    private HashMap<String,String> bookingDates;
    private String checkIn;
    private String checkOut;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }

    public void setBookingDates(HashMap<String, String> bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public String getAdditionalNeeds() {
        return additionalNeeds;
    }

    public HashMap<String, String> getBookingDates() {
        return bookingDates;
    }



}
