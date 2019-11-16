package com.team.loancalculate.utils;

import com.team.loancalculate.domain.entity.*;
import lombok.Data;

import java.util.List;

/**
 * @author yuzhi
 */
@Data
public class ModelBean {
    List<Attestation> attestationList;
    List<Education> educationList;
    List<Income> incomeList;
    List<Job> jobList;
    List<SocialSecurity> socialSecurityList;

}
