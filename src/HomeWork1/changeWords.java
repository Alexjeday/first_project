package HomeWork1;

public class changeWords {
    public static void main(String[] args) {
        ex4(); }
        public static void ex4() {
            String simply ="this is simply. This is my favorite song.";
            String converted = simply.replaceAll("this is", "those are");
            int firstIndex = converted.indexOf("o");
            System.out.println(firstIndex);
            int secondIndex = converted.indexOf("o",firstIndex + 1);
            System.out.println(secondIndex);
            int thirdIndex = converted.indexOf("o",secondIndex +1 );
            System.out.println(thirdIndex);
        }
    }

