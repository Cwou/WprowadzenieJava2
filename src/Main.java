import java.util.*;

public class Main {
    public static void main(String[] args) {
        // losowanie bez powtórzeń
        // zamiast tablicy, będą kolekcje
        // kolekcji można zmieniać rozmiar podzczas działania
        // kolekcja przechowuje tylko typy złożone
        // Set - zbiór elementy nie będą się powtarzały
        // w zbiorze elementy nie są indexowane (nie można wyznaczyć 4 elementu tablicy)

        Set<Integer> wylosowane = new HashSet<>();
        while(wylosowane.size() < 6) {
            wylosowane.add((int)(Math.random()*100));
        }
        //System.out.println("Wylosowano: " + wylosowane);
        // wczytywanie z klawiatury 6 liczb
        Scanner klawiatura = new Scanner(System.in);
        List<Integer> wpisane = new ArrayList<>();
        //lista elementy mogą się powtarzać
        //lista ma indexowane elementy
        System.out.println("Podaj 6 liczb");
        for(int i = 0; i < 6; i++){
            System.out.println("Liczba " + i);
            int wczytanawart = klawiatura.nextInt();
            while(wpisane.contains(wczytanawart)){
                System.out.println("Taka liczba już została podana");
                wczytanawart = klawiatura.nextInt();
            }
            wpisane.add(wczytanawart);
        }
        System.out.println("Wpisane " + wpisane);

        //zapis listy która będzie zawierałą elementy które powtarzają się w wpisane 1 wylosowane

        List<Integer> trafione = new LinkedList<>();
        for(Integer wpisanawartosc : wpisane){
            if(wylosowane.contains(wpisanawartosc)){
                trafione.add(wpisanawartosc);
            }
        }
        System.out.println("Trafione " + trafione);
        }
}