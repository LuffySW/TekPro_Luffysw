package org.example.pricing;

import org.example.Movie;

public class RegularPrice extends Price{
    @Override
    public Integer getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public Double getCharge(Integer daysRented) {
        Double result = 2.0;
        if(daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
