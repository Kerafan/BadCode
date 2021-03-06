package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-07      1.0          初始版本
 */
public class HotelWorldClockTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;

    @Before
    public void initialize() {
        this.hotelWorldClockSystem = new HotelWorldClockSystem();
        this.phoneClock = new PhoneClock(8);
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.attach(londonClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(1, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewWork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void
    the_time_of_clock_London_add_NewYork_should_be_1_and_20_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrage
        CityClock londonClock = new CityClock(0);
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(1, londonClock.getTime());
        Assert.assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_corrently_after_its_setTime_method_is_invoked() {
        // Arrage

        // Act
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(9, phoneClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock moscowClock = new CityClock(4);
        hotelWorldClockSystem.attach(moscowClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(5, moscowClock.getTime());
    }
}
