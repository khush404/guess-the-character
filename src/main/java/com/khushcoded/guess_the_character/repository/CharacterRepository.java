package com.khushcoded.guess_the_character.repository;

import com.khushcoded.guess_the_character.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
