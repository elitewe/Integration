package com.ztx.shares.pojo;

public class Stock {
    private String stockId; //唯一id

    private String shareName; //股票名称

    private String companyName; //公司名

    private String companyShort; //公司简称

    private Integer status; //似乎没用到？

    private String shareCoding; //股票代码

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyShort() {
        return companyShort;
    }

    public void setCompanyShort(String companyShort) {
        this.companyShort = companyShort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getShareCoding() {
        return shareCoding;
    }

    public void setShareCoding(String shareCoding) {
        this.shareCoding = shareCoding;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId='" + stockId + '\'' +
                ", shareName='" + shareName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyShort='" + companyShort + '\'' +
                ", status=" + status +
                ", shareCoding='" + shareCoding + '\'' +
                '}';
    }
}