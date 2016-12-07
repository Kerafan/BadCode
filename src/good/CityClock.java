package good;


/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-07      1.0          初始版本
 */
public class CityClock extends Clock {
    private int utcZeroTime;

    //TODO-working-on：这里有个传入参数utcOffset，意味着也会有个成员变量叫utOffset，与PhoneClokc的重复了
    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
