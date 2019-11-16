package com.team.loancalculate.utils;

import com.team.loancalculate.domain.entity.*;
import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class LineBean {
    Attestation attestation;
    Education education;
    Income income;
    Job job;
    SocialSecurity socialSecurity;

}
