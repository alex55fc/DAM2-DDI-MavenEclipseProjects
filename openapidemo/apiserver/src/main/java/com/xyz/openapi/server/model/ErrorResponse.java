package com.xyz.openapi.server.model;

public class ErrorResponse {
    private boolean success = false;
    private String errorMsg;

    public boolean isSuccess() {
        return success;
    }

    public ErrorResponse setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ErrorResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}