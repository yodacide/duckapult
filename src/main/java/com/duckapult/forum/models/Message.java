package com.duckapult.forum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private int messageID;

    private String message;

    private Timestamp timestamp;

    @ManyToOne
    private User user;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public int getMessageID() {
        return messageID;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
