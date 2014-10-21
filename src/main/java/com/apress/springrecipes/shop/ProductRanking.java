package com.apress.springrecipes.shop;

import java.util.Date;

/**
 * Created by Matrix on 09.10.2014.
 */
public class ProductRanking {
    private Product bestSeller;
    private Date fromDate;
    private Date toDate;

    public Product getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Product bestSeller) {
        this.bestSeller = bestSeller;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
