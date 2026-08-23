package com.khushcoded.guess_the_character.DTO;

public class GameResponse {

    private Long gameId;
    private String clue1;
    private String clue2;
    private String clue3;

    public GameResponse(){

    }

    public GameResponse(Long gameId, String clue1, String clue2, String clue3){
        this.gameId = gameId;
        this.clue1 = clue1;
        this.clue2 = clue2;
        this.clue3 = clue3;
    }

    public Long getGameId(){
        return gameId;
    }

    public void setGameId(Long gameId){
        this.gameId = gameId;
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
