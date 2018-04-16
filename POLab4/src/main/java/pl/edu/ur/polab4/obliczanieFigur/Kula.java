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
public class Kula {
    float r;

    public Kula(float r) {
        this.r = r;
    }
    
    public double liczObjetosc(){
        double v;
        v=((4/3)*Math.PI*r*r*r);
        return v;
    }
    public double liczPole(){
        double p;
        p=4*Math.PI*r*r;
        return p;
    }
    public void wyswietlDane(){
        System.out.println("Kula:");
        System.out.println("Promien: "+r);
        System.out.println("Sredniaca: "+2*r);
        System.out.println("Pole: "+liczPole());
        System.out.println("Objetosc: "+liczObjetosc());
    }    
}