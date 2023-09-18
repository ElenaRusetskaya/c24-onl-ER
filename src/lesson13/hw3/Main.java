package lesson13.hw3;

public class Main
{
    /**
     * Задача 3:
     * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
     * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
     * Написать метод, который удаляет студентов со средним баллом <3. Если средний
     * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
     * printStudents(List<Student> students, int course), который получает список студентов и
     * номер курса. А также печатает на консоль имена тех студентов из списка, которые
     * обучаются на данном курсе.
     */
    public static void main(String[] args)
    {
        ListStudent listStudent = new ListStudent();
        System.out.println("List of students:");
        listStudent.add(new Student("Student1", "221", 2, 7, 5, 3, 2, 6));
        listStudent.add(new Student("Student2", "441", 4, 3, 2, 2, 3, 4));
        listStudent.add(new Student("Student3", "331", 3, 8, 8, 5, 4, 7));
        System.out.println(listStudent);
        listStudent.nextCourse();
        System.out.println("List of students who have transferred to the next course:");
        System.out.println(listStudent);
    }
}
