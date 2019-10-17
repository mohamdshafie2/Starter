// --------------------------------------------------------------------------------
// Copyright 2002-2019 Echo Three, LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// --------------------------------------------------------------------------------

package com.ds.session.session5.forked;

import java.util.Formatter;

public class AmountUtils {

    private AmountUtils() {
        super();
    }

    private static class AmountUtilsHolder {
        static AmountUtils instance = new AmountUtils();
    }

    public static AmountUtils getInstance() {
        return AmountUtilsHolder.instance;
    }

    public String formatAmount(CurrencyTransfer currency, Integer amount) {
        String result = null;

        if(amount != null) {
            int fractionDigits = currency.getDefaultFractionDigits();

            if(fractionDigits == 0) {
                result = amount.toString();
            } else {
                int rawAmount = amount;
                int i = IntMath.checkedPow(10, fractionDigits);
                StringBuilder builtResult = new StringBuilder().append(rawAmount / i).append(currency.getFractionSeparator());
                StringBuilder formatString = new StringBuilder().append("%0").append(fractionDigits).append("d");

                new Formatter(builtResult).format(formatString.toString(), Math.abs(rawAmount) % i);
                result = builtResult.toString();
            }
        }

        return result;
    }

    public String formatPriceUnit(CurrencyTransfer currency, Integer priceUnit) {
        String result = null;

        if(priceUnit != null) {
            Integer priceUnitFractionDigits = currency.getPriceUnitFractionDigits();
            int fractionDigits = priceUnitFractionDigits == null ? 0 : priceUnitFractionDigits;

            if(fractionDigits == 0) {
                result = priceUnit.toString();
            } else {
                int rawPriceUnit = priceUnit;
                int i = IntMath.checkedPow(10, fractionDigits);
                StringBuilder builtResult = new StringBuilder().append(rawPriceUnit / i).append(currency.getFractionSeparator());
                StringBuilder formatString = new StringBuilder().append("%0").append(fractionDigits).append("d");

                new Formatter(builtResult).format(formatString.toString(), Math.abs(rawPriceUnit) % i);
                result = builtResult.toString();
            }
        }

        return result;
    }

    public String formatPriceLine(CurrencyTransfer currency, Integer priceLine) {
        String result = null;

        if(priceLine != null) {
            Integer priceLineFractionDigits = currency.getPriceLineFractionDigits();
            int fractionDigits = priceLineFractionDigits == null ? 0 : priceLineFractionDigits;

            if(fractionDigits == 0) {
                result = priceLine.toString();
            } else {
                int rawPriceLine = priceLine;
                int i = IntMath.checkedPow(10, fractionDigits);
                StringBuilder builtResult = new StringBuilder().append(rawPriceLine / i).append(currency.getFractionSeparator());
                StringBuilder formatString = new StringBuilder().append("%0").append(fractionDigits).append('d');

                new Formatter(builtResult).format(formatString.toString(), Math.abs(rawPriceLine) % i);
                result = builtResult.toString();
            }
        }

        return result;
    }

    public String formatCostUnit(CurrencyTransfer currency, Integer costUnit) {
        String result = null;

        if(costUnit != null) {
            Integer costUnitFractionDigits = currency.getCostUnitFractionDigits();
            int fractionDigits = costUnitFractionDigits == null ? 0 : costUnitFractionDigits;

            if(fractionDigits == 0) {
                result = costUnit.toString();
            } else {
                int rawCostUnit = costUnit;
                int i = IntMath.checkedPow(10, fractionDigits);
                StringBuilder builtResult = new StringBuilder().append(rawCostUnit / i).append(currency.getFractionSeparator());
                StringBuilder formatString = new StringBuilder().append("%0").append(fractionDigits).append('d');

                new Formatter(builtResult).format(formatString.toString(), Math.abs(rawCostUnit) % i);
                result = builtResult.toString();
            }
        }

        return result;
    }

    public String formatCostLine(CurrencyTransfer currency, Integer costLine) {
        String result = null;

        if(costLine != null) {
            Integer costLineFractionDigits = currency.getCostLineFractionDigits();
            int fractionDigits = costLineFractionDigits == null ? 0 : costLineFractionDigits;

            if(fractionDigits == 0) {
                result = costLine.toString();
            } else {
                int rawCostLine = costLine;
                int i = IntMath.checkedPow(10, fractionDigits);
                StringBuilder builtResult = new StringBuilder().append(rawCostLine / i).append(currency.getFractionSeparator());
                StringBuilder formatString = new StringBuilder().append("%0").append(fractionDigits).append('d');

                new Formatter(builtResult).format(formatString.toString(), Math.abs(rawCostLine) % i);
                result = builtResult.toString();
            }
        }

        return result;
    }

    public AmountFormatter getAmountFormatter(CurrencyTransfer currency, AmountFormatType amountFormatType) {
        return new AmountFormatter(currency, amountFormatType);
    }
    
}
