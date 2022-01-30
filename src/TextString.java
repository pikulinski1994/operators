public class TextString {
    public static void main(String[] args) {
        String message = "Mam dla Ciebie wiadomość!";
        String lowerCaseMessage = message.toLowerCase();
        System.out.println(message);
        System.out.println(lowerCaseMessage);
        String longerMessage = message.concat(" Dobrą wiadomość");
        System.out.println(message);
        System.out.println(longerMessage);
        String longerMessagePlus = message + " Dobrą wiadomość";
        System.out.println(longerMessagePlus);
        String messageWithNumber = message + 42;
        // message + 42 -> message + "42" -> "Mam dla Ciebie wiadomość!" + "42" -> "Mam dla Ciebie wiadomość!42"
        System.out.println(messageWithNumber);
        String empty = "";
        boolean isStringEmpty = empty.isEmpty();
        System.out.println("so is it empty? " + isStringEmpty);
        String sentence = "Bartek ma kota, Bartek bardzo tego kota lubi";
        String hamster = sentence.replaceAll("kota", "chomika");
        String konrad = hamster.replaceAll("Bartek", "Konrad");
        System.out.println(sentence);
        System.out.println(hamster);
        System.out.println(konrad);
        String konradSingle = sentence.replaceAll("kota", "chomika").replaceFirst("Bartek", "Konrad");
        System.out.println(konradSingle);
    }

}
