package com.rudnick.yourbox.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@EqualsAndHashCode
@Data
public class Storage {
    @Id
    private String name;
    @OneToMany(mappedBy = "storage", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Storage> subStorages;
    @ManyToOne
    @JoinColumn
    private Storage storage;
}
