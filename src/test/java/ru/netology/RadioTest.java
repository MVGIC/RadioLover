package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextRadioStation() {

        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        radio.nextRadioStation();

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation() {

        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationOverMax(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationUnderMax(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }



    @Test
    void minusVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.minusVolume();

        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.plusVolume();

        assertEquals(6, radio.getCurrentVolume());
    }


    @Test
    void plusVolumeOverMax(){

        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.plusVolume();

        assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    void minusVolumeUnderMin(){

        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.minusVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

}