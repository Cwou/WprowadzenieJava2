public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb, wypisywanie ich a potem tej wylosowanej
        System.out.println("Losowanie 6 liczb");

        //tablica
        int [] wylosowane = new int[6];

        //tablice w Javie nie mogą mieć zmienianego rozmiaru podczas działań
        //tablice w Javie przechowują typy proste lub złożone

        for(int i = 0; i<wylosowane.length; i++){
            wylosowane[i] = (int)(Math.random() * 100 + 1);
        }
        for(int wyloswartosc :wylosowane){
            System.out.println(wyloswartosc + " ");
        }
    }
}