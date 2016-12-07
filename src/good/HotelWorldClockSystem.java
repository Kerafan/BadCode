package good;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: 文件名.java
 * Function: 功能
 * History:
 * <author>      <time>        <version>    <desc>
 * -------------------------------------------------------------------
 * Lijinsheng    2016-12-07      1.0          初始版本
 */
public class HotelWorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {

    }

    public List<CityClock> getClocks() {
        return this.cityClocks;
    }
}
