package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolumeMaxFinish() {
        Radio volume = new Radio();
        int expected = 10;
        int actual = volume.increaseVolume(10);
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio volume = new Radio();
        int expected = 9;
        int actual = volume.increaseVolume(8);
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMaxRelevant() {
        Radio volume = new Radio();
        int expected = 10;
        int actual = volume.increaseVolume(9);
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radio volume = new Radio();
        int expected = 4;
        int actual = volume.reduceVolume(5);
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolumeMinFinish() {
        Radio volume = new Radio();
        int expected = 0;
        int actual = volume.reduceVolume(0);
        assertEquals(expected, actual);

    }

    @Test
    void reduceVolumeMinRelevant() {
        Radio volume = new Radio();
        int expected = 0;
        int actual = volume.reduceVolume(1);
        assertEquals(expected, actual);
    }

    @Test
    void increaseStationReturn0() {
        Radio volume = new Radio();
        int expected = 0;
        int actual = volume.increaseStation(9);
        assertEquals(expected, actual);
    }

    @Test
    void increaseStation() {
        Radio volume = new Radio();
        int expected = 9;
        int actual = volume.increaseStation(8);
        assertEquals(expected, actual);
    }


    @Test
    void reduceStation() {
        Radio volume = new Radio();
        int expected = 7;
        int actual = volume.reduceStation(8);
        assertEquals(expected, actual);
    }

    @Test
    void reduceStationReturn9() {
        Radio volume = new Radio();
        int expected = 9;
        int actual = volume.reduceStation(0);
        assertEquals(expected, actual);
    }
}

