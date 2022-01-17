package model.constant;

public enum EnumPeriod {

    PS1("1秒", 1),

    PM1("1分钟", 60),

    PM3("3分钟", 60 * 3),

    PM5("5分钟", 60 * 5),

    PM30("30分钟", 60 * 30),

    PH1("1小时", 60 * 60),

    PH2("2小时", 60 * 60 * 2),

    PH4("4小时", 60 * 60 * 4),

    PH8("8小时", 60 * 60 * 8),

    PH12("12小时", 60 * 60 * 12),

    PD1("1天", 60 * 60 * 24),

    PD3("3天", 60 * 60 * 24 * 3),

    PW1("1周", 60 * 60 * 24 * 7),

    PMM1("1月", 60 * 60 * 24 * 30),

    PMM3("3月", 60 * 60 * 24 * 90),

    PY1("1年", 60 * 60 * 24 * 250);

    private EnumPeriod(String name, int period) {
        this.name = name;
        this.period = period;
    }

    private String name;
    private int period;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
