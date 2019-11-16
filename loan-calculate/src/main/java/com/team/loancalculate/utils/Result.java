package com.team.loancalculate.utils;

import lombok.Data;

/**
 * @author yuzhi
 */
@Data
public class Result<T> {

    private int status;
    private String msg;
    private T data;

    public static Result success(Object obj) {
        Result result =new Result();
        result.setData(obj);
        result.setMsg("success");
        result.setStatus(200);
        return result;
    }
    public static Result error() {
        Result result = new Result();
        return result;
    }

    public void setData(T data) {
        this.data = data;
    }
}
