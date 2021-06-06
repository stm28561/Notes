package com.example.notes;

public class Note {
    private String title;
    private String description;
    private String daysOfWeek;
    private int priority;

    public Note(String title, String description, String daysOfWeek, int priority) {
        this.title = title;
        this.description = description;
        this.daysOfWeek = daysOfWeek;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public int getPriority() {
        return priority;
    }
}
