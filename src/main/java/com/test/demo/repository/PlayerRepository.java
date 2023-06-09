package com.test.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
