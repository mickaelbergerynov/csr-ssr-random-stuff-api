package com.ynovwfs.randomstuffapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RandomStuff {
    private @Id @GeneratedValue Long id;

    private String author;
    private String title;
    private String description;
    private String imageUrl;
}
