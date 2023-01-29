package com.hma.Actors;

import java.util.ArrayList;

public class Patient {
    public int pid;
    public String pname;
    private int age;
    private String address;
    private String disease;
    private ArrayList<Medicine> medicineslist; //user defined datatype
    public int roomNo;

    public Patient(int pid, String pname, int roomNo) {
        this.pid = pid;
        this.pname = pname;
        this.roomNo = roomNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public ArrayList<Medicine> getMedicineslist() {
        return medicineslist;
    }

    public void setMedicineslist(ArrayList<Medicine> medicineslist) {
        this.medicineslist = medicineslist;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", disease='" + disease + '\'' +
                ", medicineslist=" + medicineslist +
                ", roomNo=" + roomNo +
                '}';
    }
}
