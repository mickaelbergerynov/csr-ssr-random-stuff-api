package com.ynovwfs.randomstuffapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynovwfs.randomstuffapi.models.RandomStuff;

public interface RandomStuffsRepository extends JpaRepository<RandomStuff, Long> {

}
