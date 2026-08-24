package com.khushcoded.guess_the_character.DTO;

public class GuessResponse {

    private boolean correct;
    private String message;
    private int score;

    public GuessResponse(){

    }

    public GuessResponse(boolean correct, String message, int score){
        this.correct = correct;
        this.message = message;
        this.score = score;
    }

    public boolean isCorrect(){
        return correct;
    }

    public void setCorrect(boolean correct){
        this.correct = correct;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}
