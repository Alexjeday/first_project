package homeWork2;

public class ex1 {
    public static void main(String[] args) {

        String[] words = {"Это", "Шашлык", "на", "шампуре"};
        String result = "";
        for (String word : words) {
            result += word+" - ";
        }
        System.out.println(result);
    }
}
