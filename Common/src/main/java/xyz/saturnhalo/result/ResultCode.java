package xyz.saturnhalo.result;

/**
 * 返回结果状态码统一顶层接口
 */

public interface ResultCode {

    /**
     * 获取状态码
     * @return 状态码值
     */
    String getCode();

    /**
     * 获取描述信息
     * @return 描述信息
     */
    String getMsg();
}
