import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Integer> wylosowane = new HashSet<>();
        wylosowane = losowanieliczb(6);


        List<Integer> wpisane = new ArrayList<>();
        wpisane = (List<Integer>) wpisanieliczb();
        System.out.println("Wpisane " + wpisane);

        List<Integer> trafione = new LinkedList<>();
        trafione = podsumowanie(wylosowane, wpisane);
        System.out.println("Trafione " + trafione);
        }

    public static List<Integer> podsumowanie(Set<Integer> wylosowane, List<Integer> wpisane){
        List<Integer> trafione = new LinkedList<>();
        for(Integer wpisanawartosc : wpisane){
            if(wylosowane.contains(wpisanawartosc)){
                trafione.add(wpisanawartosc);
            }
        }
        return trafione;
    }


        public static Set<Integer> losowanieliczb(int n){
        Set<Integer> wylosowane = new HashSet<>();
            while(wylosowane.size() < n) {
                wylosowane.add((int)(Math.random()*100));
            }
            return wylosowane;
        }

        public static Set<Integer> wpisanieliczb(){
            Scanner klawiatura = new Scanner(System.in);
            List<Integer> wpisane = new ArrayList<>();

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
            return (Set<Integer>) wpisane;
        }


}