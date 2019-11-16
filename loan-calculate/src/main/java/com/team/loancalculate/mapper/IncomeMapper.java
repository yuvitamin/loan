package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Income;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */
public interface IncomeMapper {
    Income findIncomeLine(@Param("keyword3") int keyword3);

    List<Income> findAll();
}
