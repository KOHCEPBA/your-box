package com.rudnick.yourbox.controller;

import com.rudnick.yourbox.entity.Storage;
import com.rudnick.yourbox.service.StorageService;
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
    public ResponseEntity<String> newStorage(@PathVariable String name, @RequestBody(required = false) Storage related) {
        String newStorageId = service.createNewStorage(name, related);
        return ResponseEntity.created(URI.create("/Storage/" + newStorageId)).build();
    }

    @GetMapping("/{name}")
    public ResponseEntity<Storage> getStorage(@PathVariable(name = "name") Storage storage) {
        return ResponseEntity.ok().body(storage);
    }
}
