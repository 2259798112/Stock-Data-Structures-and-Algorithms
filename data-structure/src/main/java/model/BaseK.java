package model;

import java.math.BigDecimal;

public class BaseK {
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;

    private BigDecimal volume;//成交量 股数
    private BigDecimal amount;//成交额 金额

    private long ts;//开始时间
    private int period;//周期(秒级)

}
