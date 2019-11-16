package com.team.loancalculate.common;

/**
 * @author yuzhi
 */
public enum StatusTypeEnum {
    /**
     *
     */
    SUCCESS(200, "success"),
    ERROR(404, "error");
    private String msg;
    private int status;

    StatusTypeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

}
