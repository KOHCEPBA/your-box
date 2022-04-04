package com.rudnick.yourbox.service;

import com.rudnick.yourbox.entity.Storage;
import com.rudnick.yourbox.exception.ResourceNotFoundException;
import com.rudnick.yourbox.repository.StorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {

    private final StorageRepository repository;

    @Override
    public String createNewStorage(String name, Storage related) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalStateException("Storage name can't be empty");
        }
        Storage newStorage = new Storage();
        if (related != null && related.getName() != null) {
            newStorage.setStorage(related);
        }
        newStorage.setName(name);
        return repository.save(newStorage).getName();
    }
}
