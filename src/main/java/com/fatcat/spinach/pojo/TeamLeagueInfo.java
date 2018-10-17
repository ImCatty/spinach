package com.fatcat.spinach.pojo;

import java.util.Date;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "team_league_info")
@Component
public class TeamLeagueInfo {
    @Id
    private Integer id;

    /**
     * 球队联赛信息ID
     */
    @Column(name = "team_league_id")
    private String teamLeagueId;

    /**
     * 球队ID
     */
    @Column(name = "team_id")
    private String teamId;

    /**
     * 联赛轮次
     */
    private Integer round;

    /**
     * 排名
     */
    private Integer ranking;

    /**
     * 进球
     */
    private Integer goals;

    /**
     * 失球
     */
    @Column(name = "concede_goals")
    private Integer concedeGoals;

    /**
     * 主客场（1是主场，0是客场）
     */
    @Column(name = "home_away")
    private Integer homeAway;

    /**
     * 对手球队ID
     */
    @Column(name = "opponent_id")
    private Integer opponentId;

    /**
     * 对手球队排名
     */
    @Column(name = "opponent_ranking")
    private Integer opponentRanking;

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
     * 获取球队联赛信息ID
     *
     * @return team_league_id - 球队联赛信息ID
     */
    public String getTeamLeagueId() {
        return teamLeagueId;
    }

    /**
     * 设置球队联赛信息ID
     *
     * @param teamLeagueId 球队联赛信息ID
     */
    public void setTeamLeagueId(String teamLeagueId) {
        this.teamLeagueId = teamLeagueId;
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
     * 获取联赛轮次
     *
     * @return round - 联赛轮次
     */
    public Integer getRound() {
        return round;
    }

    /**
     * 设置联赛轮次
     *
     * @param round 联赛轮次
     */
    public void setRound(Integer round) {
        this.round = round;
    }

    /**
     * 获取排名
     *
     * @return ranking - 排名
     */
    public Integer getRanking() {
        return ranking;
    }

    /**
     * 设置排名
     *
     * @param ranking 排名
     */
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    /**
     * 获取进球
     *
     * @return goals - 进球
     */
    public Integer getGoals() {
        return goals;
    }

    /**
     * 设置进球
     *
     * @param goals 进球
     */
    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    /**
     * 获取失球
     *
     * @return concede_goals - 失球
     */
    public Integer getConcedeGoals() {
        return concedeGoals;
    }

    /**
     * 设置失球
     *
     * @param concedeGoals 失球
     */
    public void setConcedeGoals(Integer concedeGoals) {
        this.concedeGoals = concedeGoals;
    }

    /**
     * 获取主客场（1是主场，0是客场）
     *
     * @return home_away - 主客场（1是主场，0是客场）
     */
    public Integer getHomeAway() {
        return homeAway;
    }

    /**
     * 设置主客场（1是主场，0是客场）
     *
     * @param homeAway 主客场（1是主场，0是客场）
     */
    public void setHomeAway(Integer homeAway) {
        this.homeAway = homeAway;
    }

    /**
     * 获取对手球队ID
     *
     * @return opponent_id - 对手球队ID
     */
    public Integer getOpponentId() {
        return opponentId;
    }

    /**
     * 设置对手球队ID
     *
     * @param opponentId 对手球队ID
     */
    public void setOpponentId(Integer opponentId) {
        this.opponentId = opponentId;
    }

    /**
     * 获取对手球队排名
     *
     * @return opponent_ranking - 对手球队排名
     */
    public Integer getOpponentRanking() {
        return opponentRanking;
    }

    /**
     * 设置对手球队排名
     *
     * @param opponentRanking 对手球队排名
     */
    public void setOpponentRanking(Integer opponentRanking) {
        this.opponentRanking = opponentRanking;
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