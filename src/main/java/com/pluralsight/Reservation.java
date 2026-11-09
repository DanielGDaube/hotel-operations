package com.pluralsight;

public class Reservation {
    private String type;
    private int nights;
    private boolean weekend;

    public Reservation(String type, int nights, boolean weekend) {
        this.type = type;
        this.nights = nights;
        this.weekend = weekend;
    }

    public String getType() {return type;}

    public Reservation setType(String type) {
        this.type = type;
        return this;
    }

    public int getNights() {return nights;}

    public Reservation setNights(int nights) {
        this.nights = nights;
        return this;
    }

    public boolean isWeekend() {return weekend;}

    public Reservation setWeekend(boolean weekend) {
        this.weekend = weekend;
        return this;
    }

    public double getPrice() {
        double price = 0;
        if (type.equalsIgnoreCase("king")){
            price = 139.00;
        }
        else if (type.equalsIgnoreCase("double")){
            price = 124.00;
        }
        if (weekend){
            price += (price * .1);
        }
        return price;
    }

    public double getReservationTotal(){return getPrice() * getNights();}
}
