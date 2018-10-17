package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "match_base_info")
@Component
public class MatchBaseInfo {
    @Id
    private Integer id;

    /**
     * 比赛基础信息ID
     */
    @Column(name = "match_base_id")
    private String matchBaseId;

    /**
     * 比赛名称
     */
    @Column(name = "match_name")
    private String matchName;

    /**
     * 比赛简称（英文简称）
     */
    @Column(name = "match_name_abbreviation")
    private String matchNameAbbreviation;

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
     * 获取比赛基础信息ID
     *
     * @return match_base_id - 比赛基础信息ID
     */
    public String getMatchBaseId() {
        return matchBaseId;
    }

    /**
     * 设置比赛基础信息ID
     *
     * @param matchBaseId 比赛基础信息ID
     */
    public void setMatchBaseId(String matchBaseId) {
        this.matchBaseId = matchBaseId;
    }

    /**
     * 获取比赛名称
     *
     * @return match_name - 比赛名称
     */
    public String getMatchName() {
        return matchName;
    }

    /**
     * 设置比赛名称
     *
     * @param matchName 比赛名称
     */
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    /**
     * 获取比赛简称（英文简称）
     *
     * @return match_name_abbreviation - 比赛简称（英文简称）
     */
    public String getMatchNameAbbreviation() {
        return matchNameAbbreviation;
    }

    /**
     * 设置比赛简称（英文简称）
     *
     * @param matchNameAbbreviation 比赛简称（英文简称）
     */
    public void setMatchNameAbbreviation(String matchNameAbbreviation) {
        this.matchNameAbbreviation = matchNameAbbreviation;
    }
}