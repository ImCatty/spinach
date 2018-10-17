package com.fatcat.spinach.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "company_info")
@Component
public class CompanyInfo {
    /**
     * 博彩公司ID
     */
    @Id
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 博彩公司名字
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 获取博彩公司ID
     *
     * @return company_id - 博彩公司ID
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置博彩公司ID
     *
     * @param companyId 博彩公司ID
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取博彩公司名字
     *
     * @return company_name - 博彩公司名字
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置博彩公司名字
     *
     * @param companyName 博彩公司名字
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}