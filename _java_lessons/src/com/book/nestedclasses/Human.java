package book.nestedclasses;

import book.nestedclasses.exceptions.IllegalHumanNameException;

public class Human {
    private static final int MIN_NAME_LENGTH = 2;
    private String name;
    private int money;

    public static Human createHuman(String human) throws IllegalHumanNameException {
        if (human == null || human.length() < MIN_NAME_LENGTH) {
            throw new IllegalHumanNameException(human);
        }

        return new Human(human);
    }

    private Human(String name) {
        this.name = name;
    }

    private Human(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return getName();
    }

    public HumanAccount createAccount() {
        return new HumanAccount();
    }

    private class HumanAccount implements Account {

        @Override
        public void changeMoney(int delta) {
            money += delta;
        }

        @Override
        public int getSum() {
            return getMoney();
        }
    }
}
