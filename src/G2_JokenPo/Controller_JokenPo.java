package G2_JokenPo;

import java.util.Random;

/**
 *
 * @author caiop
 */

/*
So, in Joken Po...

Rock = 0
Paper = 1
Scissors = 2

In a natural game: 

Rock(0) > Scissors(2); 
Paper(1) > Rock(0); 
Scissors(2) > Paper(1);
*/

public class Controller_JokenPo {
 
    private int choice;
    private boolean win = false;
    private boolean draw = false;
    
    
    
    public void gameStart(){
        Random random = new Random();
        
        choice = random.nextInt(3);
        
        //LOG:
        System.out.println("LOG_COMPUTER_CHOICE: " + choice);
    }
    
    public void win(int answer){
        
        if(choice == 0 && answer == 2){
            //Player Loses
            win = false;
            draw = false;
        }else if(answer > choice){
            //Player Win
            win = true;
            draw = false;
        }else if (answer == 0 && choice == 2){
            //Player Win
            win = true;
            draw = false;
        }else if (answer < choice){
            //Player loses
            win = false;
            draw = false;
        }else if(answer == choice){
            //Draw
            win = false;
            draw = true;
        }
        
        System.out.println("LOG_WINNER: " + win + "\nLOG_DRAW: " + draw);
        
    }//End win method

    
    //////////////////////////GETS & SETS//////////////////////////
    
    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    
    
    
    
    
    
}
