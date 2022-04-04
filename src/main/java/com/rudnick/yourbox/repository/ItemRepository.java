package com.rudnick.yourbox.repository;

import com.rudnick.yourbox.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
