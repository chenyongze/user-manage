package cn.dotalk.usermanage.utils;

import lombok.Data;

/*
 *
 * T 泛型
 *
 */
@Data
public class ResultMsg<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> ResultMsg<T> success() {
        return new ResultMsg<T>();
    }

    public static <T> ResultMsg<T> success(T data) {
        return new ResultMsg<>(data);
    }

    public static <T> ResultMsg<T> error(int code, String msg) {
        return new ResultMsg<>(code, msg);
    }

    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public ResultMsg(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public ResultMsg() {
        this.code = 0;
        this.msg = "success";
        this.data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}