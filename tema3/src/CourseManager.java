import java.util.Arrays;

public class CourseManager implements ManagerCourseOperations {
    Course[] cursuri;

    public CourseManager() {
        cursuri = new Course[0];
    }

    @Override
    public void AddCourse(Course curs) {
        int noualungime = cursuri.length + 1;
        Course[] aux = new Course[noualungime];
        int index = 0;
        for (Course c : cursuri) {
            aux[index++] = c;
        }
        // la final adaugam noul curs pe ultimul index
        aux[index] = curs;
        // si realocam lista de curs cu aux;
        this.cursuri = new Course[noualungime];
        System.arraycopy(aux, 0, cursuri, 0, noualungime);
    }


    @Override
    public void UpdateCourse(Course curs) {

        for (Course c : cursuri) {
            if (c.nume == curs.nume) {
                c.descriere = curs.descriere;
                c.nume = curs.nume;
                c.profu = curs.profu;

            }
        }

    }

    @Override
    public void DeleteCourse(Course curs) {

        cursuri = Arrays.copyOf(cursuri, cursuri.length - 1);

    }
}