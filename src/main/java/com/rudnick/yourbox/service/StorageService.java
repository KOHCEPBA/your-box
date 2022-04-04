package com.rudnick.yourbox.service;

import com.rudnick.yourbox.entity.Storage;

public interface StorageService {
    /**
     * Creating new Storage.
     *
     * @param name    name of new Storage.
     * @param related related Storage. The Storage it is in.
     * @return id for created Storage.
     */
    String createNewStorage(String name, Storage related);
}
