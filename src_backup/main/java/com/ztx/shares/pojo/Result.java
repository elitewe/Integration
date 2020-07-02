package com.ztx.shares.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {
    private String msg;

    private boolean success;

    private T detail;

    public Result() {
    }

    public Result(boolean success) { //status:true/false
        msg = "";
        this.success = success;
        this.detail = null;
    }

    public Result(boolean success, T detail) {
        msg = "";
        this.success = success;
        this.detail = detail;
    }
}
