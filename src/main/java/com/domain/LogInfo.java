package com.domain;

import java.io.Serializable;
import java.util.Date;


public class LogInfo implements Serializable {
    private Integer id;
    private Date createTime;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }
}
