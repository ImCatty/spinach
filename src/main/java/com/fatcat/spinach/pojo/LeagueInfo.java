package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "league_info")
@Component
public class LeagueInfo {
    @Id
    private Integer id;

    /**
     * 联赛ID
     */
    @Column(name = "league_id")
    private String leagueId;

    /**
     * 轮次
     */
    private Integer round;

    /**
     * 欧赔ID
     */
    @Column(name = "plate_europe_id")
    private String plateEuropeId;

    /**
     * 亚赔ID
     */
    @Column(name = "plate_asian_id")
    private String plateAsianId;

    /**
     * 大小球ID
     */
    @Column(name = "ball_size_id")
    private String ballSizeId;

    /**
     * 半全场ID
     */
    @Column(name = "double_result_id")
    private String doubleResultId;

    /**
     * 比赛信息ID
     */
    @Column(name = "match_id")
    private String matchId;

    /**
     * 赛果信息ID
     */
    @Column(name = "match_result_id")
    private String matchResultId;

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
     * 获取联赛ID
     *
     * @return league_id - 联赛ID
     */
    public String getLeagueId() {
        return leagueId;
    }

    /**
     * 设置联赛ID
     *
     * @param leagueId 联赛ID
     */
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * 获取轮次
     *
     * @return round - 轮次
     */
    public Integer getRound() {
        return round;
    }

    /**
     * 设置轮次
     *
     * @param round 轮次
     */
    public void setRound(Integer round) {
        this.round = round;
    }

    /**
     * 获取欧赔ID
     *
     * @return plate_europe_id - 欧赔ID
     */
    public String getPlateEuropeId() {
        return plateEuropeId;
    }

    /**
     * 设置欧赔ID
     *
     * @param plateEuropeId 欧赔ID
     */
    public void setPlateEuropeId(String plateEuropeId) {
        this.plateEuropeId = plateEuropeId;
    }

    /**
     * 获取亚赔ID
     *
     * @return plate_asian_id - 亚赔ID
     */
    public String getPlateAsianId() {
        return plateAsianId;
    }

    /**
     * 设置亚赔ID
     *
     * @param plateAsianId 亚赔ID
     */
    public void setPlateAsianId(String plateAsianId) {
        this.plateAsianId = plateAsianId;
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
     * 获取半全场ID
     *
     * @return double_result_id - 半全场ID
     */
    public String getDoubleResultId() {
        return doubleResultId;
    }

    /**
     * 设置半全场ID
     *
     * @param doubleResultId 半全场ID
     */
    public void setDoubleResultId(String doubleResultId) {
        this.doubleResultId = doubleResultId;
    }

    /**
     * 获取比赛信息ID
     *
     * @return match_id - 比赛信息ID
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * 设置比赛信息ID
     *
     * @param matchId 比赛信息ID
     */
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * 获取赛果信息ID
     *
     * @return match_result_id - 赛果信息ID
     */
    public String getMatchResultId() {
        return matchResultId;
    }

    /**
     * 设置赛果信息ID
     *
     * @param matchResultId 赛果信息ID
     */
    public void setMatchResultId(String matchResultId) {
        this.matchResultId = matchResultId;
    }
}