package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public void nextRadioStation() {

        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation() {

        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }


    public void minusVolume() {

        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }


    public void plusVolume() {

        if (currentVolume >= 10) {
            return;
        }
        this.currentVolume = currentVolume + 1;

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
