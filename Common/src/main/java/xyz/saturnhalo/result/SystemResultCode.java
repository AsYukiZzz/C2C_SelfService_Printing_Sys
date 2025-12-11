package xyz.saturnhalo.result;

/**
 * 通用错误码枚举类
 */

public enum SystemResultCode implements ResultCode {
    // 枚举值定义
    SUCCESS(200,"操作成功"),
    SYSTEM_ERROR(500,"服务器异常"),
    PARAM_ERROR(400,"传入参数错误"),
    UNAUTHORIZED(401,"用户未登录"),
    FORBIDDEN(403,"无权访问");

    private final String code;
    private final String message;
    SystemResultCode(int code, String message) {
        this.code = String.valueOf(code);
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.message;
    }
}
