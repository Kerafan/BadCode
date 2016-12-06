/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-06      1.0          初始版本
 */
public class UtcTime extends TimeSubject {
    private int utcZeroTime;

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    @Override
    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()) {
            clock.setLocalTimeFromUtcZeroTime(this.utcZeroTime);
        }
    }

    public void printTimeOfAllClocks() {
        for (String clockName : super.clocks.keySet()) {
            System.out.println(clockName + ":" + super.clocks.get(clockName).getTime());
        }
    }
}
