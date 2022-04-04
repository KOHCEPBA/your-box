package com.rudnick.yourbox.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Storage storage;
    private Integer count;
}
