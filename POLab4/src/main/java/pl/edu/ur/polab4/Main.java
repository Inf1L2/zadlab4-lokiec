package pl.edu.ur.polab4;
import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.studenci.Studenci;

public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    static Studenci baza= new Studenci();
    public static void main(String[] args) {
        
        menu(0);
    }
    
    private static int wybierzOpcje(){
        Scanner wczytaj= new Scanner(System.in);
    return wczytaj.nextInt();
    }
    private static float wczytajFloat(){
        Scanner wczytaj= new Scanner(System.in);
        return wczytaj.nextFloat();
    }
    private static double wczytajDouble(){
        Scanner wczytaj= new Scanner(System.in);
        return wczytaj.nextDouble();
    }
    private static void wczytajEnter(){
        Scanner wczytaj= new Scanner(System.in);
        wczytaj.nextLine();
    }
    
    private static void cls(){
        for (int i = 0; i < 200; ++i) System.out.println();}
    
    private static void menu(int menu){
        
        switch (menu){
            case 0:
                cls();
                System.out.println("MENU");
                System.out.println("Wybierz numer zadania: ");
                System.out.println("4 - Figury geometrycznych");
                System.out.println("5 - Baza studentów");
                System.out.println("0 - Exit");
                System.out.print(">");
                menu(wybierzOpcje());
                
                break;
            case 4:
                cls();
                System.out.println("Zadanie 4");
                System.out.println("Wybierz figure:");
                System.out.println("1 - Kolo");
                System.out.println("2 - Kula");
                System.out.println("3 - Kwadrat");
                System.out.println("4 - Prostokat");
                System.out.println("5 - Prostopadloscian");
                System.out.println("6 - Stozek");
                System.out.println("7 - Szescian");
                System.out.println("0 - Exit");
                System.out.print(">");podmenu1(wybierzOpcje());
                
                break;
            case 5:
                cls();
                System.out.println("Zadanie 5");
                System.out.println("Wybierz opcje:");
                System.out.println("1 - Wprowadzić studenta pod indeks tablicy");
                System.out.println("2 - Edytować dane studenta po numerze jego indeksu");
                System.out.println("3 - Usunąć studenta po numerze jego indeksu"
                System.out.println("4 - Wyświetlić dane studenta o podanym indeksie");
                System.out.println("5 - Wyświetlić wszystkich studentów");
                System.out.println("6 - Wyświetlić studentów w podanym zakresie tablicy");
                System.out.println("-1 - Exit");
                System.out.print(">");podmenu2(wybierzOpcje());
            case -1:
                cls();
                System.out.println("Exit");
                break;
            default:
                break;

        }
    }
    private static void podmenu1(int menu){
        
        switch (menu){
            case 0:
                menu(0);
                break;
            case 1:
                cls();
                System.out.println("Podaj promień kola:");
                Kolo kolo1 = new Kolo(wczytajFloat());
                kolo1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            case 2:
                cls();
                System.out.println("Podaj promień kuli!");
                Kula kula1 = new Kula(wczytajFloat());
                kula1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            case 3:
                cls();
                System.out.println("Podaj bok!");
                Kwadrat kwadrat1 = new Kwadrat(wczytajFloat());
                kwadrat1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            case 4:
                cls();
                System.out.println("Podaj kolejno dwa boki!");
                Prostokat prostokat1 = new Prostokat(wczytajDouble(),wczytajDouble());
                prostokat1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            case 5:
                cls();
                System.out.println("Podaj kolejno dwa boki, a następnie wysokość!");
                Prostopadloscian prostopadloscian1 = new Prostopadloscian(wczytajDouble(),wczytajDouble(),wczytajDouble());
                prostopadloscian1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            case 6:
                cls();
                System.out.println("Co chcesz podać?");
                System.out.println("1 - promień i wysokość");
                System.out.println("2 - promień i tworzącą");
                if(wybierzOpcje()==1){
                    System.out.println("Podaj promien i wysokosc:");
                    Stozek stozek1 = new Stozek(wczytajDouble(),wczytajDouble(),1);
                    stozek1.wyswietlDane();
                    System.out.println("Wcisnij ENTER aby kontynuowac");
                    wczytajEnter();
                    menu(4);
                }else{
                    System.out.println("Podaj promien i tworzaca:");
                    Stozek  stozek1 = new Stozek(wczytajDouble(),wczytajDouble(),0);
                    stozek1.wyswietlDane();
                    System.out.println("Wcisnij ENTER aby kontynuowac");
                    wczytajEnter();
                    menu(4);
                }
                break;
            case 7:
                cls();
                System.out.println("Podaj bok!");
                Szescian szescian1 = new Szescian(wczytajDouble());
                szescian1.wyswietlDane();
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(4);
                break;
            default:
                cls();
                System.out.println("Nie ma takiej opcji");
                System.out.println("Wcisnij ENTER aby powrócić do poprzedniego menu ...");
                menu(4);
                break;

        }
    }
    
    private static void podmenu2(int menu){
        
        switch (menu){
            case 0:
                menu(0);
                break;
            case 1:
                cls();
                System.out.println("Podaj nr indexu:");
                baza.wprowadzStudenta(wybierzOpcje());
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            case 2:
                cls();
                System.out.println("Podaj nr indeksu:");
                baza.edycjaPoIndeksie(wybierzOpcje());
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            case 3:
                cls();
                System.out.println("Podaj nr indeksu:");
                baza.usunPoIndeksie(wybierzOpcje());
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            case 4:
                cls();
                System.out.println("Podaj numer indeksu:");
                baza.wyswietlPoIndeksie(wybierzOpcje());
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            case 5:
                cls();
                baza.wyswietlDane(0, 99);
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            case 6:
                cls();
                System.out.println("Podaj zakres [0-99]");
                baza.wyswietlDane(wybierzOpcje(),wybierzOpcje());
                System.out.println("Wcisnij ENTER aby kontynuowac");
                wczytajEnter();
                menu(5);
                break;
            default:
                cls();
                System.out.println("Nie ma takiej opcji");
                System.out.println("Wcisnij ENTER aby powrócić do poprzedniego menu");
                menu(5);
                break;

        }
    }
}
