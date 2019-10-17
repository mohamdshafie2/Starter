package com.ds.session.session5.forked;

public class CurrencyTransfer {
    private int defaultFractionDigits;
    private Integer costUnitFractionDigits;
    private char[] fractionSeparator;
    private Integer costLineFractionDigits;
    private Integer priceLineFractionDigits;
    private Integer priceUnitFractionDigits;

    public int getDefaultFractionDigits() {
        return defaultFractionDigits;
    }

    public Integer getCostUnitFractionDigits() {
        return costUnitFractionDigits;
    }

    public char[] getFractionSeparator() {
        return fractionSeparator;
    }

    public Integer getCostLineFractionDigits() {
        return costLineFractionDigits;
    }

    public Integer getPriceLineFractionDigits() {
        return priceLineFractionDigits;
    }

    public Integer getPriceUnitFractionDigits() {
        return priceUnitFractionDigits;
    }
}
