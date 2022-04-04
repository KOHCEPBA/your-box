package com.rudnick.yourbox.service;

import com.rudnick.yourbox.entity.Item;
import com.rudnick.yourbox.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;

    @Override
    public Long createNewItem(Item item) {
        if (!StringUtils.hasText(item.getName())) {
            throw new IllegalArgumentException("Name must be filled");
        }
        if (item.getStorage() == null || item.getStorage().getName() == null) {
            throw new IllegalArgumentException("Storage name must be filled");
        }
        return repository.save(item).getId();
    }
}
