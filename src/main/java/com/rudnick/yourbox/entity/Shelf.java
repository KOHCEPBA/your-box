package com.rudnick.yourbox.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Shelf extends Storage {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Cupboard cupboard;
}
