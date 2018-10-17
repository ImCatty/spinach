package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "plate_asian_info")
@Component
public class PlateAsianInfo {
    @Id
    private Integer id;

    /**
     * 亚赔信息ID
     */
    @Column(name = "plate_asian_id")
    private String plateAsianId;

    /**
     * 博彩公司
     */
    private String company;

    /**
     * 亚盘初盘
     */
    @Column(name = "handicap_initial")
    private Float handicapInitial;

    /**
     * 上盘初盘赔率
     */
    @Column(name = "up_initial")
    private Float upInitial;

    /**
     * 下盘初盘赔率
     */
    @Column(name = "down_initial")
    private Float downInitial;

    /**
     * 亚盘临场
     */
    @Column(name = "handicap_presence")
    private Float handicapPresence;

    /**
     * 上盘临场赔率
     */
    @Column(name = "up_presence")
    private Float upPresence;

    /**
     * 下盘临场赔率
     */
    @Column(name = "down_presence")
    private Float downPresence;

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
     * 获取亚赔信息ID
     *
     * @return plate_asian_id - 亚赔信息ID
     */
    public String getPlateAsianId() {
        return plateAsianId;
    }

    /**
     * 设置亚赔信息ID
     *
     * @param plateAsianId 亚赔信息ID
     */
    public void setPlateAsianId(String plateAsianId) {
        this.plateAsianId = plateAsianId;
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
     * 获取亚盘初盘
     *
     * @return handicap_initial - 亚盘初盘
     */
    public Float getHandicapInitial() {
        return handicapInitial;
    }

    /**
     * 设置亚盘初盘
     *
     * @param handicapInitial 亚盘初盘
     */
    public void setHandicapInitial(Float handicapInitial) {
        this.handicapInitial = handicapInitial;
    }

    /**
     * 获取上盘初盘赔率
     *
     * @return up_initial - 上盘初盘赔率
     */
    public Float getUpInitial() {
        return upInitial;
    }

    /**
     * 设置上盘初盘赔率
     *
     * @param upInitial 上盘初盘赔率
     */
    public void setUpInitial(Float upInitial) {
        this.upInitial = upInitial;
    }

    /**
     * 获取下盘初盘赔率
     *
     * @return down_initial - 下盘初盘赔率
     */
    public Float getDownInitial() {
        return downInitial;
    }

    /**
     * 设置下盘初盘赔率
     *
     * @param downInitial 下盘初盘赔率
     */
    public void setDownInitial(Float downInitial) {
        this.downInitial = downInitial;
    }

    /**
     * 获取亚盘临场
     *
     * @return handicap_presence - 亚盘临场
     */
    public Float getHandicapPresence() {
        return handicapPresence;
    }

    /**
     * 设置亚盘临场
     *
     * @param handicapPresence 亚盘临场
     */
    public void setHandicapPresence(Float handicapPresence) {
        this.handicapPresence = handicapPresence;
    }

    /**
     * 获取上盘临场赔率
     *
     * @return up_presence - 上盘临场赔率
     */
    public Float getUpPresence() {
        return upPresence;
    }

    /**
     * 设置上盘临场赔率
     *
     * @param upPresence 上盘临场赔率
     */
    public void setUpPresence(Float upPresence) {
        this.upPresence = upPresence;
    }

    /**
     * 获取下盘临场赔率
     *
     * @return down_presence - 下盘临场赔率
     */
    public Float getDownPresence() {
        return downPresence;
    }

    /**
     * 设置下盘临场赔率
     *
     * @param downPresence 下盘临场赔率
     */
    public void setDownPresence(Float downPresence) {
        this.downPresence = downPresence;
    }
}