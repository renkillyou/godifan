package com.entity;

public class GdvCar {
    private Integer cId;

    private Integer userId;

    private String productid;

    private Integer productprice;

    private String productname;

    private String imgsrc;

    private Integer cNumber;

    private Long cPrice;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }

    public Integer getcNumber() {
        return cNumber;
    }

    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

    public Long getcPrice() {
        return cPrice;
    }

    public void setcPrice(Long cPrice) {
        this.cPrice = cPrice;
    }

    @Override
    public String toString() {
        return "GdvCar{" +
                "cId=" + cId +
                ", userId=" + userId +
                ", productid='" + productid + '\'' +
                ", productprice=" + productprice +
                ", productname='" + productname + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", cNumber=" + cNumber +
                ", cPrice=" + cPrice +
                '}';
    }
}