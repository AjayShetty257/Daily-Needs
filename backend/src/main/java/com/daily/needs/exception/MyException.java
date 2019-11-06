package com.daily.needs.exception;


import com.daily.needs.enums.ResultEnum;

/**
 * Created By Ajay Shetty on 3/10/2018.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
