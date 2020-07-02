package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weekly {
    int id;
    String tsCode;
    String tradeDate;
    Double open;
    Double high;
    Double low;
    Double close;
    Double preClose;
    Double change;
    Double pctChg;
    Double vol;
    Double amount;
}
