package xyz.saturnhalo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.saturnhalo.result.Result;
import xyz.saturnhalo.result.SystemResultCode;

import java.util.Objects;

/**
 * 全局异常处理器
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 拦截业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result<?> handleBusinessException(BusinessException e) {
        log.warn("业务异常: code={}, msg={}", e.getCode(), e.getMsg());
        return Result.fail(e.getCode(), e.getMsg());
    }

    /**
     * 拦截参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> handleValidationException(MethodArgumentNotValidException e) {
        // 获取第一个校验失败的提示信息
        String msg = Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage();
        log.warn("参数校验异常: {}", msg);
        return Result.fail(SystemResultCode.PARAM_ERROR.getCode(), msg);
    }

    // 处理 form-data 格式的校验异常
    @ExceptionHandler(BindException.class)
    public Result<?> handleBindException(BindException e) {
        String msg = Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage();
        log.warn("参数绑定异常: {}", msg);
        return Result.fail(SystemResultCode.PARAM_ERROR.getCode(), msg);
    }

    /**
     * 全部异常拦截
     */
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e){
        log.error("系统未知异常：" + e);
        return Result.fail(SystemResultCode.SYSTEM_ERROR);
    }
}
