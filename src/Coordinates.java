/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus1
 */
public class Coordinates {
    private int x;
    private int y;
    
    Coordinates(){
        x = 0;
        y = 0;
    }
    
    Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int x(){
        return x;
    }
    
    public int y(){
        return y;
    }
}
