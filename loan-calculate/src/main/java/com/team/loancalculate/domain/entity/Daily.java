package com.team.loancalculate.domain.entity;

import lombok.Data;

@Data
public class Daily {
    /**
     * 按日计算利率表id
     */
    private Integer dailyId;

    /**
     * 借款天数
     */
    private Integer dailyDays;

    /**
     * 利率
     */
    private Double dailyRate;
}

