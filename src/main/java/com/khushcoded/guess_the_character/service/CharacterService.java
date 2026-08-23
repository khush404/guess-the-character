package com.khushcoded.guess_the_character.service;

import com.khushcoded.guess_the_character.DTO.GameResponse;
import com.khushcoded.guess_the_character.entity.Character;
import com.khushcoded.guess_the_character.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;
    
    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }
    
    public List<Character> getAllCharacters(){
        return characterRepository.findAll();
    }

    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    public Character getRandomCharacter(){
        return characterRepository.findRandomCharacter();
    }

    public GameResponse getRandomGame(){
        Character character = characterRepository.findRandomCharacter();

        return new GameResponse(
                character.getId(),
                character.getClue1(),
                character.getClue2(),
                character.getClue3()
        );
    }
}
