package xyz.saturnhalo.exception;

import lombok.Getter;
import xyz.saturnhalo.result.ResultCode;

/**
 * 业务异常类
 */

@Getter
public class BusinessException extends RuntimeException {
    private final String code;
    private final String msg;

    /**
     * 仅传入错误描述信息构造异常（错误码默认为500）
     * @param msg 错误描述信息
     */
    public BusinessException(String msg) {
        super();
        this.msg = msg;
        this.code = "500";
    }

    /**
     * 传入错误码枚举构造异常
     * @param resultCode 错误码枚举
     */
    public BusinessException(ResultCode resultCode) {
        super();
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }
}
