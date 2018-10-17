package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "double_result_info")
@Component
public class DoubleResultInfo {
    @Id
    private Integer id;

    /**
     * 半全场信息ID
     */
    @Column(name = "double_result_id")
    private String doubleResultId;

    /**
     * 博彩公司
     */
    private String company;

    /**
     * 胜胜赔率
     */
    @Column(name = "home_home")
    private Float homeHome;

    /**
     * 胜平赔率
     */
    @Column(name = "home_draw")
    private Float homeDraw;

    /**
     * 胜负赔率
     */
    @Column(name = "home_away")
    private Float homeAway;

    /**
     * 平胜赔率
     */
    @Column(name = "draw_home")
    private Float drawHome;

    /**
     * 平平赔率
     */
    @Column(name = "draw_draw")
    private Float drawDraw;

    /**
     * 平负赔率
     */
    @Column(name = "draw_away")
    private Float drawAway;

    /**
     * 负胜赔率
     */
    @Column(name = "away_home")
    private Float awayHome;

    /**
     * 负平赔率
     */
    @Column(name = "away_draw")
    private Float awayDraw;

    /**
     * 负负赔率
     */
    @Column(name = "away_away")
    private Float awayAway;

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
     * 获取半全场信息ID
     *
     * @return double_result_id - 半全场信息ID
     */
    public String getDoubleResultId() {
        return doubleResultId;
    }

    /**
     * 设置半全场信息ID
     *
     * @param doubleResultId 半全场信息ID
     */
    public void setDoubleResultId(String doubleResultId) {
        this.doubleResultId = doubleResultId;
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
     * 获取胜胜赔率
     *
     * @return home_home - 胜胜赔率
     */
    public Float getHomeHome() {
        return homeHome;
    }

    /**
     * 设置胜胜赔率
     *
     * @param homeHome 胜胜赔率
     */
    public void setHomeHome(Float homeHome) {
        this.homeHome = homeHome;
    }

    /**
     * 获取胜平赔率
     *
     * @return home_draw - 胜平赔率
     */
    public Float getHomeDraw() {
        return homeDraw;
    }

    /**
     * 设置胜平赔率
     *
     * @param homeDraw 胜平赔率
     */
    public void setHomeDraw(Float homeDraw) {
        this.homeDraw = homeDraw;
    }

    /**
     * 获取胜负赔率
     *
     * @return home_away - 胜负赔率
     */
    public Float getHomeAway() {
        return homeAway;
    }

    /**
     * 设置胜负赔率
     *
     * @param homeAway 胜负赔率
     */
    public void setHomeAway(Float homeAway) {
        this.homeAway = homeAway;
    }

    /**
     * 获取平胜赔率
     *
     * @return draw_home - 平胜赔率
     */
    public Float getDrawHome() {
        return drawHome;
    }

    /**
     * 设置平胜赔率
     *
     * @param drawHome 平胜赔率
     */
    public void setDrawHome(Float drawHome) {
        this.drawHome = drawHome;
    }

    /**
     * 获取平平赔率
     *
     * @return draw_draw - 平平赔率
     */
    public Float getDrawDraw() {
        return drawDraw;
    }

    /**
     * 设置平平赔率
     *
     * @param drawDraw 平平赔率
     */
    public void setDrawDraw(Float drawDraw) {
        this.drawDraw = drawDraw;
    }

    /**
     * 获取平负赔率
     *
     * @return draw_away - 平负赔率
     */
    public Float getDrawAway() {
        return drawAway;
    }

    /**
     * 设置平负赔率
     *
     * @param drawAway 平负赔率
     */
    public void setDrawAway(Float drawAway) {
        this.drawAway = drawAway;
    }

    /**
     * 获取负胜赔率
     *
     * @return away_home - 负胜赔率
     */
    public Float getAwayHome() {
        return awayHome;
    }

    /**
     * 设置负胜赔率
     *
     * @param awayHome 负胜赔率
     */
    public void setAwayHome(Float awayHome) {
        this.awayHome = awayHome;
    }

    /**
     * 获取负平赔率
     *
     * @return away_draw - 负平赔率
     */
    public Float getAwayDraw() {
        return awayDraw;
    }

    /**
     * 设置负平赔率
     *
     * @param awayDraw 负平赔率
     */
    public void setAwayDraw(Float awayDraw) {
        this.awayDraw = awayDraw;
    }

    /**
     * 获取负负赔率
     *
     * @return away_away - 负负赔率
     */
    public Float getAwayAway() {
        return awayAway;
    }

    /**
     * 设置负负赔率
     *
     * @param awayAway 负负赔率
     */
    public void setAwayAway(Float awayAway) {
        this.awayAway = awayAway;
    }
}