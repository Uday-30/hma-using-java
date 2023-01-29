package com.hma.Actors;

public class Medicine {
    public int mid;
    public String mname;
    public String manufacturer;
    public String expiredate;
    public float mprice;

    public Medicine(int mid, String mname, String manufacturer, String expiredate, float mprice) {
        this.mid = mid;
        this.mname = mname;
        this.manufacturer = manufacturer;
        this.expiredate = expiredate;
        this.mprice = mprice;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", expiredate='" + expiredate + '\'' +
                ", mprice=" + mprice +
                '}';
    }
}
