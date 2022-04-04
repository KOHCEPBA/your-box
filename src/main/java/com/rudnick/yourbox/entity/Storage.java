package com.rudnick.yourbox.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@EqualsAndHashCode
@Data
public class Storage {
    @Id
    protected String name;
    @OneToMany(mappedBy = "storage")
    protected Set<Storage> subStorages;

    @ManyToOne()
    @JoinColumn
    protected Storage storage;
}
