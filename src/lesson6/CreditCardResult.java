package lesson6;

public class CreditCardResult
        /**
         * Задача 1:
         * Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
         * метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
         * который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
         * выводит текущую информацию о карточке. Напишите программу, которая создает три
         * объекта класса CreditCard у которых заданы номер счета и начальная сумма.
         * Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
         * третьей. Выведите на экран текущее состояние всех трех карточек.
         */
{
    public static void main(String[] args)
    {
        CreditCard firstCreditCard = new CreditCard("963852741");
        CreditCard secondCreditCard = new CreditCard("147258369");
        CreditCard thirdCreditCard = new CreditCard("789456123");


        firstCreditCard.addValue(7);
        secondCreditCard.addValue(20);
        thirdCreditCard.withdrawSum(3);

        System.out.println("First CreditCard: ");
        System.out.println(firstCreditCard.getInfo());
        System.out.println("Second CreditCard: ");
        System.out.println(secondCreditCard.getInfo());
        System.out.println("Third CreditCard: ");
        System.out.println(thirdCreditCard.getInfo());

        System.out.println("First CreditCard: ");
        System.out.println(firstCreditCard.getValue());
        System.out.println("Second CreditCard: ");
        System.out.println(secondCreditCard.getValue());
        System.out.println("Third CreditCard: ");
        System.out.println(thirdCreditCard.getValue());
    }
}
