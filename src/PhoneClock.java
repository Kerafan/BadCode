/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-06      1.0          初始版本
 */
public class PhoneClock extends Clock {

    @Override
    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
