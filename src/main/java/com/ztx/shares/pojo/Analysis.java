package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Analysis {
    String code;
    Double pctChg; //半年内总涨跌幅
    int up;  //上涨天数
    int down;  //下跌天数
    Double profit;  //近半年净利润（亿元）
    Double profitRate;  //净资产收益率（亿元）
    Double recommend; //推荐指数，范围（0~100）

    public Analysis(String code, Double pctChg, int up, int down, Double profit, Double profitRate, Double recommend) {
        this.code = code;
        this.pctChg = pctChg;
        this.up = up;
        this.down = down;
        this.profit = profit;
        this.profitRate = profitRate;
        this.recommend = recommend;
    }
}
