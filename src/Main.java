
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1: Uzyj loop typu for, aby wypisac liczby od 1 do 20 (kazda w nowej linii).");

        for (int i = 1; i<= 20;  i++) {
            System.out.println(i);
        }

        System.out.println("2: Uzyj loop typu for, aby wypisac liczby od 20 do 1 (kazda w nowej linii)");
        for (int i = 20; i>= 1; i--) {
            System.out.println(i);

        }

        System.out.println("3: Uzyj loop typu for, aby wypisac wszystkie liczby parzyste z zakresu 1-50.");
        for (int i = 1; i<= 50;  i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("4: Uzyj loop typu for, aby policzyc sume liczb od 1 do 100 i wypisz wynik.");
        int sto = 0;
        for (int i = 1; i <= 100; i++) {
            sto += i;

        }
        System.out.println(sto);

        System.out.println("5: Dla podanej liczby n wypisz tabliczke mnozenia od 1 do 10 (loop typu for)");
        int numberFive = 5;
        int multiplication = 0;

        for (int i = 1; i<= 10; i++) {
           multiplication =  numberFive * i;
            System.out.println(multiplication);
        }

        System.out.println("6: Wypisz kolejne potegi liczby 2 od 2^0 do 2^10 (loop typu for)");
        int potega = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.println("2^" + i + " = " + potega);
            potega = potega * 2;
        }

        System.out.println("7: Dla array liczb wypisz kazdy element wraz z jego index (loop typu for)");
        int[] numery = {10, 20, 30, 40, 50};
        for (int i = 0; i < numery.length; i++) {
            System.out.println("Index: " + i + " i element: " + numery[i]);
        }

        int[] numeros = {-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 13, 14, 15};
        System.out.println("9: Dla array liczb policz ile jest liczb dodatnich, ujemnych i zer (loop typu foreach)");
        int dodatnie = 0;
        int zera = 0;
        int ujemne = 0;

        for (int n : numeros) {
            if (n > 0)
                dodatnie++;
            else if (n == 0)
                zera++;
            else ujemne++;

        }
        System.out.println("Dodatnie: " + dodatnie);
        System.out.println("Liczba zer: " + zera);
        System.out.println("Ujemne: " + ujemne);

        System.out.println("9: Dla array liczb znajdz max wartosc (loop typu foreach) i wypisz ja.");
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);

        System.out.println("10: Dla List wypisz tylko te napisy, ktore maja co najmniej 5 znakow (loop typu foreach). ");
        List<String> napisy = Arrays.asList("jak", "to", "sie", "stalo", "co", "ja", "robie", "w", "Gulagu");
        for (String s : napisy) {
            if (s.length() >= 5)
                System.out.println(s);
        }

        System.out.println("11: Dla String wypisz kazdy char w osobnej linii oraz policz ile jest znakow ogolem (loop typu for)");
        String sybir = "Sybir";
        for (int i = 0; i < sybir.length(); i++) {
            System.out.println(sybir.charAt(i));
        }

        System.out.println("12: Dla String policz ile razy wystepuje litera 'a' bez rozrozniania wielkosci liter (loop typu for lub while)");
        String anakonda = "Anakonda";
        int countA = 0;
        for (int i = 0; i < anakonda.length(); i++) {
            if (anakonda.charAt(i) == 'a') {
                countA++;
            } else if (anakonda.charAt(i) == 'A') {
                countA++;
            }
        }
        System.out.println(countA);

        System.out.println("13: Zrob mini-model klas: Person(name, age). Utworz List z kilkoma osobami i (loop) wypisz tylko te osoby, ktore maja age >= 18");
        Person bielik = new Person("Bielik", 28);
        Person bielykova = new Person("Bielykova", 40);
        Person ciri = new Person("Ciri", 15);

        List<Person> persons = new ArrayList<>();
        persons.add(bielik);
        persons.add(bielykova);
        persons.add(ciri);
        for (Person p : persons) {
            if (p.getAge() >= 18) {
                System.out.println(p);
            }
        }

        System.out.println("14: Dla podanej liczby n wypisz wszystkie jej dzielniki (loop typu for)");
        int k = 20;
        List<Integer> dzielnik = new ArrayList<>();
        for (int i = 1; i <= k; i++) { // zaczynamy od 1, bo nie dziel cholero przez zero
            if (k % i == 0) {
                dzielnik.add(i);
            }
        }
        System.out.println(dzielnik);

        System.out.println("15: Zrob mini-model klas: Order(id, amount). Utworz List i (loop) policz: sume amount, srednia amount oraz liczbe Order powyzej podanego progu");

        Order dlugopis = new Order(1234, 5);
        Order zeszyt = new Order(1235, 10);
        Order linijka = new Order(1236, 10);

        List<Order> orders = new ArrayList<>();
        orders.add(dlugopis);
        orders.add(zeszyt);
        orders.add(linijka);

        int sumAmount = 0;
        int orderAmountLimit = 5;
        int orderAmount = 0;

        for (Order o : orders) {
            sumAmount += o.getAmount();
            if (o.getAmount() >= orderAmountLimit) {
                orderAmount++;
            }
        }
        int average = sumAmount / orders.size();
        System.out.println("Średnia wynosi: " + average + " Suma wynosi: " + sumAmount + " Liczba zamówień wynosi " + orderAmount);

        System.out.println("16: Uzyj loop typu while: wczytuj liczby dopoki user nie wpisze 0; na koncu wypisz sume i liczbe podanych wartosci");

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int liczbaElementow = 0;
        while (true) { // pętla bez warunku, kończy ją break
            System.out.println("Podaj liczbę (0 kończy): ");
            int liczba = sc.nextInt(); // wczytanie liczby od uzytkownika
            if (liczba == 0) {
                break;
            }
            suma += liczba; // zwiekszamy sume o liczbe uzytkowika
            liczbaElementow++; // zwiekszamy licznik(oprocz 0)
        }
        System.out.println("Suma: " + suma);
        System.out.println("Liczba elementow: " + liczbaElementow);

        System.out.println();
        System.out.println("17: Uzyj loop typu while: wczytuj String dopoki user nie wpisze 'stop'; na koncu wypisz ile wpisano tekstow oraz najdluzszy tekst");
       Scanner sc2 = new Scanner(System.in);
        int licznikElementow = 0;
        int theLongestText = 0;
        String najdluzszyTekst=" ";
        while (true) {
            System.out.println("Wpisz słowo (stop kończy): ");
            String text = sc2.nextLine();
            if (text.equals("stop")) {
                break;
            }
            if (text.length()> theLongestText) {
                najdluzszyTekst = text;
                theLongestText = text.length();

            }
            licznikElementow++;
        }
        System.out.println("Liczba elementow: " + licznikElementow);
        System.out.println("Najdłuższy tekst: " +  najdluzszyTekst + ", " + theLongestText + " znaków");

        System.out.println();
        System.out.println("18: Dla List usun wszystkie liczby ujemne bez uzycia stream; uzyj loop oraz poprawnej strategii usuwania elementow");
        //ITEROWANIE OD POCZATKU POWODUJE BLEDY BO MOZE ''ZJADAC'' INDEKSY
        List<Integer> numbers = new ArrayList<>(List.of(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28));

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);

        System.out.println();
        System.out.println("19: Dla List utworz nowa liste, w ktorej beda tylko unikalne elementy (z zachowaniem kolejnosci) i wypisz wynik; uzyj loop");
        List<String> names = new ArrayList();
        List<String> uniqueNames = new ArrayList();
        names.add("Bielik");
        names.add("Bielykova");
        names.add("Bielykova");
        names.add("Ciri");
        names.add("Sush");

        for (String n: names) {
            if  (!uniqueNames.contains(n)) {
                uniqueNames.add(n);
            }
        }
        System.out.println(uniqueNames);

        System.out.println();
        System.out.println("20: Zrob mini-model klas: Product(name, price) oraz Cart(List). Napisz logike, ktora (loop) liczy: total price, najdrozszy Product, oraz ile Product ma price >= podanej wartosci progowej");

        Product closet = new Product("Closet", 3000);
        Product desk = new Product("Desk", 4000);
        Product monitor = new Product("Monitor", 2000);

        List<Product> cart = new ArrayList<>();
        cart.add(closet);
        cart.add(desk);
        cart.add(monitor);

        int totalPrice = 0;
        int theMostExpensive = 0;
        int avaragePrice = 2000;
        String theMostExpensiveProductName = " ";
        int  countAboveThreshold = 0;

        for (Product p : cart) {
            totalPrice += p.getPrice();
            if (p.getPrice() >= theMostExpensive) {
                theMostExpensive = p.getPrice();
                theMostExpensiveProductName = p.getName();
            }
            if (p.getPrice() >= avaragePrice) {
                countAboveThreshold++;
            }
        }

        System.out.println("Total price: " + totalPrice + ", the most expensive product: " + theMostExpensiveProductName + ", number of products above threshold: " + countAboveThreshold);



    }

}








