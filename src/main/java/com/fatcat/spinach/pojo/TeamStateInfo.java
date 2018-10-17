package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "team_state_info")
@Component
public class TeamStateInfo {
    @Id
    private Integer id;

    /**
     * 球队状态信息ID
     */
    @Column(name = "team_state_id")
    private String teamStateId;

    /**
     * 球队ID
     */
    @Column(name = "team_id")
    private String teamId;

    /**
     * 联赛ID
     */
    @Column(name = "league_id")
    private String leagueId;

    /**
     * 赛季ID
     */
    @Column(name = "season_id")
    private String seasonId;

    /**
     * 球队身价
     */
    @Column(name = "team_value")
    private Float teamValue;

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
     * 获取球队状态信息ID
     *
     * @return team_state_id - 球队状态信息ID
     */
    public String getTeamStateId() {
        return teamStateId;
    }

    /**
     * 设置球队状态信息ID
     *
     * @param teamStateId 球队状态信息ID
     */
    public void setTeamStateId(String teamStateId) {
        this.teamStateId = teamStateId;
    }

    /**
     * 获取球队ID
     *
     * @return team_id - 球队ID
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置球队ID
     *
     * @param teamId 球队ID
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
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
     * 获取球队身价
     *
     * @return team_value - 球队身价
     */
    public Float getTeamValue() {
        return teamValue;
    }

    /**
     * 设置球队身价
     *
     * @param teamValue 球队身价
     */
    public void setTeamValue(Float teamValue) {
        this.teamValue = teamValue;
    }
}