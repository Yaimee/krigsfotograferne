package com.example.krigsfotograferne.service;

import com.example.krigsfotograferne.model.Image;
import com.example.krigsfotograferne.repository.ImageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;

    public Iterable<Image> findAll() {
        List<Image> list = new ArrayList<>();
        Iterable<Image> items = imageRepository.findAll();
        items.forEach(list::add);
        return list;
    }

    public Image create(Image image) {
        return imageRepository.save(image);
    }
}
