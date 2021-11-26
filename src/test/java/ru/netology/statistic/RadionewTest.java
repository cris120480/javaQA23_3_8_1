package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadionewTest {

    @Test
    public void increaseVolume() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(3);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume10() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }
    @Test
    public void increaseVolume9() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(9);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMinus1() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(-1);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume11() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(11);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumMax() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(9);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMaxValid() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }


    @Test
    public void reduceVolume() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(7);
        volume.reduceVolume();
        int actual = volume.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);

    }

    @Test
    public void reduceVolumeMin() {
        Radionew volume = new Radionew();
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseStation() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(7);
        Station.increaseStation();
        int actual = Station.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseStation10() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(10);
        Station.increaseStation();
        int actual = Station.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseStationMinus1() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(-1);
        Station.increaseStation();
        int actual = Station.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseStationMax() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(9);
        Station.increaseStation();
        int actual = Station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void reduceStation() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(4);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);

    }


    @Test
    public void reduceStation9() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(9);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void reduceStation8() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(8);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);

    }



    @Test
    public void reduceStationMin() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(0);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);

    }


    @Test
    public void reduceStationminus5() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(5);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);

    }


    @Test
    public void reduceStationminus11() {
        Radionew Station = new Radionew();
        Station.setCurrentStation(11);
        Station.reduceStation();
        int actual = Station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);

    }


}