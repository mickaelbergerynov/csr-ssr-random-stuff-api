package com.ynovwfs.randomstuffapi;

import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;
import com.ynovwfs.randomstuffapi.models.RandomStuff;
import com.ynovwfs.randomstuffapi.repositories.RandomStuffsRepository;

@Configuration
public class LoadDatabase {
    public static final int NBENTITIES = 5000;

    @Bean
    CommandLineRunner initDatabase(RandomStuffsRepository randomStuffsRepository) {
        return args -> {
            if (randomStuffsRepository.findAll().size() == NBENTITIES)
                return;

            Faker faker = new Faker(new Locale("fr"));
            for (int i = 0; i < NBENTITIES; i++) {
                RandomStuff rand = new RandomStuff();
                rand.setAuthor(faker.dragonBall().character());
                rand.setTitle(faker.rockBand().name());
                rand.setDescription(faker.shakespeare().romeoAndJulietQuote());
                randomStuffsRepository.save(rand);
            }
        };
    }
}
