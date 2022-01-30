public class DoubleAritthmetic {

    public static void main(String[] args) {
        double number1 = 42;
        double number2 = -38.5;
        double addition = number1 + number2; // dodawanie wartosci z dwoch zmiennych
        double subtraction = number1 - number2; // odejmowanie wartosci
        double multiplication = number1 * number2; // mnozenie
        double division = number1 / number2;  // dzielenie
        double modulo = number1 % number2; // reszta z dzielenia
        // 42 / -38 -> -1.1052... NIE w JAVA
        // int sluzy do liczb calkowitych
        // wiec obcinamy czesc ulamowa
        // 42 / -38 -> -1
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println(42.0 % 5.1);
        System.out.println(5.1 % 42.0);
        System.out.println(-5.0 % 42.0);
    }

}


