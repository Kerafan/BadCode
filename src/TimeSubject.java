import java.util.HashMap;
import java.util.Map;

/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-05      1.0          初始版本
 */
public abstract class TimeSubject {
    protected Map<String, Clock> clocks = new HashMap<String, Clock>();

    public void attach(String cityName, Clock clock) {
        clocks.put(cityName, clock);
    }

    public void detach(String cityName) {
        clocks.remove(cityName);
    }

    public abstract void notifyAllClocks();
}
