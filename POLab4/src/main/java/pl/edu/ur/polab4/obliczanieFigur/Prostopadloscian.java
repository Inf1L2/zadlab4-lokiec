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
public class Prostopadloscian {
    double a,b,c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double polePodstawy(){
        double pp;
        pp = a*b;
        return pp;
    }
    public double poleBoczne(){
        double pb;
        pb =(2*a*c)+2*b*c;
        return pb;    
    }
    public double poleCalkowite(){
        double pc;
        pc = 2*polePodstawy()+poleBoczne();
        return pc;
    }
    public double liczObjetosc(){
        double obj;
        obj = a*b*c;
        return obj;
    }
    public double przekatnaPodstawy(){
        double przekatna;
        double ab = (a*a)+(b*b);
        przekatna = Math.sqrt(ab);
        return przekatna;
    }
    public double glownaPrzekatna(){
        double przekatna;
        double abc = (a*a+b*b+c*c);
        przekatna=Math.sqrt(abc);
        return przekatna;
    }
    public void wyswietlDane(){
        System.out.println("Prostopadloscian:");
        System.out.println("Bok a: "+a);
        System.out.println("Bok b: "+b);
        System.out.println("Bok b: "+c);
        System.out.println("Przekatna podstawy: "+przekatnaPodstawy());
        System.out.println("Glowna przekatna: "+glownaPrzekatna());
        System.out.println("Pole calkowite: "+poleCalkowite());
        System.out.println("Poble boczne: "+poleBoczne());
        System.out.println("Pole podstawy: "+polePodstawy());
        System.out.println("Objetosc: "+liczObjetosc());
    }  
}