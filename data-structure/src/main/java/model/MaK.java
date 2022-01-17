package model;

import java.math.BigDecimal;

/**
 * 基于均线系统的K线
 */
public class MaK extends BaseK{
    private BigDecimal ma5; // 5日均线
    private BigDecimal ma10;
    private BigDecimal ma20;
    private BigDecimal ma30;
    private BigDecimal ma60;
    private BigDecimal ma120;
    private BigDecimal ma250;
}
