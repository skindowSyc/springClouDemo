package com.skindow.common.contact;

import lombok.Data;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:30 2021/4/8
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS("0000");
    /**
     * 编号
     */
    private String code;

    ResultCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
