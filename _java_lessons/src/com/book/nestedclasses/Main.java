package book.nestedclasses;

import book.nestedclasses.exceptions.IllegalHumanNameException;

public class Main {
    public static void main(String[] args) {
        Human nullName = null;
        try {
            nullName = Human.createHuman(null);
            System.out.println(nullName.getName());
        } catch (IllegalHumanNameException e) {
            System.out.println("Name error!");
        } finally {
            System.out.println("People are still alive :)");
        }

//        Account debit = max.createAccount();
//        debit.changeMoney(50);
//        Account credit = max.createAccount();
//        credit.changeMoney(13);
//        System.out.println(max.getMoney());
//        Human nadya = new Human("Nadya");
//        Building building = new Building();
//        building.addHumanToBuilding(max);
//        building.addHumanToBuilding(nadya);
//
//        for (Human human : building) {
//            System.out.println("In building lives: " + human);
//        }
    }
}
