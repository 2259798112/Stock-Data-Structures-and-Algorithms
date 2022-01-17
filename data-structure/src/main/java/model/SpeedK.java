package model;

import java.math.BigDecimal;

/**
 * 基于动量指标
 */
public class SpeedK extends BaseK {
    private int interval;//统计周期
    private BigDecimal speedPrice;//价格变化量
    private BigDecimal speedVol;//成交量绝对增量
    private BigDecimal speedAmt;//成交额绝对增量

    private int ma;// ex: 最近90个period ma
    private BigDecimal maVol;//ma成交量
    private BigDecimal maAmt;//ma成交额

    private int maTopN;//ex: 最近90个period top20% ma (18)
    private BigDecimal maTopVol;//ma成交量topN
    private BigDecimal maTopAmt;//ma成交额topN


    private BigDecimal speedPricePercent; // 基于close[1] 上一个收盘 涨速
    private BigDecimal maTopVolPercent; // 基于topN vol 比例
    private BigDecimal maTopAmtPercent; // 基于topN Amt 比例

}
