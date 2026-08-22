package com.khushcoded.guess_the_character.service;

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
}
