package com.rudnick.yourbox.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Cupboard extends Storage {
    @OneToMany
    List<Shelf> shelves;
}
