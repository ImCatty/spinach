package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "season_info")
@Component
public class SeasonInfo {
    @Id
    private Integer id;

    /**
     * 赛季ID
     */
    @Column(name = "season_id")
    private String seasonId;

    /**
     * 比赛基本信息ID
     */
    @Column(name = "team_base_id")
    private String teamBaseId;

    /**
     * 联赛ID
     */
    @Column(name = "league_id")
    private String leagueId;

    /**
     * 赛季
     */
    private String season;

    /**
     * 表头
     */
    @Column(name = "table_head")
    private String tableHead;

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
     * 获取比赛基本信息ID
     *
     * @return team_base_id - 比赛基本信息ID
     */
    public String getTeamBaseId() {
        return teamBaseId;
    }

    /**
     * 设置比赛基本信息ID
     *
     * @param teamBaseId 比赛基本信息ID
     */
    public void setTeamBaseId(String teamBaseId) {
        this.teamBaseId = teamBaseId;
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
     * 获取赛季
     *
     * @return season - 赛季
     */
    public String getSeason() {
        return season;
    }

    /**
     * 设置赛季
     *
     * @param season 赛季
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * 获取表头
     *
     * @return table_head - 表头
     */
    public String getTableHead() {
        return tableHead;
    }

    /**
     * 设置表头
     *
     * @param tableHead 表头
     */
    public void setTableHead(String tableHead) {
        this.tableHead = tableHead;
    }
}