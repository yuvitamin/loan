package com.team.loancalculate.service;


import com.team.loancalculate.domain.entity.Daily;
import com.team.loancalculate.domain.entity.Installment;
import com.team.loancalculate.utils.LineBean;
import com.team.loancalculate.utils.ModelBean;

/**
 * @author yuzhi
 */
public interface ProduceService {
    ModelBean getModel();

    LineBean getLine(int keyword1, int keyword2, int keyword3, int keyword4, int keyword5);

    Installment repayMent(int keyword1,double keyword2);

    Daily repayDaily(int keyword1,double keyword2);
}
