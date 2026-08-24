package com.khushcoded.guess_the_character.DTO;

public class GuessRequest {

    private String answer;

    public GuessRequest(){

    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
}
