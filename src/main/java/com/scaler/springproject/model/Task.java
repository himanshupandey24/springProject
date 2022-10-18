package com.scaler.springproject.model;
import java.util.Date;


public class Task {
     private Long id;
     private String taskName;
     private Date taskDate;
     private Boolean isCompleted;
     private Boolean isPending;
     private Boolean inProgress;


    public Task(Long id, String taskName, Date taskDate, Boolean isCompleted, Boolean isPending, Boolean inProgress) {
        this.id = id;
        this.taskName = taskName;
        this.taskDate = taskDate;
        this.isCompleted = isCompleted;
        this.isPending = isPending;
        this.inProgress = inProgress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Boolean getPending() {
        return isPending;
    }

    public void setPending(Boolean pending) {
        isPending = pending;
    }

    public Boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }
}
