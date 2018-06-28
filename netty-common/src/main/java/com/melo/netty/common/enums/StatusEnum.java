package com.melo.netty.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public enum StatusEnum {

    /**
     * 成功
     */
    SUCCESS("9000", "成功"),

    /**
     * 成功
     */
    FALLBACK("8000", "FALLBACK"),

    /**
     * 参数校验失败
     */
    VALIDATION_FALL("3000", "参数校验失败"),

    /**
     * 失败
     */
    FALL("4000", "失败"),

    /**
     * 重复请求
     */
    REPEAT_REQUEST("5000", "重复请求"),

    /**
     * 请求限流
     */
    REQUEST_LIMIT("6000", "请求限流"),
    ;

    /**
     * 枚举值 码
     */
    private final String code;

    /**
     * 枚举描述
     */
    private final String message;

    /**
     * 提供构造器，否则枚举值会失败
     * @param code
     * @param message
     */
    StatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 通过枚举值码查找枚举值
     * @param code
     * @return
     */
    public static StatusEnum findStatus(String code) {
        for (StatusEnum status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("ResultInfo StatusEnum not legal:" + code);
    }

    /**
     * 获取全部枚举值
     * @return
     */
    public static List<StatusEnum> getAllStatus() {
        List<StatusEnum> list = new ArrayList<StatusEnum>();
        for (StatusEnum status : values()) {
            list.add(status);
        }
        return list;
    }

    /**
     * 获取全部枚举值码
     * @return
     */
    public static List<String> getAllStatusCode() {
        List<String> list = new ArrayList<String>();
        for (StatusEnum status : values()) {
            list.add(status.getCode());
        }
        return list;
    }
}
