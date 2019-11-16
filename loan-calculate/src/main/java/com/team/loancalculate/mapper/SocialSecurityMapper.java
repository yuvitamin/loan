package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.SocialSecurity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */
public interface SocialSecurityMapper {
    SocialSecurity findSocialLine(@Param("keyword5") int keyword5);

    List<SocialSecurity> findAll();
}
