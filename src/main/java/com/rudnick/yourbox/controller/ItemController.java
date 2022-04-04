package com.rudnick.yourbox.controller;

import com.rudnick.yourbox.entity.Item;
import com.rudnick.yourbox.entity.Storage;
import com.rudnick.yourbox.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService service;

    @PostMapping()
    public ResponseEntity<String> newItem(@RequestBody Item item) {
        Long id = service.createNewItem(item);
        return ResponseEntity.created(URI.create("/Storage/" + id)).build();
    }

    @GetMapping("/{name}")
    public ResponseEntity<Item> getStorage(@PathVariable(name = "name") Item item) {
        return ResponseEntity.ok().body(item);
    }
}
