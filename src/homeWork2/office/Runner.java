package homeWork2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Михалыч");
        Manager manage = new Manager("Валера");
        Security security = new Security("Джонни");
        Secretary secretary = new Secretary();
        Office office = new Office(boss, manage, secretary, security);
        office.workDay();
    }
}
