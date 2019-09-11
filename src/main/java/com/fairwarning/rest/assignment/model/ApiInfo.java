package com.fairwarning.rest.assignment.model;

public class ApiInfo {

    private  String methodName;
    private String uri;


    public ApiInfo(){}

    public ApiInfo(String methodName , String uri) {
        this.methodName = methodName;

        this.uri = uri;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }



}