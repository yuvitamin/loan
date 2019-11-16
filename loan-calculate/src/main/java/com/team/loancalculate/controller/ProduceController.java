package com.team.loancalculate.controller;

import com.team.loancalculate.domain.entity.Daily;
import com.team.loancalculate.domain.entity.Installment;
import com.team.loancalculate.service.ProduceService;
import com.team.loancalculate.utils.LineBean;
import com.team.loancalculate.utils.ModelBean;
import com.team.loancalculate.utils.RepayBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
@RequestMapping(value = "/produce")
@Slf4j
public class ProduceController {
    @Resource
    ProduceService produceService;

    /**
     * 查看信用额度授信模型
     * @return
     */
    @RequestMapping(value = "/creditmodel")
    public ModelBean getModel() {
        ModelBean modelBean = produceService.getModel();
        return modelBean;
    }
    /**
     *计算可借款额度
     * @param keyword1:认证id
     * @param keyword2:学历id
     * @param keyword3:职业id
     * @param keyword4:月收入id
     * @param keyword5:社保id
     * @return
     */
    @RequestMapping(value = "/calculate",params = {"keyword1","keyword2","keyword3","keyword4","keyword5"})
    public int getLine(int keyword1, int keyword2, int keyword3, int keyword4, int keyword5) {
        LineBean lineBean = produceService.getLine(keyword1, keyword2, keyword3, keyword4, keyword5);
        int creditLine = lineBean.getAttestation().getAttestationLines() + lineBean.getEducation().getEducationLines()
                + lineBean.getIncome().getIncomeLines() + lineBean.getJob().getJobLines() + lineBean.getSocialSecurity().getSocialSecurityLines();
        return creditLine;
    }
//    interest

    /**
     * 分期借款的息费计算
     * @param keyword1:分期手续费id
     * @param keyword2:借款总额
     * @return
     */
    @RequestMapping(value = "/repayment",params = {"keyword1","keyword2"})
    public RepayBean repayMent(int keyword1,double keyword2) {
        RepayBean repayBean = new RepayBean();
        Installment installment = produceService.repayMent(keyword1, keyword2);
        Double repayment = keyword2 / installment.getInstallmentPeriods() + keyword2 * installment.getInstallmentRate();
        Double total = keyword2 + keyword2 * installment.getInstallmentRate() * installment.getInstallmentPeriods();
        repayBean.setRepayment(repayment);
        repayBean.setTotal(total);
        return repayBean;
    }

    /**
     * 按日借款的息费计算
     * @param keyword1:按日借款利率id
     * @param keyword2:借款总额
     * @return
     */
    @RequestMapping(value = "/daily",params = {"keyword1","keyword2"})
    public RepayBean repayDaily(int keyword1,double keyword2){
            RepayBean repayBean = new RepayBean();
            Daily daily = produceService.repayDaily(keyword1,keyword2);
            Double repayment = keyword2*daily.getDailyRate();
            repayBean.setRepayment(repayment);
            return repayBean;
    }
}
