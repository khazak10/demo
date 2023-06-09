package com.test.demo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.test.demo.model.Player;
import com.test.demo.model.dto.PlayerDto;
import com.test.demo.repository.PlayerRepository;
import com.test.demo.utility.Mapper;

@RestController
public class PlayerCrudCtrl {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    @Qualifier(value = "MapperToPlayer")
    Mapper mapper;

    @GetMapping("/rest/player/players")
    public List<Player> getAllPlayer() {

        return (List<Player>) playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        // ResponseEntity responseEntity
        return playerRepository.findById(id);
    }

    @PostMapping("/rest/player/create")
    public void createPlayer(@RequestBody PlayerDto playerDto) {

        playerRepository.save((Player) mapper.mappToEntity(playerDto));
    }

    public void updatePlayer(@RequestBody Player player) {
        playerRepository.save(player);
    }

}
