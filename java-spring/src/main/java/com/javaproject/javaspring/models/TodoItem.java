package com.javaproject.javaspring.models;

import java.time.Instant;

public class TodoItem {

    long id;
    String title;
    boolean isComplete;
    Instant creationAt;

    public TodoItem() {
        
    }

    public TodoItem(long id, String title, boolean isComplete, Instant creationAt) {
        this.title = title;
        this.id = id;
        this.isComplete = isComplete;
        this.creationAt = creationAt;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return this.isComplete;
    }

    public void setComplete(boolean complete) {
        this.isComplete = complete;
    }

    public Instant getCreationAt() {
        return this.creationAt;
    }

    public void setCreationAt(Instant creationAt) {
        this.creationAt = creationAt;
    }

}
