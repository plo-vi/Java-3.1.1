package ru.netology.lombok;

import lombok.*;
@Getter
@Setter

public class Radio {
    private int currentRadioWave;
    private int currentSoundLevel;

    private final int minRadioWave = 0;
    private int numberStation = 10;
    private int maxRadioWave = 9;

    private final int maxSoundLevel = 100;
    private final int minSoundLevel = 0;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxRadioWave = numberStation - 1;
    }

    public void setCurrentStation(int currentRadioWave ) {
        if (currentRadioWave > maxRadioWave) {
            return;
        }
        if (currentRadioWave < minRadioWave) {
            return;
        }
        this.currentRadioWave = currentRadioWave;
    }

    public void setCurrentSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel > maxSoundLevel) {
            return;
        }
        if (currentSoundLevel < minSoundLevel) {
            return;
        }
        this.currentSoundLevel = currentSoundLevel;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    // station control
    public int nextStation() {
        currentRadioWave = currentRadioWave < maxRadioWave ? currentRadioWave + 1 : minRadioWave;
        return currentRadioWave;
    }

    public int prevStation() {
        currentRadioWave = currentRadioWave > minRadioWave ? currentRadioWave - 1 : maxRadioWave;
        return currentRadioWave;
    }

    // volume control
    public int increaseVolume() {
        if (currentSoundLevel < maxSoundLevel) {
            currentSoundLevel++;
        }
        return currentSoundLevel;
    }

    public int decreaseVolume() {
        if (currentSoundLevel > minSoundLevel) {
            currentSoundLevel--;
        }
        return currentSoundLevel;
    }
}