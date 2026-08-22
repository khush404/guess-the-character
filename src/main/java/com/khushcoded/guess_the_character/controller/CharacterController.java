package com.khushcoded.guess_the_character.controller;

import com.khushcoded.guess_the_character.entity.Character;
import com.khushcoded.guess_the_character.service.CharacterService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAllCharacters(){
        return characterService.getAllCharacters();
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }
}
