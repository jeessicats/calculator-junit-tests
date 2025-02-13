package com.jeessicats.calculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public String calculateAnnuityPayment(String R, int t, String r, int n) {
        BigDecimal rn = new BigDecimal(r).divide(new BigDecimal(n));
        BigDecimal rnPlusOne = BigDecimal.ONE.add(rn);
        BigDecimal rnPlusOnePownt = rnPlusOne.pow(n * t);
        BigDecimal rnPlusOnePowntMinusOne = rnPlusOnePownt.subtract(BigDecimal.ONE);
        BigDecimal rnPlusOnePowntMinusOnern = rnPlusOnePowntMinusOne.divide(rn);
        BigDecimal RrnPlusOnePowntMinusOnern = rnPlusOnePowntMinusOnern.multiply(new BigDecimal(R));
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormat.format(RrnPlusOnePowntMinusOnern);
    }
}
