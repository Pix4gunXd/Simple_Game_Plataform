package G1_GuessTheN; //GTN = Guess the Number

import java.util.Random;




/**
 *
 * @author caiop
 */
public class Controller_GTN {
    
    
    private int number;
    public int attempts;
    public boolean acerto;
    public boolean nMaior = false;
    public boolean nMenor = false;
    
    
    public void gerarNumero(){ //Press play get this method
        Random random = new Random();
        
        number = random.nextInt(101);
        
    }

    public void checarNumero(int resposta){
        
        if (resposta == number){
          acerto = true; 
          attempts += 1;
          
        } else if(resposta > number){
          acerto = false;
          attempts += 1;
          
          nMenor = true;
          nMaior = false;
        } else if(resposta < number) {
          acerto = false;
          attempts += 1;
          
          nMenor = false;
          nMaior = true;
        }
          
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAcerto() {
        return acerto;
    }

    public void setAcerto(boolean acerto) {
        this.acerto = acerto;
    }

    public boolean isnMaior() {
        return nMaior;
    }

    public void setnMaior(boolean nMaior) {
        this.nMaior = nMaior;
    }

    public boolean isnMenor() {
        return nMenor;
    }

    public void setnMenor(boolean nMenor) {
        this.nMenor = nMenor;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
   
    
    
}
