/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-05      1.0          初始版本
 */
public abstract class Clock {
    private final int UTC_OFFSET = 0;

    private int localTime = 0;

    public abstract void setLocalTime(int localTime);
}
