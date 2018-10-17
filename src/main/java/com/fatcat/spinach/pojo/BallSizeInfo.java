package com.fatcat.spinach.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "ball_size_info")
@Component
public class BallSizeInfo {
    @Id
    private Integer id;

    /**
     * 大小球ID
     */
    @Column(name = "ball_size_id")
    private String ballSizeId;

    /**
     * 博彩公司
     */
    private String company;

    /**
     * 大小球初盘
     */
    @Column(name = "double_initial")
    private Float doubleInitial;

    /**
     * 大球赔率初盘
     */
    @Column(name = "more_initial")
    private Float moreInitial;

    /**
     * 小球赔率初盘
     */
    @Column(name = "less_initial")
    private Float lessInitial;

    /**
     * 初盘时间
     */
    @Column(name = "initial_time")
    private Date initialTime;

    /**
     * 大小球临场
     */
    @Column(name = "double_presence")
    private Float doublePresence;

    /**
     * 大球赔率临场
     */
    @Column(name = "more_presence")
    private Float morePresence;

    /**
     * 小球赔率临场
     */
    @Column(name = "less_presence")
    private Float lessPresence;

    /**
     * 临盘时间
     */
    @Column(name = "presence_time")
    private Date presenceTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取大小球ID
     *
     * @return ball_size_id - 大小球ID
     */
    public String getBallSizeId() {
        return ballSizeId;
    }

    /**
     * 设置大小球ID
     *
     * @param ballSizeId 大小球ID
     */
    public void setBallSizeId(String ballSizeId) {
        this.ballSizeId = ballSizeId;
    }

    /**
     * 获取博彩公司
     *
     * @return company - 博彩公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置博彩公司
     *
     * @param company 博彩公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取大小球初盘
     *
     * @return double_initial - 大小球初盘
     */
    public Float getDoubleInitial() {
        return doubleInitial;
    }

    /**
     * 设置大小球初盘
     *
     * @param doubleInitial 大小球初盘
     */
    public void setDoubleInitial(Float doubleInitial) {
        this.doubleInitial = doubleInitial;
    }

    /**
     * 获取大球赔率初盘
     *
     * @return more_initial - 大球赔率初盘
     */
    public Float getMoreInitial() {
        return moreInitial;
    }

    /**
     * 设置大球赔率初盘
     *
     * @param moreInitial 大球赔率初盘
     */
    public void setMoreInitial(Float moreInitial) {
        this.moreInitial = moreInitial;
    }

    /**
     * 获取小球赔率初盘
     *
     * @return less_initial - 小球赔率初盘
     */
    public Float getLessInitial() {
        return lessInitial;
    }

    /**
     * 设置小球赔率初盘
     *
     * @param lessInitial 小球赔率初盘
     */
    public void setLessInitial(Float lessInitial) {
        this.lessInitial = lessInitial;
    }

    /**
     * 获取初盘时间
     *
     * @return initial_time - 初盘时间
     */
    public Date getInitialTime() {
        return initialTime;
    }

    /**
     * 设置初盘时间
     *
     * @param initialTime 初盘时间
     */
    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }

    /**
     * 获取大小球临场
     *
     * @return double_presence - 大小球临场
     */
    public Float getDoublePresence() {
        return doublePresence;
    }

    /**
     * 设置大小球临场
     *
     * @param doublePresence 大小球临场
     */
    public void setDoublePresence(Float doublePresence) {
        this.doublePresence = doublePresence;
    }

    /**
     * 获取大球赔率临场
     *
     * @return more_presence - 大球赔率临场
     */
    public Float getMorePresence() {
        return morePresence;
    }

    /**
     * 设置大球赔率临场
     *
     * @param morePresence 大球赔率临场
     */
    public void setMorePresence(Float morePresence) {
        this.morePresence = morePresence;
    }

    /**
     * 获取小球赔率临场
     *
     * @return less_presence - 小球赔率临场
     */
    public Float getLessPresence() {
        return lessPresence;
    }

    /**
     * 设置小球赔率临场
     *
     * @param lessPresence 小球赔率临场
     */
    public void setLessPresence(Float lessPresence) {
        this.lessPresence = lessPresence;
    }

    /**
     * 获取临盘时间
     *
     * @return presence_time - 临盘时间
     */
    public Date getPresenceTime() {
        return presenceTime;
    }

    /**
     * 设置临盘时间
     *
     * @param presenceTime 临盘时间
     */
    public void setPresenceTime(Date presenceTime) {
        this.presenceTime = presenceTime;
    }
}