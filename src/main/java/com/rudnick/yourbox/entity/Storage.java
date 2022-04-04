package com.rudnick.yourbox.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Storage {
    @Id
    private String name;
}
