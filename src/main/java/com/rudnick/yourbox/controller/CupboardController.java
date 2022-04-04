package com.rudnick.yourbox.controller;

import com.rudnick.yourbox.service.CupboardService;
import com.rudnick.yourbox.entity.Cupboard;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/cupboard")
@RequiredArgsConstructor
public class CupboardController {

    private final CupboardService service;

    @PostMapping("/{name}")
    public ResponseEntity<String> newCupboard(@PathVariable String name) {
        String newCupboardId = service.createNewCupboard(name);
        return ResponseEntity.created(URI.create("/cupboard/" + newCupboardId)).build();
    }

    @GetMapping("/{name}")
    public ResponseEntity<Cupboard> getCupboard(@PathVariable(name = "name") Cupboard cupboard) {
        return ResponseEntity.ok().body(cupboard);
    }
}
