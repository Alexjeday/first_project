package homeWork2.office;

public class Secretary {



    public void keepCalm(Boss boss, Manager manager, Security security) {
        String secretarySpeech = "%s Не волнуйтесь, %s Все успеет, %s Подождите".formatted(boss.getName(),
                manager.getName(), security.getName());
        System.out.println(secretarySpeech);
      //  System.out.println("%s Не волнуйтесь, %s Все успеет, %s Подождите",
          //      boss.getName(), manager.getName(),security.getName());


    }
}
