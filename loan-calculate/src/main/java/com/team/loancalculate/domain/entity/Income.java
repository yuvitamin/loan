package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Income {
    /**
     * 月收入表id
     */
    private Integer incomeId;

    /**
     * 月收入说明
     */
    private String incomeTitle;

    /**
     * 额度
     */
    private Integer incomeLines;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public String getIncomeTitle() {
        return incomeTitle;
    }

    public void setIncomeTitle(String incomeTitle) {
        this.incomeTitle = incomeTitle;
    }

    public Integer getIncomeLines() {
        return incomeLines;
    }

    public void setIncomeLines(Integer incomeLines) {
        this.incomeLines = incomeLines;
    }
}

