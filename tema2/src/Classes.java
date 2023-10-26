package calsses;
public class Classes {
    public static void main(String[] args){
        classes.Student[] students=new classes.Student[][](new classes.Student("Andrei", "Negoita", 2231), new classes.Student("Ion", "Mateescu", 4221));
        classes.Professor prof=new classes.Professor("Anton", "Panaitescu");
        classes.Course course=new classes.Course("Material Resistance", "Calculations of reactions ,\n" + "effort diagrams, calculation of geometric characteristics of\n" + "flat surfaces and calculation of resistance elements to simple stresses\n", prof, students);
        classes.CourseManager courseManager=new classes.CourseManager();
        courseManager.AddCourse(course);
        courseManager.displayCoursesToConsole();
    }
}

