package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Installment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuzhi
 */
public interface InstallmentMapper {
    Installment findRate(@Param("keyword1") int keyword1,@Param("keyword2") double keyword2);
}
