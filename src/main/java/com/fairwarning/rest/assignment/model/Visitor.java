package com.fairwarning.rest.assignment.model;

public class Visitor {

    private String visitCount;
    private String userFirst;
    private String userLast;

    public Visitor(String visitCount, String userFirst, String userLast) {
        this.visitCount = visitCount;
        this.userFirst = userFirst;
        this.userLast = userLast;
    }

    public String getUserLast() {
        return userLast;
    }

    public void setUserLast(String userLast) {
        this.userLast = userLast;
    }

    public String getUserFirst() {
        return userFirst;
    }

    public void setUserFirst(String userFirst) {
        this.userFirst = userFirst;
    }

    public String getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(String visitCount) {
        this.visitCount = visitCount;
    }



}