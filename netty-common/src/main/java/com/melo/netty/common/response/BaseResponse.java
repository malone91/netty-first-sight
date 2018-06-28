package com.melo.netty.common.response;

import com.melo.netty.common.enums.StatusEnum;
import com.melo.netty.common.util.StringUtil;

import java.io.Serializable;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -6959973999631187117L;

    private String code;

    private String message;

    /**
     * 请求号
     */
    private String reqNo;

    private T dataBody;

    public BaseResponse() {
    }

    public BaseResponse(T dataBody) {
        this.dataBody = dataBody;
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(String code, T dataBody, String message) {
        this.code = code;
        this.dataBody = dataBody;
        this.message = message;
    }

    public BaseResponse(String code, T dataBody, String message, String reqNo) {
        this.code = code;
        this.dataBody = dataBody;
        this.message = message;
        this.reqNo = reqNo;
    }

    public static <T> BaseResponse<T> create(T t) {
        return new BaseResponse<T>(t);
    }

    public static <T> BaseResponse<T> create(T t, StatusEnum statusEnum) {
        return new BaseResponse<T>(statusEnum.getCode(), t, statusEnum.getMessage());
    }

    public static <T> BaseResponse<T> createSuccess(T t, String message) {
        return new BaseResponse<T>(StatusEnum.SUCCESS.getCode(), t, StringUtil.isNullOrEmpty(message) ? StatusEnum.SUCCESS.getMessage() : message);
    }

    public static <T> BaseResponse<T> createFail(T t, String message) {
        return new BaseResponse<T>(StatusEnum.FALL.getCode(), t, StringUtil.isNullOrEmpty(message) ? StatusEnum.FALL.getMessage() : message);
    }

    public static <T> BaseResponse<T> create(T t, StatusEnum statusEnum, String message) {
        return new BaseResponse<T>(statusEnum.getCode(), t, message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getDataBody() {
        return dataBody;
    }

    public void setDataBody(T dataBody) {
        this.dataBody = dataBody;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }
}
