package com.rudnick.yourbox.controller;

import com.rudnick.yourbox.StorageService;
import com.rudnick.yourbox.entity.Storage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
public class StorageController {

    private final StorageService service;

    @PostMapping("/{name}")
    public ResponseEntity<String> newStorage(@PathVariable String name) {
        String newStorageId = service.createNewStorage(name);
        return ResponseEntity.created(URI.create("/storage/" + newStorageId)).build();
    }

    @GetMapping("/{name}")
    public ResponseEntity<Storage> getStorage(@PathVariable String name) {
        Storage storage = service.getStorage(name);
        return ResponseEntity.ok().body(storage);
    }
}
