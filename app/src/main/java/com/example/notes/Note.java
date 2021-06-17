package com.example.notes;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")

public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int daysOfWeek;
    private int priority;


    public Note(int id, String title, String description, int daysOfWeek, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.daysOfWeek = daysOfWeek;
        this.priority = priority;
    }

    @Ignore
    public Note(String title, String description, int daysOfWeek, int priority) {
        this.title = title;
        this.description = description;
        this.daysOfWeek = daysOfWeek;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDaysOfWeek() {
        return daysOfWeek;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDaysOfWeek(int daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static String getDayAsString (int position) {
        switch (position) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Sunday";
            case 7:
                return "Saturday";
        }
        return "something wrong with Date";
    }
}
