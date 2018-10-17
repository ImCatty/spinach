package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "match_result_info")
@Component
public class MatchResultInfo {
    @Id
    private Integer id;

    /**
     * 赛果信息ID
     */
    @Column(name = "match_result_id")
    private String matchResultId;

    /**
     * 半场主队进球数
     */
    @Column(name = "half_home_goals")
    private Integer halfHomeGoals;

    /**
     * 半场客队进球数
     */
    @Column(name = "half_away_goals")
    private Integer halfAwayGoals;

    /**
     * 全场主队进球数
     */
    @Column(name = "whole_home_goals")
    private Integer wholeHomeGoals;

    /**
     * 全场客队进球数
     */
    @Column(name = "whole_away_goals")
    private Integer wholeAwayGoals;

    /**
     * 半场比分
     */
    @Column(name = "half_result")
    private String halfResult;

    /**
     * 全场比分
     */
    @Column(name = "whole_result")
    private String wholeResult;

    /**
     * 半场主队角球数
     */
    @Column(name = "half_home_corners")
    private Integer halfHomeCorners;

    /**
     * 半场客队角球数
     */
    @Column(name = "half_away_corners")
    private Integer halfAwayCorners;

    /**
     * 全场主队角球数
     */
    @Column(name = "whole_home_corners")
    private Integer wholeHomeCorners;

    /**
     * 全场客队角球数
     */
    @Column(name = "whole_away_corners")
    private Integer wholeAwayCorners;

    /**
     * 半场角球数
     */
    @Column(name = "half_corners")
    private Integer halfCorners;

    /**
     * 全场角球数
     */
    @Column(name = "whole_corners")
    private Integer wholeCorners;

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

    /**
     * 获取半场主队进球数
     *
     * @return half_home_goals - 半场主队进球数
     */
    public Integer getHalfHomeGoals() {
        return halfHomeGoals;
    }

    /**
     * 设置半场主队进球数
     *
     * @param halfHomeGoals 半场主队进球数
     */
    public void setHalfHomeGoals(Integer halfHomeGoals) {
        this.halfHomeGoals = halfHomeGoals;
    }

    /**
     * 获取半场客队进球数
     *
     * @return half_away_goals - 半场客队进球数
     */
    public Integer getHalfAwayGoals() {
        return halfAwayGoals;
    }

    /**
     * 设置半场客队进球数
     *
     * @param halfAwayGoals 半场客队进球数
     */
    public void setHalfAwayGoals(Integer halfAwayGoals) {
        this.halfAwayGoals = halfAwayGoals;
    }

    /**
     * 获取全场主队进球数
     *
     * @return whole_home_goals - 全场主队进球数
     */
    public Integer getWholeHomeGoals() {
        return wholeHomeGoals;
    }

    /**
     * 设置全场主队进球数
     *
     * @param wholeHomeGoals 全场主队进球数
     */
    public void setWholeHomeGoals(Integer wholeHomeGoals) {
        this.wholeHomeGoals = wholeHomeGoals;
    }

    /**
     * 获取全场客队进球数
     *
     * @return whole_away_goals - 全场客队进球数
     */
    public Integer getWholeAwayGoals() {
        return wholeAwayGoals;
    }

    /**
     * 设置全场客队进球数
     *
     * @param wholeAwayGoals 全场客队进球数
     */
    public void setWholeAwayGoals(Integer wholeAwayGoals) {
        this.wholeAwayGoals = wholeAwayGoals;
    }

    /**
     * 获取半场比分
     *
     * @return half_result - 半场比分
     */
    public String getHalfResult() {
        return halfResult;
    }

    /**
     * 设置半场比分
     *
     * @param halfResult 半场比分
     */
    public void setHalfResult(String halfResult) {
        this.halfResult = halfResult;
    }

    /**
     * 获取全场比分
     *
     * @return whole_result - 全场比分
     */
    public String getWholeResult() {
        return wholeResult;
    }

    /**
     * 设置全场比分
     *
     * @param wholeResult 全场比分
     */
    public void setWholeResult(String wholeResult) {
        this.wholeResult = wholeResult;
    }

    /**
     * 获取半场主队角球数
     *
     * @return half_home_corners - 半场主队角球数
     */
    public Integer getHalfHomeCorners() {
        return halfHomeCorners;
    }

    /**
     * 设置半场主队角球数
     *
     * @param halfHomeCorners 半场主队角球数
     */
    public void setHalfHomeCorners(Integer halfHomeCorners) {
        this.halfHomeCorners = halfHomeCorners;
    }

    /**
     * 获取半场客队角球数
     *
     * @return half_away_corners - 半场客队角球数
     */
    public Integer getHalfAwayCorners() {
        return halfAwayCorners;
    }

    /**
     * 设置半场客队角球数
     *
     * @param halfAwayCorners 半场客队角球数
     */
    public void setHalfAwayCorners(Integer halfAwayCorners) {
        this.halfAwayCorners = halfAwayCorners;
    }

    /**
     * 获取全场主队角球数
     *
     * @return whole_home_corners - 全场主队角球数
     */
    public Integer getWholeHomeCorners() {
        return wholeHomeCorners;
    }

    /**
     * 设置全场主队角球数
     *
     * @param wholeHomeCorners 全场主队角球数
     */
    public void setWholeHomeCorners(Integer wholeHomeCorners) {
        this.wholeHomeCorners = wholeHomeCorners;
    }

    /**
     * 获取全场客队角球数
     *
     * @return whole_away_corners - 全场客队角球数
     */
    public Integer getWholeAwayCorners() {
        return wholeAwayCorners;
    }

    /**
     * 设置全场客队角球数
     *
     * @param wholeAwayCorners 全场客队角球数
     */
    public void setWholeAwayCorners(Integer wholeAwayCorners) {
        this.wholeAwayCorners = wholeAwayCorners;
    }

    /**
     * 获取半场角球数
     *
     * @return half_corners - 半场角球数
     */
    public Integer getHalfCorners() {
        return halfCorners;
    }

    /**
     * 设置半场角球数
     *
     * @param halfCorners 半场角球数
     */
    public void setHalfCorners(Integer halfCorners) {
        this.halfCorners = halfCorners;
    }

    /**
     * 获取全场角球数
     *
     * @return whole_corners - 全场角球数
     */
    public Integer getWholeCorners() {
        return wholeCorners;
    }

    /**
     * 设置全场角球数
     *
     * @param wholeCorners 全场角球数
     */
    public void setWholeCorners(Integer wholeCorners) {
        this.wholeCorners = wholeCorners;
    }
}