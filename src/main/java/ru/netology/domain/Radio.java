package ru.netology.domain;

public class Radio {
    private int maxRadioWave = 9;
    private int minRadioWave;
    private int currentRadioWave;

    private int maxSoundLevel = 10;
    private int minSoundLevel;
    private int currentSoundLevel;

// Radio waves

    public int getMaxRadioWave() {
        return maxRadioWave;
    }

    public void setMaxRadioWave(int maxRadioWave) {
        this.maxRadioWave = maxRadioWave;
    }

    public int getMinRadioWave() {
        return minRadioWave;
    }

    public void setMinRadioWave(int minRadioWave) {
        this.minRadioWave = minRadioWave;
    }

    public int getCurrentRadioWave() {
        return currentRadioWave;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave > maxRadioWave) {
            currentRadioWave = minRadioWave;
        }
        if (currentRadioWave < minRadioWave) {
            currentRadioWave = maxRadioWave;
        }
        this.currentRadioWave = currentRadioWave;
    }

// Radio sound levels

    public int getMaxSoundLevel() {
        return maxSoundLevel;
    }

    public void setMaxSoundLevel(int maxSoundLevel) {
        this.maxSoundLevel = maxSoundLevel;
    }

    public int getMinSoundLevel() {
        return minSoundLevel;
    }

    public void setMinSoundLevel(int minSoundLevel) {
        this.minSoundLevel = minSoundLevel;
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setCurrentSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel > maxSoundLevel) {
            currentSoundLevel = maxSoundLevel;
        }
        if (currentSoundLevel < minSoundLevel) {
            currentSoundLevel = minSoundLevel;
        }
        this.currentSoundLevel = currentSoundLevel;
    }
}
