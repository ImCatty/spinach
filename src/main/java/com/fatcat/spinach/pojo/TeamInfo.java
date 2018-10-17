package com.fatcat.spinach.pojo;

import java.util.Date;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "team_info")
@Component
public class TeamInfo {
    @Id
    private Integer id;

    /**
     * 球队信息ID
     */
    @Column(name = "team_id")
    private String teamId;

    /**
     * 赛季ID
     */
    @Column(name = "season_id")
    private String seasonId;

    /**
     * 球队基本信息ID
     */
    @Column(name = "team_base_id")
    private String teamBaseId;

    /**
     * 亚盘赢盘率（对初盘）
     */
    @Column(name = "asian_initial")
    private Float asianInitial;

    /**
     * 大小球赢盘率（对初盘）
     */
    @Column(name = "size_initial")
    private Float sizeInitial;

    /**
     * 亚盘赢盘率（对临场）
     */
    @Column(name = "asian_presence")
    private Float asianPresence;

    /**
     * 大小球赢盘率（对临场）
     */
    @Column(name = "size_presence")
    private Float sizePresence;

    /**
     * 胜率（连胜或者连负，连胜为+、连负为-）
     */
    @Column(name = "win_rate")
    private Float winRate;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取球队信息ID
     *
     * @return team_id - 球队信息ID
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置球队信息ID
     *
     * @param teamId 球队信息ID
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取赛季ID
     *
     * @return season_id - 赛季ID
     */
    public String getSeasonId() {
        return seasonId;
    }

    /**
     * 设置赛季ID
     *
     * @param seasonId 赛季ID
     */
    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    /**
     * 获取球队基本信息ID
     *
     * @return team_base_id - 球队基本信息ID
     */
    public String getTeamBaseId() {
        return teamBaseId;
    }

    /**
     * 设置球队基本信息ID
     *
     * @param teamBaseId 球队基本信息ID
     */
    public void setTeamBaseId(String teamBaseId) {
        this.teamBaseId = teamBaseId;
    }

    /**
     * 获取亚盘赢盘率（对初盘）
     *
     * @return asian_initial - 亚盘赢盘率（对初盘）
     */
    public Float getAsianInitial() {
        return asianInitial;
    }

    /**
     * 设置亚盘赢盘率（对初盘）
     *
     * @param asianInitial 亚盘赢盘率（对初盘）
     */
    public void setAsianInitial(Float asianInitial) {
        this.asianInitial = asianInitial;
    }

    /**
     * 获取大小球赢盘率（对初盘）
     *
     * @return size_initial - 大小球赢盘率（对初盘）
     */
    public Float getSizeInitial() {
        return sizeInitial;
    }

    /**
     * 设置大小球赢盘率（对初盘）
     *
     * @param sizeInitial 大小球赢盘率（对初盘）
     */
    public void setSizeInitial(Float sizeInitial) {
        this.sizeInitial = sizeInitial;
    }

    /**
     * 获取亚盘赢盘率（对临场）
     *
     * @return asian_presence - 亚盘赢盘率（对临场）
     */
    public Float getAsianPresence() {
        return asianPresence;
    }

    /**
     * 设置亚盘赢盘率（对临场）
     *
     * @param asianPresence 亚盘赢盘率（对临场）
     */
    public void setAsianPresence(Float asianPresence) {
        this.asianPresence = asianPresence;
    }

    /**
     * 获取大小球赢盘率（对临场）
     *
     * @return size_presence - 大小球赢盘率（对临场）
     */
    public Float getSizePresence() {
        return sizePresence;
    }

    /**
     * 设置大小球赢盘率（对临场）
     *
     * @param sizePresence 大小球赢盘率（对临场）
     */
    public void setSizePresence(Float sizePresence) {
        this.sizePresence = sizePresence;
    }

    /**
     * 获取胜率（连胜或者连负，连胜为+、连负为-）
     *
     * @return win_rate - 胜率（连胜或者连负，连胜为+、连负为-）
     */
    public Float getWinRate() {
        return winRate;
    }

    /**
     * 设置胜率（连胜或者连负，连胜为+、连负为-）
     *
     * @param winRate 胜率（连胜或者连负，连胜为+、连负为-）
     */
    public void setWinRate(Float winRate) {
        this.winRate = winRate;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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