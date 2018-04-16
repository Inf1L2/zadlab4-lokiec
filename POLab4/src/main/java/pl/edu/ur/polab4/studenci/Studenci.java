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
public class Studenci {
    Student tab[] = new Student[100];

    public Studenci() {
        for (int i=0;i<100;i++){
            Student st= new Student("","","",0,0);
            tab[i]=st;
        }
    }
    public void wyswietlDane(int start, int end){
        for (int i=start;i<=end;i++){
            System.out.println("=>Imie: "+tab[i].imie+" Nazwisko: "+tab[i].nazwisko+" Kierunek: "+tab[i].nazwa_specjalnosci+" Nr.albumu: "+tab[i].nr_indesku+" Rok: "+tab[i].rok_studiow);
        }
    }
    public void usunStudenta(int indeks){
            tab[indeks].imie="";
            tab[indeks].nazwisko="";
            tab[indeks].nazwa_specjalnosci="";
            tab[indeks].nr_indesku=0;
            tab[indeks].rok_studiow=0;  
    }
    public void wprowadzStudenta(int indeks){
        boolean warunek=false;
        if(tab[indeks].nr_indesku!=0){
            System.out.println("Podana lokacja jest zajęta! Kontynuacja spowoduje nadpisanie danych!\n"
                             + "Czy chcesz kontynuować? Wpisz [tak]/[nie]");
            if(akceptacja()!=1){
            warunek=true;
            }
        }
        if(warunek==false){
            Scanner wczytaj = new Scanner(System.in);
            System.out.print("Podaj imie: ");
            tab[indeks].imie=wczytaj.next();
            System.out.print("Podaj nazwisko: ");
            tab[indeks].nazwisko=wczytaj.next();
            System.out.print("Podaj kierunek: ");
            tab[indeks].nazwa_specjalnosci=wczytaj.next();
            System.out.print("Podaj nr indeksu: ");
            tab[indeks].nr_indesku=wczytaj.nextInt();
            System.out.print("Podaj rok studiów: ");
            tab[indeks].rok_studiow=wczytaj.nextInt();
        }
    }
    public int znajdzPoIndeksie(int a){
        for (int i=0;i<=99;i++){
            if(tab[i].nr_indesku==a){
            return i;
        }
        }
    return 100;
    }
    public void edycjaPoIndeksie(int a){
        int nrind=znajdzPoIndeksie(a);
        if((nrind>=0)&&(nrind<=99)){
        wyswietlDane(nrind,nrind);
        wprowadzStudenta(nrind);
        }else{
            System.out.println("Nie znaleziono studenta o takim indeksie");
        }
    }
    public void wyswietlPoIndeksie(int a){
        int nrind=znajdzPoIndeksie(a);
        if((nrind>=0)&&(nrind<=99)){
        wyswietlDane(nrind,nrind);
        }else{
            System.out.println("Nie znaleziono studenta o takim indeksie");
        }    
    }
    public void usunPoIndeksie(int a){
        int nrind=znajdzPoIndeksie(a);
        if((nrind>=0)&&(nrind<=99)){
        System.out.println("Kontynuować?[tak]/[nie]");
        wyswietlDane(nrind,nrind);
        if(akceptacja()==1){
        usunStudenta(nrind);}
        }else{
            System.out.println("Nie znaleziono studenta o takim indeksie");
        }       
    }
    private int akceptacja(){
        Scanner wczytaj = new Scanner(System.in);
        if (wczytaj.next().equalsIgnoreCase("tak")){
            return 1;
        }
    return 0;
    }


    

    
}