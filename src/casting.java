public class casting {
    public static void main(String[] args) {
        int n = 1232;
        byte b = 18;
        long l = 12312313333333333L;
        long nAsLong = n; // nie trzeba jawie rzutowac typu mniej pojemnego na bardziej pojemny, np. int -> long
        int lAsInt = (int) l; // typ bardziej pojemny trzeba jawnie rzutowac na mniej pojemny, np. long -> int
        System.out.println(nAsLong);
        System.out.println(lAsInt);
        char c = (char) n;
        char c2 = '!';
        System.out.println(c);
        System.out.println(c2);
        System.out.println((int) c2);
        // dzielenie intow by dostac ulamek
        int n1 = 123;
        int n2 = 16;
        float division = (float) (n1 / n2);
        System.out.println(division);
        float n3 = 16.0f;
        float divisionFloat =  n1 / (float) n2; // n1 / ( (float) n2 ) - taka jest kolejnosc dzialan
        // n2 jest rzutowane jawnie, kontekst dzielenia zmienia sie na floatowy, wiec n1 nie trzeba rzutoweac
        // bo jest rzutowanie niejawnie
        System.out.println(divisionFloat);
    }

}
