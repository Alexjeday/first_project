package HomeWork1;

public class homeWork1 {

    public static void main(String[] args) {
            String name = "      ПЕтРов Олег Иванович     ";
            String convertedName = name.trim().toUpperCase();
            if (convertedName.contains("ова ")) {
                System.out.println("Уважаемая " + convertedName);
            } else if (convertedName.contains("ОВ")) {
                System.out.println("Уважаемый " + convertedName);
            } else  System.out.println("Личность не определена. " + convertedName);
        }
    }

