/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-06      1.0          初始版本
 */
public class CityClock extends Clock {

    public CityClock(int utcOffset) {
        super(utcOffset);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
