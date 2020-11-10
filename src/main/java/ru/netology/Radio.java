package ru.netology;

public class Radio {
    private int amountRadioStation = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioStation, int currentRadioStation) {
        this.amountRadioStation = amountRadioStation;
        this.currentRadioStation = currentRadioStation;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation == amountRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation() {

        if (currentRadioStation == 0) {
            this.currentRadioStation = amountRadioStation;
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
        if (currentVolume >= 100) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setAmountRadioStation(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            if (currentRadioStation > amountRadioStation){
                return;
            }
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
