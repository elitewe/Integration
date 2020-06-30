package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Express {
    int id;
    String tsCode; //TS股票代码
    String annDate; //公告日期
    String endDate; //报告期
    String revenue; //营业收入（元）
    String operateProfit; //营业利润（元）
    String totalProfit; //利润总额（元）
    String nIncome; //净利润（元）
    String totalAssets; //总资产（元）
    String theemi; //股东权益合计(不含少数股东权益)(元)
    String dilutedEps; //每股收益(摊薄)(元)
    String dilutedRoe; //净资产收益率(摊薄)(%)
//    String yoyNetPRofit; //去年同期修正后净利润
//    String bps; //每股净资产
//    String perfSummary; //业绩简要说明
}
