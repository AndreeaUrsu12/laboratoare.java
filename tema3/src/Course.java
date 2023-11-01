public class Course implements CourseOperations {
    String nume;
    String descriere;
    Professor profu;
    Student[] studenti;

    @Override
    public void RemoveStudent(Student student) {
        // lucrand cu array trebuie inserat folosind un sir auxiliar
        int noualungime = studenti.length - 1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for (Student s : studenti) {
            if (s.nume == student.nume) {
                continue;
            }
            aux[index++] = s;

        }
        // si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0, noualungime);
    }

    @Override
    public void UpdateStudent(Student student) {

        for (Student s : studenti) {
            if (s.nume == student.nume) {
                s.prenume = student.prenume;
                s.grupa = student.grupa;
            }
        }

    }

    @Override
    public void UpdateCourse(String nume, String descriere) {
        this.descriere = descriere;
        this.nume = nume;

    }

    public Course(String nume, String descriere, Professor profu, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
        this.studenti = studenti;
    }

    public void UpdateProfessor(Professor profu) {
        this.profu = profu;
    }

    public void AddStudent(Student student) {
        // lucrand cu array trebuie inserat folosind un sir auxiliar
        int noualungime = studenti.length + 1;
        Student[] aux = new Student[noualungime];
        int index = 0;
        for (Student s : studenti) {
            aux[index++] = s;
        }
        // la final adaugam noul student pe ultimul index
        aux[index] = student;
        // si realocam lista de studenti cu aux;
        this.studenti = new Student[noualungime];
        System.arraycopy(aux, 0, studenti, 0, noualungime);
    }

    @Override
    public String toString() {
        String str = "Curs: " + "nume=" + nume + ", descriere=" + descriere + ",\nprofu=" + profu + ",\nstudenti:\n";
        for (Student s : studenti) {
            str += s + "\n";
        }
        return str;
    }

}