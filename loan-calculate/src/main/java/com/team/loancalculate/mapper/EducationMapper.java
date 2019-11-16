package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Education;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */
public interface EducationMapper {
    Education findEducatLine(@Param("keyword2") int keyword2);

    List<Education> findAll();
}

