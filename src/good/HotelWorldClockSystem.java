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
class HotelWorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<CityClock>();

    void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    List<CityClock> getClocks() {
        return this.cityClocks;
    }
}
