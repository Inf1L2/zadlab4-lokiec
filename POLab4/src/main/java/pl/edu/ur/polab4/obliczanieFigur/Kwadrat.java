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
public class Kwadrat {
    float a;

    public Kwadrat(float a) {
        this.a = a;
    }
    
    public double liczPole(){
        double pole;
        pole = a*a;
        return pole;
    }
    public double liczObwod(){
        double obwod;
        obwod = 4*a;
        return obwod;
    }
    public double liczPrzekatna(){
        double przekatna;
        przekatna = Math.sqrt(a)*a;
        return przekatna;
    }
    public void wyswietlDane(){
        System.out.println("Kwadrat:");
        System.out.println("Bok: "+a);
        System.out.println("Przekatna: "+liczPrzekatna());
        System.out.println("Pole: "+liczPole());
        System.out.println("Obwod: "+liczObwod());
    }
}