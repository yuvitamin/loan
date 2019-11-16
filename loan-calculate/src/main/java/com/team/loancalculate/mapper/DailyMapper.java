package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Daily;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuzhi
 */
public interface DailyMapper {
    Daily findRate(@Param("keyword1") int keyword1, @Param("keyword2") double keyword2);
}
