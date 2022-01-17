package model;

import java.math.BigDecimal;

/**
 * 基于 价格 成交量 变化
 */
public class ExtK extends BaseK{

    //基于上个周期计算
    private BigDecimal priceAmount;//涨跌额
    private BigDecimal pricePercent;//涨跌幅
    private int priceSide;//-1 下跌, 0 平盘, 1 上涨

    //基于上个周期计算
    private BigDecimal volAmount;//成交量变化额
    private BigDecimal volPercent;//成交量变化幅度
    private int volSide;//-1 下跌, 0 平盘, 1 上涨

    //基于上个周期计算
    private BigDecimal amtAmount;//成交额变化额
    private BigDecimal amtPercent;//成交额变化幅度
    private int amtSide;//-1 下跌, 0 平盘, 1 上涨

}
