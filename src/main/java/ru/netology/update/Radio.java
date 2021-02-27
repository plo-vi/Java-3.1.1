package ru.netology.update;

public class Radio {
    private int maxRadioWave = 9;
    private int minRadioWave = 0;
    private int currentRadioWave = 0;

    private int maxSoundLevel = 10;
    private int minSoundLevel;
    private int currentSoundLevel;

    private String name;
    private int id;

// Radio waves

    public Radio(int maxRadioWave, String name) {
        this.maxRadioWave = maxRadioWave;
        this.name = name;
    }

    public Radio(int maxRadioWave, int minRadioWave, String name) {
        this.maxRadioWave = maxRadioWave;
        this.minRadioWave = minRadioWave;
        this.name = name;
    }

    public Radio(int maxRadioWave, int minRadioWave, int currentRadioWave, String name) {
        this.maxRadioWave = maxRadioWave;
        this.minRadioWave = minRadioWave;
        this.currentRadioWave = currentRadioWave;
        this.name = name;
    }

    public Radio(String name, int maxRadioWave, int minRadioWave, int currentRadioWave) {
        this.name = name;
        this.maxRadioWave = maxRadioWave;
        this.minRadioWave = minRadioWave;
        this.currentRadioWave = currentRadioWave;
    }

// Get and set logic to know wave

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

    public int setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave > maxRadioWave) {
            currentRadioWave = minRadioWave;
        }
        if (currentRadioWave < minRadioWave) {
            currentRadioWave = maxRadioWave;
        }
        this.currentRadioWave = currentRadioWave;
        return currentRadioWave;
    }

    public int currentRadioWaveUp() {
        return setCurrentRadioWave(currentRadioWave + 1);
    }

    public int currentRadioWaveDown() {
        return setCurrentRadioWave(currentRadioWave - 1);
    }

// Radio sound levels

    public Radio(int maxSoundLevel, int id) {
        this.maxSoundLevel = maxSoundLevel;
        this.id = id;
    }

    public Radio(int minSoundLevel, String name, int id) {
        this.minSoundLevel = minSoundLevel;
        this.name = name;
        this.id = id;
    }

    public Radio(int maxSoundLevel, int currentSoundLevel, String name, int id) {
        this.maxSoundLevel = maxSoundLevel;
        this.currentSoundLevel = currentSoundLevel;
        this.name = name;
        this.id = id;
    }

    public Radio(int minSoundLevel, String name, int currentSoundLevel, int id) {
        this.minSoundLevel = minSoundLevel;
        this.name = name;
        this.currentSoundLevel = currentSoundLevel;
        this.id = id;
    }

// Get and set logic to know sound level

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

    public int setCurrentSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel > maxSoundLevel) {
            currentSoundLevel = maxSoundLevel;
        }
        if (currentSoundLevel < minSoundLevel) {
            currentSoundLevel = minSoundLevel;
        }
        this.currentSoundLevel = currentSoundLevel;
        return currentSoundLevel;
    }

    public int currentSoundLevelUp() {
        return setCurrentSoundLevel(currentSoundLevel + 1);
    }

    public int currentSoundLevelDown() {
        return setCurrentSoundLevel(currentSoundLevel - 1);
    }


// get and set logic to know name and id

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
