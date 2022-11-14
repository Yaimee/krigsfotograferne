package com.example.krigsfotograferne.controller;

import com.example.krigsfotograferne.model.Image;
import com.example.krigsfotograferne.repository.ImageRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/images")
public class ImageController {
    private final ImageRepository imageRepository;

    @GetMapping
    public ResponseEntity<Iterable<Image>> findAll() {
        Iterable<Image> allImages = imageRepository.findAll();
        return ResponseEntity.ok().body(allImages);
    }
}
