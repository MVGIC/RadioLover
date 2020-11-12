package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int amountRadioStation = 10;
    private int currentRadioStation;
    private int currentVolume;

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
}
