/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game_app_;

import java.util.Scanner;

/**
 *
 * @author desislavapd
 */
public class hangman {
    
    private String answer;
    private int lenght;
    private String lines;
    
    public void setAnswer(String answer){
        this.answer=answer;
        setLenght(answer.length());
        
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }
    
    public void setlinestolabel(){
        String a ="";
        for (int i = 0; i <getLenght(); i++) {
            a+="_"+" ";
            
        }
        setLines(a);
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
    public String dobavqne(char a){
        //String line= lbl.getText();
        String line ="";
        if(proverka(a)==true){
            for (int i = 0; i < answer.length(); i++) {
                if(answer.charAt(i)==a){
              line+=a+" ";
           }
                else{
                    line+="_"+" ";
                }
                
            }
        }
        else{
            System.out.println("nqma");
        }
        return  line;
    }

    
    
    
}
