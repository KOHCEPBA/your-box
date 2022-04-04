package com.rudnick.yourbox.service;

import com.rudnick.yourbox.entity.Cupboard;
import com.rudnick.yourbox.exception.ResourceNotFoundException;
import com.rudnick.yourbox.repository.CupboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CupboardServiceImpl implements CupboardService {

    private final CupboardRepository repository;

    @Override
    public String createNewCupboard(String name) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalStateException("Cupboard name can't be empty");
        }
        Cupboard newCupboard = new Cupboard();
        newCupboard.setName(name);
        return repository.save(newCupboard).getName();
    }
}
