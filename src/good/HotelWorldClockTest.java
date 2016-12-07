package good;

import org.junit.Assert;
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
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(1, londonClock.getTime());
    }

    //TODO-working-on：目前只考虑了比UTC时间早的城市，后续需要考虑比UTC晚的城市
    @Test
    public void the_time_of_clock_NewWork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setCityClock(newYorkClock);
        phoneClock.setTime(9);

        // Assert
        Assert.assertEquals(20, newYorkClock.getTime());
    }
    //TODO：目前只考虑了一个城市，后续要考虑多个城市
}
