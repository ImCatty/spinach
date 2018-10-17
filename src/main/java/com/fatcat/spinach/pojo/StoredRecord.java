package com.fatcat.spinach.pojo;

import java.util.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "stored_record")
@Component
public class StoredRecord {
    /**
     * 存储excel名
     */
    @Id
    @Column(name = "record_name")
    private String recordName;

    /**
     * 存储状态：1：完成；0：未完成；2：更新
     */
    @Column(name = "record_status")
    private Integer recordStatus;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取存储excel名
     *
     * @return record_name - 存储excel名
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * 设置存储excel名
     *
     * @param recordName 存储excel名
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * 获取存储状态：1：完成；0：未完成；2：更新
     *
     * @return record_status - 存储状态：1：完成；0：未完成；2：更新
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置存储状态：1：完成；0：未完成；2：更新
     *
     * @param recordStatus 存储状态：1：完成；0：未完成；2：更新
     */
    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}