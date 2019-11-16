package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */
public interface JobMapper {
    Job findJobLine(@Param("keyword4") int keyword4);

    List<Job> findAll();
}
