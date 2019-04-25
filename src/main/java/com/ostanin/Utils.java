package com.ostanin;

import java.math.BigInteger;

public class Utils {


    public String concatenateWords (String firstString, String secondString) {
        return firstString.concat(secondString);
    }

    public BigInteger computeFactorial (long number) {

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
