package lesson11;

public class Main
{
    /**
     * Задача 1:
     * Создать класс, в котором будет статический метод. Этот метод принимает на вход три
     * параметра: login, password, confirmPassword. Все поля имеют тип данных String.
     * Длина login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
     * соответствует этим требованиям, необходимо выбросить WrongLoginException.
     * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен
     * содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
     * Если password не соответствует этим требованиям, необходимо выбросить
     * WrongPasswordException.
     * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
     * – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
     * Метод возвращает true, если значения верны, false в противном случае.
     */
    public static void main(String[] args)
    {
        String login = "";
        String password = "";
        String confirmPassword = "";
        System.out.println("Registration");
        System.out.println("Enter your username: ");
        login = Registration.symbol().get();
        System.out.println("Enter the password: ");
        password = Registration.symbol().get();
        System.out.println("Repeat the password: ");
        confirmPassword = Registration.symbol().get();
        try
        {
            Registration.theCorrectString(login, password, confirmPassword);
            System.out.println("Registration was successful!");
        }
        catch (WrongLoginException | WrongPasswordException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
