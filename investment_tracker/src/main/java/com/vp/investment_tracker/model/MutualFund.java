package com.vp.investment_tracker.model;

public class MutualFund {
    private String name;
    private int units;
    private long currentValue;
    private long investedValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(long currentValue) {
        this.currentValue = currentValue;
    }

    public long getInvestedValue() {
        return investedValue;
    }

    public void setInvestedValue(long investedValue) {
        this.investedValue = investedValue;
    }

}
