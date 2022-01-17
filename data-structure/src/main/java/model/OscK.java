package model;

import java.math.BigDecimal;

/**
 * 基于波动率
 */
public class OscK extends BaseK {
    private long start;//开始
    private long end;//结束  (默认 最新ts)
    private BigDecimal[] priceOsc;//每日波动率
    private BigDecimal[] upDownBlock;//上下轨区间 0x(ts) 1y(price)
    
    private BigDecimal[] upDownLine;//上下轨line, length=8
                                    //高点拟合 up (upx1,upy1) (upx2,upy2)
                                    //低点拟合 dn (dnx1,dny1) (dnx2,dny2)
}
