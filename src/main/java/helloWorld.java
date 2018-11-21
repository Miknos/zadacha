import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Ваш вес на луне");
        System.out.println ("-----------------------------------------------------------");
        System.out.print ("Введите ваш рельный вес>>>");
        //System.out.println ("Нажмите кнопку Enter на клавиатуре");
        double weightPeopleErth = keyboard.nextDouble();
        double weightPeopleMoon = weightPeopleErth*0.17;
        System.out.println ("-----------------------------------------------------------");
        System.out.println (weightPeopleMoon);

    }
}

