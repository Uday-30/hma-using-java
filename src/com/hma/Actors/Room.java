package com.hma.Actors;

public class Room {
    public int rid;
    public String type;
    public float rprice;

    public Room(int rid, String type, float rprice) {
        this.rid = rid;
        this.type = type;
        this.rprice = rprice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", type='" + type + '\'' +
                ", rprice=" + rprice +
                '}';
    }
}
