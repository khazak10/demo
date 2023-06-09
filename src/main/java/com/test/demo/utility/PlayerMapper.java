package com.test.demo.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;
import com.test.demo.model.Player;
import com.test.demo.model.dto.PlayerDto;
import com.test.demo.model.dto.Pojo;
import com.test.demo.model.enums.PositionEnum;

@Component("MapperToPlayer")
public class PlayerMapper implements Mapper {

    @Override
    public Object mappToEntity(Pojo pojo) {
        Player player = new Player();
        PlayerDto playerDto = (PlayerDto) pojo;
        player.setName(playerDto.getName());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = playerDto.getDate();
        player.setBirthDate(LocalDate.parse(date, formatter));
        if (PositionEnum.Deffender.toString().equals(playerDto.getPosition())) {
            player.setPosition(PositionEnum.Deffender);
        } else if (PositionEnum.GoalKeeper.toString().equals(playerDto.getPosition())) {
            player.setPosition(PositionEnum.GoalKeeper);
        } else {
            player.setPosition(PositionEnum.MidFielder);
        }

        return player;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'mappToEntity'");
    }

}
