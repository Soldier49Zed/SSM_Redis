package com.houx.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
public class UserRedPacket implements Serializable {

    private static final long serialVersionUID = -5617482065991830143L;

    private Long id;
    private Long redPacketId;
    private Long userId;
    private Double amount;
    private Timestamp gradTime;
    private String note;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getGradTime() {
        return gradTime;
    }

    public void setGradTime(Timestamp gradTime) {
        this.gradTime = gradTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
