package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Daily {
    int id;
    String tsCode; //股票代码
    String tradeDate; //交易日期
    double open; //开盘价
    double high; //最高价
    double low; //最低价
    double close; //收盘价
    double preClose; //昨收价
    double change; //涨跌额
    double pctChg; //涨跌幅
    double vol; //成交量（手）
    double amount; //成交额（千元）
}