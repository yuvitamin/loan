package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Job {
    /**
     * 职业信息id
     */
    private Integer jobId;

    /**
     * 职业说明
     */
    private String jobTitle;

    /**
     * 额度
     */
    private Integer jobLines;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getJobLines() {
        return jobLines;
    }

    public void setJobLines(Integer jobLines) {
        this.jobLines = jobLines;
    }
}

