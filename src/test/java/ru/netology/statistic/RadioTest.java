package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolume() {
            Radio volume = new Radio();
            int expected = 10;
            int actual = volume.increaseVolume(10);
            assertEquals(expected, actual);
        }

    @Test
    void reduceVolume() {
        Radio volume = new Radio();
        int expected = 0;
        int actual = volume.reduceVolume(  0);
        assertEquals(expected, actual);
    }
    @Test
    void increaseStation() {
        Radio volume = new Radio();
        int expected = 0;
        int actual = volume.increaseStation(9);
        assertEquals(expected, actual);
    }

    @Test
    void reduceStation() {
        Radio volume = new Radio();
        int expected = 9;
        int actual = volume.reduceStation(  0);
        assertEquals(expected, actual);
    }
    }

