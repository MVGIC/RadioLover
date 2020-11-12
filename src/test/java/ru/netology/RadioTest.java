package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void stationConstructor() {
        Radio radio = new Radio(20,10);
        assertEquals(20,radio.getAmountRadioStation());
        assertEquals(10,radio.getCurrentRadioStation());
    }

    @Test
    public void shouldUseNoArgsConstructor(){
        Radio radio = new Radio();
        assertEquals(10,radio.getAmountRadioStation());
    }

    @Test
    public void volumeConstructor(){
        Radio radio = new Radio (50);
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio(20,10);
        radio.nextRadioStation();
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio(20,10);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationOverMax(){
        Radio radio = new Radio(20,20);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationUnderMax(){
        Radio radio = new Radio(20,0);
        radio.prevRadioStation();
        assertEquals(20, radio.getCurrentRadioStation());
    }

    @Test
    void minusVolume() {
        Radio radio = new Radio(50);
        radio.minusVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {
        Radio radio = new Radio(50);
        radio.plusVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void plusVolumeOverMax(){
        Radio radio = new Radio(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void minusVolumeUnderMin(){
        Radio radio = new Radio(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}