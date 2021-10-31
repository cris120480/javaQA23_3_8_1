package ru.netology.statistic;

public class Radio {
    public int increaseVolume(int num) {

        int maxVolume = 10;
        int currentVolume = num;
        currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume)
            currentVolume = 10;
        {

        }
        return currentVolume;

    }


    public int reduceVolume(int num) {

        int minVolume = 0;
        int currentVolume = num;
        currentVolume = currentVolume - 1;
        if (currentVolume < minVolume)
            currentVolume = 0;
        {

        }
        return currentVolume;

    }

    public int increaseStation(int num) {

        int maxVolume = 9;
        int currentVolume = num;
        currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume)
            currentVolume = 0;
        {

        }
        return currentVolume;

    }


    public int reduceStation(int num) {

        int minVolume = 0;
        int currentVolume = num;
        currentVolume = currentVolume - 1;
        if (currentVolume < minVolume)
            currentVolume = 9;
        {

        }
        return currentVolume;

    }
}










































