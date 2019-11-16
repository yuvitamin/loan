package com.team.loancalculate.service.impl;

import com.team.loancalculate.domain.entity.*;
import com.team.loancalculate.mapper.*;
import com.team.loancalculate.service.ProduceService;
import com.team.loancalculate.utils.LineBean;
import com.team.loancalculate.utils.ModelBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuzhi
 */
@Service
@Slf4j
public class ProduceServiceImpl implements ProduceService {
    @Resource
    AttestationMapper attestationMapper;
    @Resource
    EducationMapper educationMapper;
    @Resource
    IncomeMapper incomeMapper;
    @Resource
    JobMapper jobMapper;
    @Resource
    SocialSecurityMapper socialSecurityMapper;
    @Resource
    InstallmentMapper installmentMapper;
    @Resource
    DailyMapper dailyMapper;

    @Override
    public ModelBean getModel() {
        ModelBean modelBean = new ModelBean();
        List<Attestation> attestationList = attestationMapper.findAll();
        List<Education> educationList = educationMapper.findAll();
        List<Income> incomeList = incomeMapper.findAll();
        List<Job> jobList = jobMapper.findAll();
        List<SocialSecurity> socialSecurityList = socialSecurityMapper.findAll();
        modelBean.setAttestationList(attestationList);
        modelBean.setEducationList(educationList);
        modelBean.setIncomeList(incomeList);
        modelBean.setJobList(jobList);
        modelBean.setSocialSecurityList(socialSecurityList);
        return modelBean;
    }

    @Override
    public LineBean getLine(int keyword1, int keyword2, int keyword3, int keyword4, int keyword5) {
        LineBean cateBean = new LineBean();
        Attestation attestation = attestationMapper.findAttesLine(keyword1);
        Education education = educationMapper.findEducatLine(keyword2);
        Income income = incomeMapper.findIncomeLine(keyword3);
        Job job = jobMapper.findJobLine(keyword4);
        SocialSecurity socialSecurity = socialSecurityMapper.findSocialLine(keyword5);
        cateBean.setAttestation(attestation);
        cateBean.setEducation(education);
        cateBean.setIncome(income);
        cateBean.setJob(job);
        cateBean.setSocialSecurity(socialSecurity);
        return cateBean;
    }

    @Override
    public Installment repayMent(int keyword1,double keyword2) {
        return installmentMapper.findRate(keyword1,keyword2);
    }

    @Override
    public Daily repayDaily(int keyword1,double keyword2) {
        return dailyMapper.findRate(keyword1,keyword2);
    }

}
