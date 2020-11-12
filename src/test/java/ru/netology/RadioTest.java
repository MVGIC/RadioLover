package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseAllArgsConstructor() {
        Radio radio = new Radio(20,10,50);
        assertEquals(20,radio.getAmountRadioStation());
        assertEquals(10,radio.getCurrentRadioStation());
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor(){
        Radio radio = new Radio();
        assertEquals(10,radio.getAmountRadioStation());
    }

    @Test
    void nextRadioStation() {
        Radio radio = new Radio(20,10,50);
        radio.nextRadioStation();
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio(20,10,50);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationOverMax(){
        Radio radio = new Radio(20,20,50);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationUnderMax(){
        Radio radio = new Radio(20,0,50);
        radio.prevRadioStation();
        assertEquals(20, radio.getCurrentRadioStation());
    }

    @Test
    void minusVolume() {
        Radio radio = new Radio(10,10,50);
        radio.minusVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void plusVolume() {
        Radio radio = new Radio(10,10,50);
        radio.plusVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void plusVolumeOverMax(){
        Radio radio = new Radio(10,10,100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void minusVolumeUnderMin(){
        Radio radio = new Radio(10,10,0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}