package com.example.krigsfotograferne.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "image_string")
    String imageString;
    @Column(name = "date")
    String date;
    @Column(name = "description")
    String description;
}
