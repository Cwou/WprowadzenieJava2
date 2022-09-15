import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // losowanie bez powtórzeń
        // zamiast tablicy, będą kolekcje
        // kolekcji można zmieniać rozmiar podzczas działania
        // kolekcja przechowuje tylko typy złożone
        // Set - zbiór elementy nie będą się powtarzały
        // w zbiorze elementy nie są indexowane (nie można wyznaczyć 4 elementu tablicy)

        Set<Integer> wylosowane = new HashSet<>();
        for(int i = 0; i < 6; i++) {
            wylosowane.add((int)(Math.random()*10));
        }
        System.out.println("Wylosowano: " + wylosowane);
        }
}