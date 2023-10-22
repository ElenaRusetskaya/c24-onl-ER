package lesson20;

import java.sql.*;

public class Main1
{
    /**
     * Задача 1:
     * 1.1 Создать модель пользователя в Java(User).
     * 1.2 Создать соответствующую модели таблицу в базе данных(users).
     * 1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
     * 1.4 Распарсить данные из ResultSet в объект User.
     * Задача 2:
     * Вытянуть из базы данных среднее значение возраста пользователей из таблицы users
     */
    public static void main(String[] args) throws SQLException
    {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/c24-onl-db", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user where id=1");
        if (resultSet.next())
        {
            User user = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
            System.out.println("id: " + user.getId() + ", name: " + user.getName() + ", age: " + user.getAge());
        }
        else
        {
            System.out.println("Error1");
        }
        ResultSet resultSet1 = statement.executeQuery("SELECT AVG(age) AS age FROM user");
        if (resultSet1.next())
        {
            double age = resultSet1.getDouble("age");
            System.out.println("Average age of users: " + age);
        }
        else
        {
            System.out.println("Error2!");
        }
    }
}
