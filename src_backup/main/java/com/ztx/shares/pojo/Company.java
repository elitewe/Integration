package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {
    int id;
    String tsCode; //股票代码
    String exchange; //交易所代码 ，SSE上交所 SZSE深交所
    String chairman; //法人代表
    String manager; //总经理
    String secretary; //董秘
    String regCapital; //注册资本
    String setupDate; //注册日期
    String province; //所在省份
    String city; //所在城市
    String website; //公司主页
    String email; //电子邮件
    String employees; //员工人数
}
