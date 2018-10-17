package com.fatcat.spinach.pojo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "match_info")
@Component
public class MatchInfo {
    @Id
    private Integer id;

    /**
     * 比赛信息ID
     */
    @Column(name = "match_id")
    private String matchId;

    /**
     * 比赛时间
     */
    @Column(name = "match_time")
    private Date matchTime;

    /**
     * 主队ID
     */
    @Column(name = "home_id")
    private String homeId;

    /**
     * 主队排名
     */
    @Column(name = "home_standings")
    private Integer homeStandings;

    /**
     * 客队ID
     */
    @Column(name = "away_id")
    private String awayId;

    /**
     * 客队排名
     */
    @Column(name = "away_standings")
    private Integer awayStandings;

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
     * 获取比赛时间
     *
     * @return match_time - 比赛时间
     */
    public Date getMatchTime() {
        return matchTime;
    }

    /**
     * 设置比赛时间
     *
     * @param matchTime 比赛时间
     */
    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    /**
     * 获取主队ID
     *
     * @return home_id - 主队ID
     */
    public String getHomeId() {
        return homeId;
    }

    /**
     * 设置主队ID
     *
     * @param homeId 主队ID
     */
    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    /**
     * 获取主队排名
     *
     * @return home_standings - 主队排名
     */
    public Integer getHomeStandings() {
        return homeStandings;
    }

    /**
     * 设置主队排名
     *
     * @param homeStandings 主队排名
     */
    public void setHomeStandings(Integer homeStandings) {
        this.homeStandings = homeStandings;
    }

    /**
     * 获取客队ID
     *
     * @return away_id - 客队ID
     */
    public String getAwayId() {
        return awayId;
    }

    /**
     * 设置客队ID
     *
     * @param awayId 客队ID
     */
    public void setAwayId(String awayId) {
        this.awayId = awayId;
    }

    /**
     * 获取客队排名
     *
     * @return away_standings - 客队排名
     */
    public Integer getAwayStandings() {
        return awayStandings;
    }

    /**
     * 设置客队排名
     *
     * @param awayStandings 客队排名
     */
    public void setAwayStandings(Integer awayStandings) {
        this.awayStandings = awayStandings;
    }
}