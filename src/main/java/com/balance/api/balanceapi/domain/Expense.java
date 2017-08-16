package com.balance.api.balanceapi.domain;

import java.util.List;
import java.util.Date;
import com.balance.api.balanceapi.domain.Attendee;

public class Expense {

    private Long id;
    private String title;
    private Double amount;
    private Date date;
    private Attendee buyer;
    private List<Attendee> attendees;
    
    public Expense () {}

    public Expense (Long id, String title, Double amount, Date date) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.date = date;
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

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attendee getBuyer() {
        return this.buyer;
    }

    public void setBuyer(Attendee buyer) {
        this.buyer = buyer;
    }

    public List<Attendee> getAttendees() {
        return this.attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    @Override
    public String toString() {
        return "Expense{id=" + this.id + ", title=" + this.title + ", date=" + this.date + ", amount=" + this.amount + ", buyer=" + this.buyer.toString() + ", attendees=" + ((this.attendees.isEmpty()) ? 0 : this.attendees.size()) + "}";
    }
} 