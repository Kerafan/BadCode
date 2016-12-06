/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-05      1.0          初始版本
 */
public abstract class Clock {
    protected int UTC_OFFSET = 0;

    protected int localTime = 0;

    public Clock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    public abstract void setLocalTime(int localTime);

    public String getTime() {
        return String.valueOf(this.localTime);
    }

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime = Clock.makeHourWithin0To23(utcZeroTime + this.UTC_OFFSET);
    }

    private static int makeHourWithin0To23(int hour) {
        return (hour + 24) % 24;
    }
}
