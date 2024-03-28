package com.study.modern.junit.study;

public class Study {

    private StudyStatus status = StudyStatus.DRAFT;

    private int limit = 1;

    public Study(int limit){
        if(limit < 0){
            throw new IllegalArgumentException("limit 은 0 보다 커야한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus(){
        return this.status;
    }

    public int getLimit(){
        return this.limit;
    }

}
