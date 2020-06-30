package com.ztx.shares.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MStock {
    int id;
    String tsCode; //TS代码
    String symbol; //股票代码
    String name; // 股票名称
    String area; //所在地域
    String industry; //所属行业
    String fullname; //股票全称
    String enname; //英文全称
    String market; //市场类型（主板/中小板/创业板/科创板）
    String exchange; //交易所代码
    String currType; //交易货币
//    String listStatus; //上市状态： L上市 D退市 P暂停上市
    String listDate; //上市日期
//    String delistDate; //退市日期
    String isHs; //是否沪深港通标的，N否 H沪股通 S深股通
}
