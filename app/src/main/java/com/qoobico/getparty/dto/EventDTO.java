package com.qoobico.getparty.dto;

/**
 * Created by George Omega on 09.01.2018.
 */

public class EventDTO {
    private String title;

    public EventDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
