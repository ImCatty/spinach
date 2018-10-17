package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "team_base_info")
@Component
public class TeamBaseInfo {
    @Id
    private Integer id;

    /**
     * 球队基础信息ID
     */
    @Column(name = "team_base_id")
    private String teamBaseId;

    /**
     * 球队名称
     */
    @Column(name = "team_name")
    private String teamName;

    /**
     * 球队简称（英文简称）
     */
    @Column(name = "team_name_abbreviation")
    private String teamNameAbbreviation;

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
     * 获取球队基础信息ID
     *
     * @return team_base_id - 球队基础信息ID
     */
    public String getTeamBaseId() {
        return teamBaseId;
    }

    /**
     * 设置球队基础信息ID
     *
     * @param teamBaseId 球队基础信息ID
     */
    public void setTeamBaseId(String teamBaseId) {
        this.teamBaseId = teamBaseId;
    }

    /**
     * 获取球队名称
     *
     * @return team_name - 球队名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置球队名称
     *
     * @param teamName 球队名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * 获取球队简称（英文简称）
     *
     * @return team_name_abbreviation - 球队简称（英文简称）
     */
    public String getTeamNameAbbreviation() {
        return teamNameAbbreviation;
    }

    /**
     * 设置球队简称（英文简称）
     *
     * @param teamNameAbbreviation 球队简称（英文简称）
     */
    public void setTeamNameAbbreviation(String teamNameAbbreviation) {
        this.teamNameAbbreviation = teamNameAbbreviation;
    }
}