package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Education {
    /**
     * 学历id
     */
    private Integer educationId;

    /**
     * 学历说明
     */
    private String educationTitle;

    /**
     * 额度
     */
    private Integer educationLines;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationTitle() {
        return educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public Integer getEducationLines() {
        return educationLines;
    }

    public void setEducationLines(Integer educationLines) {
        this.educationLines = educationLines;
    }
}

