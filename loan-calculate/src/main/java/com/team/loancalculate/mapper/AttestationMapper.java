package com.team.loancalculate.mapper;

import com.team.loancalculate.domain.entity.Attestation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */
public interface AttestationMapper {
    Attestation findAttesLine(@Param("keyword1") int keyword1);

    List<Attestation> findAll();
}
