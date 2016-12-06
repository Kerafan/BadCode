/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-06      1.0          初始版本
 */
public class HotelWorldClocksRunner {
    public static void main(String[] args) {
        TimeSubject utcTime = new UtcTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("sydney", new CityClock(10));
        utcTime.attach("newYork", new CityClock(-5));
        Clock phoneClock = new PhoneClock(utcTime);
        phoneClock.setLocalTime(9);
        utcTime.printTimeOfAllClocks();
    }
}
