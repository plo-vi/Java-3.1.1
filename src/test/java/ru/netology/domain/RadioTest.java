package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void validateRadioWaveOverPossible() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(10);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void validateRadioWaveLessPossible() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioWave());
        radio.setCurrentRadioWave(-1);
        assertEquals(9, radio.getCurrentRadioWave());
    }

    @Test
    public void validateChangeSoundLevelOverPossible() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentSoundLevel());
        radio.setCurrentSoundLevel(15);
        assertEquals(10, radio.getCurrentSoundLevel());
    }

    @Test
    public void validateChangeSoundLevelUnderPossible() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentSoundLevel());
        radio.setCurrentSoundLevel(-8);
        assertEquals(0, radio.getCurrentSoundLevel());
    }
}