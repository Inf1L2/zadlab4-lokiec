/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.studenci;

/**
 *
 * @author lokyiec
 */
public class Student {
    String imie,nazwisko,nazwa_specjalnosci;
    int nr_indesku,rok_studiow;

    public Student(String imie, String nazwisko, String nazwa_specjalnosci, int nr_indesku, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_indesku = nr_indesku;
        this.rok_studiow = rok_studiow;
    }
    
}