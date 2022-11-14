package com.example.krigsfotograferne.repository;

import com.example.krigsfotograferne.model.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
