package com.rudnick.yourbox.repository;

import com.rudnick.yourbox.entity.Cupboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CupboardRepository extends JpaRepository<Cupboard, String> {
}
