public class Unary {

    public static void main(String[] args) {

        boolean isMainDoorWideOpen = true;

        boolean isIT = !isMainDoorWideOpen;

        System.out.println(isIT);
        System.out.println(isMainDoorWideOpen);

        //negacja liczby

        int negativeNumber = -167;
        int positiveNumber = -negativeNumber; // operator negacji liczby

        System.out.println(negativeNumber);
        System.out.println(positiveNumber);
        // dekrementacja i inkrementacja
        int number = 100;
        int postIncrement = number++;
        // tak na prawde dzieje sie to:
        // int postIncrement = number;
        // number = number + 1;
        number = 100;
        int preIncrement = ++number;
        // tak na prawde dzieje sie to:
        // number = number + 1;
        // int preIncrement = number;
        System.out.println(postIncrement);
        System.out.println(preIncrement);
        // dekrementacja robi to co wyzej, tylko zamiast dodawac 1, to odejumuje 1

    }
}
