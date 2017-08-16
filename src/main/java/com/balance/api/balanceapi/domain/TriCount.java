package com.balance.api.balanceapi.domain;

import java.util.List;

import com.balance.api.balanceapi.domain.Attendee;;

public class TriCount {
    
    private Long id;
    private String title;
    private String currency;
    private String description;
    private Attendee owner;
    private List<Attendee> attendees;

    public TriCount () {}

    public TriCount ( String title, String currency, String description ) {
        this.title = title;
        this.currency = currency;
        this.description = description;
    }

    public TriCount ( Long id, String title, String currency, String description ) {
        this.id = id;
        this.title = title;
        this.currency = currency;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Attendee getOwner() {
        return owner;
    }

    public void setOwner(Attendee owner) {
        this.owner = owner;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
}