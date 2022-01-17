package model;

import java.math.BigDecimal;

/**
 * 基础K线
 */
public class BaseK {
    private String code;
    private String name;

    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;

    private BigDecimal volume;//成交量 股数
    private BigDecimal amount;//成交额 金额

    private long ts;//开始时间
    private int period;//周期(单位秒)

}
