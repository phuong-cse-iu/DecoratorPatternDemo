/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatterndemo;

/**
 *
 * @author TranTPhuong
 */
public class Milk extends Beverage {
    Beverage beverage;
    
    public Milk() {
        description = "Milk";
    }
    @Override
    public double cost() {
        return 1.0;
    }
    
}
