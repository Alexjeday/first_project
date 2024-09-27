package HomeWork1;

public class carDrive {
    public static void main(String[] args) {
        ex3();
    }
    public static void ex3() {
        //Количество топлива
        double fuel = 10;
        // Engine work or not
        boolean isEngineWork = false;
        // Has errors or not(false is not errors)
        boolean hasErrors = false;
        // sensor pressure tires
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;
    if (fuel >=10
        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
        && !hasErrors && isEngineWork
        ) {
            System.out.println("Car is driving "); }
        else {System.out.println("Car is not driving ");
        }

    }
}
