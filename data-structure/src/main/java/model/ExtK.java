package model;

import java.math.BigDecimal;

public class ExtK extends BaseK{

    //基于上个周期计算
    private BigDecimal upDownAmount;//涨跌额
    private BigDecimal upDownPercent;//涨跌幅

    private int side;//-1 下跌, 0 平盘, 1 上涨

}
