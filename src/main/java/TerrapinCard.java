/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class TerrapinCard {
    private double balance;
    
    public TerrapinCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    //methods
    public void payEconomical(){
        if(this.balance >= 2.50){
            this.balance -= 2.50;
        }
        
    }
    
    public void payGourmet(){
        if(this.balance >= 4.00){
             this.balance -= 4.00;
        }
       
    }
    
    public void loadMoney(double amount){
        if(amount < 0){
            this.balance = this.balance;
        }else if((this.balance + amount) > 150){
            this.balance = 150;
        }else{
            this.balance += amount;
        }
            
    }
    
    //@Override
    public String toString(){
        return "The card has " + this.balance + " dollars";
    }
    
    
}