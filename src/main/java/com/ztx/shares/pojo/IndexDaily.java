package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndexDaily {
    int id;
    String tsCode;
    String tradeDate;
    Double close;
    Double open;
    Double high;
    Double low;
    Double preClose;
    Double change;
    Double pctChg;
    Double vol;
    Double amount;
}
