package good;

/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-07      1.0          初始版本
 */
public class CityClock {
    private int utcOffset;

    //TODO：这里有个传入参数utcOffset，意味着也会有个成员变量叫utOffset，与PhoneClokc的重复了
    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    //TODO-working-on：这里的1与单元测试中的期望值1重复了
    public int getTime() {
        return this.utcOffset + this.utcZeroTime;
    }
}
