package com.domain;

import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class OrderInfo implements Serializable {
    private Integer id;
    private BigDecimal money;
    private Integer userid;
    private String address;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", money=" + money +
                ", userid='" + userid + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
