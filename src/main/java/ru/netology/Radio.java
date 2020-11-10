package ru.netology;

public class Radio {
    private int currentRadioStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int currentRadioStation, int currentVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
