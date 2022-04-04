package com.rudnick.yourbox.service;

import com.rudnick.yourbox.entity.Cupboard;

public interface CupboardService {
    /**
     * Creating new Cupboard
     *
     * @param name name of new Cupboard
     * @return id for created Cupboard
     */
    String createNewCupboard(String name);
}
