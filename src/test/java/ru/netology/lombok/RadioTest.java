package ru.netology.lombok;

import org.junit.jupiter.api.Test;
import ru.netology.update.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    ru.netology.update.Radio radio = new Radio(15);
    @Test
    public void setCurrentStation() {
        int expected = 14;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentRadioWave());
    }

    @Test
    public void setCurrentStationOutLimit() {
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void setCurrentVolume() {
        int expected = 90;
        radio.setCurrentSoundLevel(expected);
        assertEquals(expected, radio.getCurrentSoundLevel());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentSoundLevel(110);
        assertEquals(0, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldNextStationInLimit() {
        radio.setCurrentStation(13);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldPrevStationInLimit() {
        radio.setCurrentStation(10);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(14);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldPrevStationMin() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldIncreaseVolumeInLimit() {
        radio.setCurrentSoundLevel(50);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(51, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldDecreaseVolumeInLimit() {
        radio.setCurrentSoundLevel(50);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(49, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentSoundLevel(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(100, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentSoundLevel(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(0, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldNextStationOutLimit() {
        radio.setCurrentStation(16);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(1, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldPrevStationOutLimit() {
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentRadioWave());
    }

    @Test
    public void shouldIncreaseVolumeOutLimit() {
        radio.setCurrentSoundLevel(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(1, radio.getCurrentSoundLevel());
    }

    @Test
    public void shouldDecreaseVolumeOutLimit() {
        radio.setCurrentSoundLevel(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentSoundLevel(currentVolume);
        assertEquals(0, radio.getCurrentSoundLevel());
    }
}