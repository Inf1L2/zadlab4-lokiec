/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author lokyiec
 */
public class Kolo {
    float r;

    public Kolo(float r) {
        this.r = r;
    }
    
    public double liczPole(){
        double pole;
        pole = Math.PI*r*r;
        return pole;
    }
    
    public double liczObwod(){
        double obwod;
        obwod = 2*Math.PI*r;
        return obwod;
    }
    public void wyswietlDane(){
        System.out.println("Kolo:");
        System.out.println("Promien: "+r);
        System.out.println("Sredniaca: "+2*r);
        System.out.println("Obwod: "+liczObwod());
        System.out.println("Pole: "+liczPole());
    } 
}