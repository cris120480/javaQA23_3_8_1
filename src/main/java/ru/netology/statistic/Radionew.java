package ru.netology.statistic;

public class Radionew {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMinVolume()) {
            return;
        }
        if (newCurrentVolume > getMaxVolume()) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume <= 10)
            currentVolume = currentVolume + 1;
        if (currentVolume > getMaxVolume())
            currentVolume = 10;
    }

    public void reduceVolume() {
        if (currentVolume < 10)
            currentVolume = currentVolume - 1;
        if (currentVolume < getMinVolume())
            currentVolume = 0;
    }

    public int getMaxVolume() {
        return 10;
    }

    public int getMinVolume() {
        return 0;
    }


    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < getMinVolume()) {
            return;
        }
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation() {
        if (currentStation <= 9)
            currentStation = currentStation + 1;
        if (currentStation > getMaxStation())
            currentStation = 0;
    }

    public void reduceStation() {
        if (currentStation <= 9)
            currentStation = currentStation - 1;
        if (currentStation < getMinStation())
            currentStation = 9;
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMinStation() {
        return 0;
    }
}


























































