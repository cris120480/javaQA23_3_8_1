package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolume() {
            Radio volume = new Radio();
            int expected = 10;
            int actual = volume.increaseVolume(9);
            assertEquals(expected, actual);
        }

    @Test
    void reduceVolume() {
        Radio volume = new Radio();
        int expected = 2;
        int actual = volume.reduceVolume(  3);
        assertEquals(expected, actual);
    }
    @Test
    void increaseStation() {
        Radio volume = new Radio();
        int expected = 8;
        int actual = volume.increaseStation(7);
        assertEquals(expected, actual);
    }

    @Test
    void reduceStation() {
        Radio volume = new Radio();
        int expected = 3;
        int actual = volume.reduceStation(  4);
        assertEquals(expected, actual);
    }
    }

