package com.example.krigsfotograferne.controller;

import com.example.krigsfotograferne.model.Image;
import com.example.krigsfotograferne.repository.ImageRepository;
import com.example.krigsfotograferne.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/images")
public class ImageController {
    private final ImageService service;

    @PostMapping
    public ResponseEntity<Image> create(@Valid @RequestBody Image image) {
        Image item = service.create(image);
        return ResponseEntity.ok().body(item);
    }
    @GetMapping
    public ResponseEntity<List<Image>> findAll() {
        List<Image> allImages = (List<Image>) service.findAll();
        return ResponseEntity.ok().body(allImages);
    }
}
