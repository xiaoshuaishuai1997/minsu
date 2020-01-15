package com.zs.dto;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Document(indexName = "moviceindex",type = "action",shards = 3,replicas = 2)
public class shangpin{

    @Id
    private Integer spid;//商品id
    private Integer spyhid;//用户id
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spname;//商品名称
    @Field(type = FieldType.Integer,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private Integer spjiage;//商品价格
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  sptupian;//商品图片
    @Field(type = FieldType.Integer,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private Integer sprenshu;//房子可住人数说明
    @Field(type = FieldType.Integer,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private Integer spping;//房屋几平方说明
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spxuzhi;//客人须知说明
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  sptding;//退订策略说明
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spshichang;//预订时长须知
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  sptfang;//退房时间说明
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spshijian;//入住时间说明
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spliangdian;//亮点说明
    private Integer sppingjiaid;//评价id
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word",copyTo = "kaobei")
    private String  spweizhi;//房源位置
    private Integer spleixingid;//设施服务id,类型
    private Integer sprmenchengshi;//热门城市 1.上海2.北京3.成都4.广州5.杭州6.深圳

    public Integer getSpyhid() {
        return spyhid;
    }

    public void setSpyhid(Integer spyhid) {
        this.spyhid = spyhid;
    }

    public Integer getSprmenchengshi() {
        return sprmenchengshi;
    }

    public void setSprmenchengshi(Integer sprmenchengshi) {
        this.sprmenchengshi = sprmenchengshi;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Integer getSpjiage() {
        return spjiage;
    }

    public void setSpjiage(Integer spjiage) {
        this.spjiage = spjiage;
    }

    public String getSptupian() {
        return sptupian;
    }

    public void setSptupian(String sptupian) {
        this.sptupian = sptupian;
    }

    public Integer getSprenshu() {
        return sprenshu;
    }

    public void setSprenshu(Integer sprenshu) {
        this.sprenshu = sprenshu;
    }

    public Integer getSpping() {
        return spping;
    }

    public void setSpping(Integer spping) {
        this.spping = spping;
    }

    public String getSpxuzhi() {
        return spxuzhi;
    }

    public void setSpxuzhi(String spxuzhi) {
        this.spxuzhi = spxuzhi;
    }

    public String getSptding() {
        return sptding;
    }

    public void setSptding(String sptding) {
        this.sptding = sptding;
    }

    public String getSpshichang() {
        return spshichang;
    }

    public void setSpshichang(String spshichang) {
        this.spshichang = spshichang;
    }

    public String getSptfang() {
        return sptfang;
    }

    public void setSptfang(String sptfang) {
        this.sptfang = sptfang;
    }

    public String getSpshijian() {
        return spshijian;
    }

    public void setSpshijian(String spshijian) {
        this.spshijian = spshijian;
    }

    public String getSpliangdian() {
        return spliangdian;
    }

    public void setSpliangdian(String spliangdian) {
        this.spliangdian = spliangdian;
    }

    public Integer getSppingjiaid() {
        return sppingjiaid;
    }

    public void setSppingjiaid(Integer sppingjiaid) {
        this.sppingjiaid = sppingjiaid;
    }

    public String getSpweizhi() {
        return spweizhi;
    }

    public void setSpweizhi(String spweizhi) {
        this.spweizhi = spweizhi;
    }

    public Integer getSpleixingid() {
        return spleixingid;
    }

    public void setSpleixingid(Integer spleixingid) {
        this.spleixingid = spleixingid;
    }
}
