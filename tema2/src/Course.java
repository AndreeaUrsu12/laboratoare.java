package classes;
public class Course {
    String name;
    String description;
    classes.Professor teacher;
    classes.Student[] students;

    public Course(String name, String description, classes.Professor teacher, classes.Student[] students){
        this.name=name;
        this.description=description;
        this.teacher=teacher;
        this.students=students;
    }
    public void updateProfessor(classes.Professor teacher){
        this.teacher=teacher;
    }
    public void addStudent(classes.Student student){
        int newLenght=students.length+1;
        classes.Student[] aux=new classes.Student[newLenght];
        int index=0;
        for(classes.Student s : students)
        {
            aux[index++]=s;
        }
        aux[index]=student;
        this.students=new classes.Student[newLenght];
    }

    @Override
    public String toString() {
        String str = "Course: " + "name= " + name + ", description= " + description + ",\nTeacher= " + teacher + ",\nStudents:\n";
        for (classes.Student s : students)
        {
            str += s + "\n";
        }
        return str;
    }

}
