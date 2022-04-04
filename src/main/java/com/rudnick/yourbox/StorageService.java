package com.rudnick.yourbox;

import com.rudnick.yourbox.entity.Storage;

public interface StorageService {
    /**
     * Creating new storage
     *
     * @param name name of new storage
     * @return id for created storage
     */
    String createNewStorage(String name);

    /**
     * Request storage by name
     * @param name name of searched storage
     * @return founded storage
     */
    Storage getStorage(String name);
}
