package lesson13.hw3;

import java.util.ArrayList;
import java.util.List;

public class ListStudent
{
    private List<Student> list = new ArrayList<>();
    public List<Student> getList()
        {
            return list;
        }
        public void add(Student student)
        {
            list.add(student);
        }
        public void nextCourse()
        {
            for (int i = 0; i < list.size();)
            {
                if (list.get(i).getGradesBySubject() < 3)
                {
                    list.remove(i);
                }
                else
                {
                    list.get(i).nextCourse();
                    i++;
                }
            }
        }
        public void newList(int course)
        {
            for (Student student : list)
            {
                if (student.getCourse() == course)
                {
                    System.out.println(student);
                }
            }
        }
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : list)
        {
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }
}
