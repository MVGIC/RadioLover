package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(20,50);
        assertEquals(20,radio.getCurrentRadioStation());
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor(){
        Radio radio = new Radio();
        assertEquals(10,radio.getCurrentRadioStation());
    }
}