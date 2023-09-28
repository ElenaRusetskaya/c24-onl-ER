package lesson13.hw3;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String name;
    private String group;
    private int course;
    private List<Integer> grades = new ArrayList<>();
    public Student(String name, String group, int course, int... grades)
    {
        this.name = name;
        this.group = group;
        this.course = course;
        for (int grades1 : grades)
        {
            this.grades.add(grades1);
        }
    }
    public String getName()
    {
        return name;
    }
    public String getGroup()
    {
        return group;
    }
    public int getCourse()
    {
        return course;
    }
    public List<Integer> getGrades()
    {
        return grades;
    }
    public double getGradesBySubject()
    {
        int sum = 0;
        for (int grades1 : grades)
        {
            sum += grades1;
        }
        return (double) sum / grades.size();
    }
    public void nextCourse()
    {
        course++;
    }
    @Override
    public String toString()
    {
        return "Student: " + name + ", Group: " + group + ", Course: " + course + ", Average rating: " + getGradesBySubject();
    }
}
