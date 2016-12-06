/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-06      1.0          初始版本
 */
public class UtcTime extends TimeSubject {
    @Override
    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }
}
