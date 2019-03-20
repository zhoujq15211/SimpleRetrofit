package com.zhou.demo.simpleretrofit.entity;

public class HttpResponse<T> {
    private T data;
    private String message;
    private int status;
    private long timestamp;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }
}
