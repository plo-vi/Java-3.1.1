package ru.netology.lombok;

import org.junit.jupiter.api.Test;
import ru.netology.update.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

//Waves

    @Test
    public void validateRadioWaveOverPossible() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(10, "nameMax");
        radio.setCurrentRadioWave(18);
        assertEquals(0, radio.getCurrentRadioWave());
        assertEquals("nameMax", radio.getName());
    }

    @Test
    public void validateRadioWaveLessPossible() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(10, 0, "nameMin");
        radio.setCurrentRadioWave(-5);
        assertEquals(10, radio.getCurrentRadioWave());
        assertEquals(10, radio.getCurrentRadioWave());
        assertEquals("nameMin", radio.getName());
    }

    @Test
    public void currentRadioWaveUp() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(10, 0, 8, "nameCurrentOne");
        radio.setCurrentRadioWave(10);
        assertEquals(10, radio.getMaxRadioWave());
        assertEquals(0, radio.getMinRadioWave());
        assertEquals(0, radio.currentRadioWaveUp());
        assertEquals("nameCurrentOne", radio.getName());
    }

    @Test
    public void currentRadioWaveDown() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio("nameCurrentTwo", 10, 0, 8);
        radio.setCurrentRadioWave(0);
        assertEquals("nameCurrentTwo", radio.getName());
        assertEquals(10, radio.getMaxRadioWave());
        assertEquals(0, radio.getMinRadioWave());
        assertEquals(10, radio.currentRadioWaveDown());
    }

//Sound

    @Test
    public void validateChangeSoundLevelOverPossible() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(100, 123);
        radio.setCurrentSoundLevel(150);
        assertEquals(100, radio.getCurrentSoundLevel());
        assertEquals(123, radio.getId());
    }

    @Test
    public void validateChangeSoundLevelUnderPossible() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(0, "nameInSound", 456);
        radio.setCurrentSoundLevel(-8);
        assertEquals(0, radio.getCurrentSoundLevel());
        assertEquals("nameInSound", radio.getName());
        assertEquals(456, radio.getId());
    }

    @Test
    public void currentSoundLevelUp() {
        ru.netology.update.Radio radio = new ru.netology.update.Radio(100, 18, "nameMaxSound", 789);
        radio.setCurrentSoundLevel(100);
        assertEquals(100, radio.getCurrentSoundLevel());
        assertEquals(100, radio.currentSoundLevelUp());
        assertEquals("nameMaxSound", radio.getName());
        assertEquals(789, radio.getId());
    }

    @Test
    public void currentSoundLevelDown() {
        ru.netology.update.Radio radio = new Radio(0, "nameMinSound", 18, 741);
        radio.setCurrentSoundLevel(0);
        assertEquals(0, radio.getCurrentSoundLevel());
        assertEquals("nameMinSound", radio.getName());
        assertEquals(0, radio.currentSoundLevelDown());
        assertEquals(741, radio.getId());
    }

}