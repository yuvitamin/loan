package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Installment {
    /**
     * 手续费表id
     */
    private Integer installmentId;

    /**
     * 分期期数
     */
    private Integer installmentPeriods;

    /**
     * 利率
     */
    private Double installmentRate;
}

