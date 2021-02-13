package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void validateRadioWaveOverPossible() {
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(10);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void validateRadioWaveLessPossible() {
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(-1);
        assertEquals(9, radio.getCurrentRadioWave());
    }

    @Test
    public void currentRadioWaveUp() {
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(5);
        assertEquals(6, radio.currentRadioWaveUp());
    }

    @Test
    public void currentRadioWaveDown() {
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(3);
        assertEquals(2, radio.currentRadioWaveDown());
    }

// ----------------------------------

    @Test
    public void validateChangeSoundLevelOverPossible() {
        assertEquals(0, radio.getCurrentSoundLevel());
        radio.setCurrentSoundLevelUp(15);
        assertEquals(10, radio.getCurrentSoundLevel());
    }

    @Test
    public void validateChangeSoundLevelUnderPossible() {
        assertEquals(0, radio.getCurrentSoundLevel());
        radio.setCurrentSoundLevelDown(-8);
        assertEquals(0, radio.getCurrentSoundLevel());
    }
}