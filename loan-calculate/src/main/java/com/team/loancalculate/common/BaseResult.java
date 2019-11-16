package com.team.loancalculate.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuzhi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult<T> implements Result<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> BaseResult succes(T data) {
        return new BaseResult(StatusTypeEnum.SUCCESS.getStatus(),StatusTypeEnum.SUCCESS.getMsg(), data);
    }

    public static BaseResult error(int status, Exception ex) {
        return new BaseResult(status, ex.getMessage(),null);
    }
    public static BaseResult error() {
        return new BaseResult(500, "网络异常",null);
    }
}
