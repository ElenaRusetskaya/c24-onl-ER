package lesson11;

import java.util.Optional;
import java.util.Scanner;

public class Registration
{
    public static void theCorrectString(String login, String password,String confirmPassword)
            throws WrongLoginException,WrongPasswordException
    {
        if (stringLength(login, 20))
        {
            throw new WrongLoginException("Error: Login - The length of the string is more than 20");
        }
        if (loginContainsSpaces(login))
        {
            throw new WrongLoginException("Error: login contains spaces");
        }
        if (stringLength(password, 20))
        {
            throw new WrongPasswordException("Error: Password - The length of the string is more than 20");
        }
        if (loginContainsSpaces(password))
        {
            throw new WrongPasswordException("Error: password contains spaces");
        }
        if (!containsNumber(password))
        {
            throw new WrongPasswordException("Error: The password must contain at least one digit");
        }
        if (!password.equals(confirmPassword))
        {
            throw new WrongPasswordException("Error: Password and confirm password must match");
        }
    }
    public static boolean stringLength(String string, int lenght)
    {
        return string.length() > lenght;
    }
    public static boolean loginContainsSpaces(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                return true;
            }
        }
        return false;
    }
    public static boolean containsNumber(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isDigit(string.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static Optional<String> symbol()
    {
        Scanner scanner = new Scanner(System.in);
        return Optional.ofNullable(scanner.nextLine());
    }
}
