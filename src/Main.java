public class Main {
    public static void main(String[] args) {
        int amount = 7267; //начальный счет
        int deposit = 3775; //сумма пополнение счета

        int bonus = deposit > 1000 ? deposit / 100 : 0; //условие начисления бонусов

        /* if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        } */

        int sum = amount + deposit + bonus; //общая сумма счета
        System.out.println("Счет пополнен, доступно " + sum);
        System.out.println("Начислено бонусов " + bonus);

    }
}