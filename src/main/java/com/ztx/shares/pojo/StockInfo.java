package com.ztx.shares.pojo;

import java.util.Date;

public class StockInfo {
    private Integer id; //infoId

    private String stockId; //绑定股票id

    private Date day; //交易日期

    private String open; //开盘价

    private String high; //最高价

    private String low; //最低价

    private String volume;

    private String close; //收盘价

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "id=" + id +
                ", stockId='" + stockId + '\'' +
                ", day=" + day +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", volume='" + volume + '\'' +
                ", close='" + close + '\'' +
                '}';
    }
}