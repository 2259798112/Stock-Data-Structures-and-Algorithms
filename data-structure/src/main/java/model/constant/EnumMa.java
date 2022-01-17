package model.constant;

public enum EnumMa {

    Ma5("5 period avg", 5),
    Ma10("10 period avg", 10),
    Ma20("20 period avg", 20),
    Ma30("30 period avg", 30),
    Ma60("60 period avg", 60),
    Ma120("120 period avg", 120),
    Ma250("250 period avg", 250);

    private EnumMa(String name, int period) {
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
