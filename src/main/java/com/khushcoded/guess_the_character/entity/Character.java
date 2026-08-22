package com.khushcoded.guess_the_character.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private String clue1;

    private String clue2;

    private String clue3;

    public Character(){

    }

    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getClue1(){
        return clue1;
    }

    public void setClue1(String clue1){
        this.clue1 = clue1;
    }

    public String getClue2(){
        return clue2;
    }

    public void setClue2(String clue2){
        this.clue2 = clue2;
    }

    public String getClue3(){
        return clue3;
    }

    public void setClue3(String clue3){
        this.clue3 = clue3;
    }
}
