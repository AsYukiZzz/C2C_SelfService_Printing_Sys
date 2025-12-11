package xyz.saturnhalo.result;

import lombok.Data;

/**
 * 统一返回结果类
 *
 * @param <T>
 */

@Data
public class Result<T> {
    private T data;
    private String msg;
    private String code;

    /**
     * 请求成功，不附带数据返回
     *
     * @return 返回结果
     */
    public static <T> Result<T> ok() {
        Result<T> ok = new Result<>();

        ok.setMsg("SUCCESS");
        ok.setCode("200");
        return ok;
    }

    /**
     * 请求成功，附带返回数据
     *
     * @return 附带返回数据的返回结果
     */
    public static <T> Result<T> ok(T data) {
        Result<T> ok = new Result<>();

        ok.setMsg("SUCCESS");
        ok.setCode("200");
        ok.setData(data);
        return ok;
    }

    /**
     * 请求异常
     *
     * @param msg 异常信息
     */
    public static <T> Result<T> fail(String msg) {
        Result<T> fail = new Result<>();

        fail.setMsg(msg);
        fail.setCode("500");
        return fail;
    }

    /**
     * 请求异常
     *
     * @param resultCode 异常码枚举
     */
    public static <T> Result<T> fail(ResultCode resultCode) {
        Result<T> fail = new Result<>();

        fail.setMsg(resultCode.getMsg());
        fail.setCode(resultCode.getCode());
        return fail;
    }

    /**
     * 请求异常
     */
    public static <T> Result<T> fail(String code, String msg) {
        Result<T> fail = new Result<>();

        fail.setMsg(msg);
        fail.setCode(code);
        return fail;
    }
}
