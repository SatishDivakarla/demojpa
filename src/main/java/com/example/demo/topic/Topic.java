package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sdivakarla on 23/01/19.
 */
@Entity
public class Topic {
    @Id
    public String id;
    public String name;

    public Topic(){}
    public Topic(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
