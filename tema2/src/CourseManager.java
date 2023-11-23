package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager {
    classes.Course[] courses;

    public CourseManager() {
        Connection conn = null;
        courses = new classes.Course[0];
    }

    public void AddCourse(classes.Course course) {
        int newLength = courses.length + 1;
        classes.Course[] aux = new classes.Course[newLength];
        int index = 0;
        for (classes.Course c : courses) {
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = new classes.Course[newLength];
        System.arraycopy(aux, 0, courses, 0, newLength);
    }

    public void displayCoursesToConsole() {
        for (classes.Course c : courses) {
            System.out.println(c);
        }
    }



    //ex2
    public void addStudentToCourse(String cName, classes.Student s){
        for (classes.Course c : courses)
        {
            if(cName==c.name)
                c.addStudent(s);
        }
    }


    //ex3
    public void listStudentsInCourse(String cName){
        for(classes.Course c : courses)
        {
            if(cName==c.name)
                for(classes.Student s : c.students)
                {
                    System.out.println(s);
                }
        }
    }


    //ex4
    public float averageGrade(String cName){
        for (classes.Course c : courses)
        {
            if(cName==c.name)
            {
                int length=c.students.length;
                int grade=0;
                for (classes.Student s : c.students)
                {
                    grade+=s.grade;
                }
                return grade/length;
            }
        }
    }


    //ex5
    public float averageGradeByProf(String profName){
        int length=0;
        int grade=0;
        for(classes.Course c : courses)
        {
            if(profName==c.teacher.getFullName())
            {
                for(classes.Student s : c.students)
                {
                    length++;
                    grade+=s.grade;
                }
            }
        }
        return length/grade;
    }

}
