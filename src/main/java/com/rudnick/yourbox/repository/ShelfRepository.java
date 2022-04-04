package com.rudnick.yourbox.repository;

import com.rudnick.yourbox.entity.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelfRepository extends JpaRepository<Shelf, String> {
}
