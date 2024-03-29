package com.example.SpringProjectDemo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Session)实体类
 *
 * @author makejava
 * @since 2021-05-18 10:36:24
 */
public class Session implements Serializable {
    private static final long serialVersionUID = -30169903209344656L;
    /**
    * 记录id
    */
    private Long id;
    /**
    * sessionID
    */
    private String sessionId;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * session创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}