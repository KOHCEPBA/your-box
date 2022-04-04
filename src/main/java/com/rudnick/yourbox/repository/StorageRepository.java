package com.rudnick.yourbox.repository;

import com.rudnick.yourbox.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage, String> {
}
