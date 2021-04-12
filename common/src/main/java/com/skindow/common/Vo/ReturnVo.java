package com.skindow.common.Vo;

import com.skindow.common.contact.ResultCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ Author     ：syc.
 * @ Date       ：Created in 15:26 2021/4/8
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Data
@Accessors(chain = true)
public class ReturnVo<T> {

    private T data;

    private String code;

    private String message;

    public static <T> ReturnVo<Void> success() {
        return new ReturnVo<Void>().setMessage("成功").setCode(ResultCodeEnum.SUCCESS.getCode());
    }

    public static <T> ReturnVo<T> successData(T data) {
        return new ReturnVo<T>().setMessage("成功").setCode(ResultCodeEnum.SUCCESS.getCode()).setData(data);
    }
}
