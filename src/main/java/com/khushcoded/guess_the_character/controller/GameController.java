package com.khushcoded.guess_the_character.controller;

import com.khushcoded.guess_the_character.DTO.GameResponse;
import com.khushcoded.guess_the_character.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final CharacterService characterService;

    public GameController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping("/random")
    public GameResponse getRandomGame(){
        return characterService.getRandomGame();
    }
}
