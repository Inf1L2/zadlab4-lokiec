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
public class Szescian {
    double a;

    public Szescian(double a) {
        this.a = a;
    }
    public double polePodstawy(){
        double pp;
        pp = a*a;
        return pp;
    }
    public double poleBoczne(){
        double pb;
        pb =a*a*4;
        return pb;    
    }
    public double poleCalkowite(){
        double pc;
        pc = 6*a*a;
        return pc;
    }
    public double liczObjetosc(){
        double obj;
        obj = a*a*a;
        return obj;
    }
    public double przekatnaPodstawy(){
        double przekatna;
        przekatna = Math.sqrt(a)*a;
        return przekatna;
    }
    public double glownaPrzekatna(){
        double przekatna;
        przekatna = Math.sqrt(3)*a;
        return przekatna;
    }
    public void wyswietlDane(){
        System.out.println("Szescian:");
        System.out.println("Bok a: "+a);
        System.out.println("Przekatna podstawy: "+przekatnaPodstawy());
        System.out.println("Glowna przekatna: "+glownaPrzekatna());
        System.out.println("Pole calkowite: "+poleCalkowite());
        System.out.println("Poble boczne: "+poleBoczne());
        System.out.println("Pole podstawy: "+polePodstawy());
        System.out.println("Objętosc: "+liczObjetosc());
    }
}