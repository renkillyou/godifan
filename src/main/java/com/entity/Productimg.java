package com.entity;

public class Productimg implements java.io.Serializable{
    private Integer imgid;

    private String imgname;

    private String imgsrc;

    private Integer isbig;

    private String productid;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }

    public Integer getIsbig() {
        return isbig;
    }

    public void setIsbig(Integer isbig) {
        this.isbig = isbig;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    @Override
    public String toString() {
        return "Productimg{" +
                "imgid=" + imgid +
                ", imgname='" + imgname + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", isbig=" + isbig +
                ", productid='" + productid + '\'' +
                '}';
    }
}