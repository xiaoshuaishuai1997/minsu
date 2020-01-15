package com.zs.dto;

public class yhu {

    private Integer id;//用户id
    private String  iphonename;//用户手机号
    private String  mima;//用户密码
    private Integer  shangpinid;//用户商品表id
    private String  txiang;//用户头像
    private String nicheng;//用户昵称

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIphonename() {
        return iphonename;
    }

    public void setIphonename(String iphonename) {
        this.iphonename = iphonename;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public Integer getShangpinid() {
        return shangpinid;
    }

    public void setShangpinid(Integer shangpinid) {
        this.shangpinid = shangpinid;
    }

    public String getTxiang() {
        return txiang;
    }

    public void setTxiang(String txiang) {
        this.txiang = txiang;
    }
}
