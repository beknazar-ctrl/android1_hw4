package com.example.android1_hw4;



public class ItemModel {

    String zagolovok;
    String opisanie;
    String date;

    public ItemModel(String zagolovok, String opisanie, String date) {
        this.zagolovok = zagolovok;
        this.opisanie = opisanie;
        this.date = date;
    }

    public String getZagolovok() {
        return zagolovok;
    }

    public void setZagolovok(String zagolovok) {
        this.zagolovok = zagolovok;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
