/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_app_;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author desislavapd
 */
public class hangman {
    
    private String answer;
    private int length;
    
    
    public String getAnswer(){
        return answer;
    }
    
    public void setAnswer(String newanswer){
        this.answer=newanswer;
        setLength(answer.length());
        
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newlength) {
        this.length = newlength;
    }

    
    
    
    public boolean proverka(char a){
        boolean match=false;
        for (int i = 0; i <answer.length(); i++) {
            
           if(answer.charAt(i)==a){
               match=true;
           }
            
        }
        return match;
    }
    

    public String Random (){
        Random rand = new Random();
        String [] words = {"actor","gold","painting","advertisement"};
        
    int i = rand.nextInt(3)+0;
    
    return words[i];
    
    }
}
