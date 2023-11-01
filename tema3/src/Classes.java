public class Classes {

    public static void main(String[] args) {

        // definire studenti
        Student[] studenti = new Student[] { new Student("Andrei", "Negoita", 2231),
                new Student("Ion", "Mateescu", 4221),
                new Student("Alexandru", "Vasile", 4221)

        };
        // definire profesor
        Professor prof = new Professor("Anton", "Panaitescu");
        // definire curs nou
        Course curs = new Course("Masuratori electronice", "Semnale, semnale sinusoidale,semnale periodice,\n"
                + "Erori, Propagarea erorilor in masuratorile indirecte, Acuratete si precizie, Metoda Kragten\n"
                + "Unitati de masura de nivel, Diporti, Caracteristica de frecventa\n\n",
                prof, studenti);
        // adaugare curs in lista de cursuri
        CourseManager cursuri = new CourseManager();
        // curs.UpdateCurs("nume", "descriere");
        cursuri.AddCourse(curs);
        curs.RemoveStudent(new Student("Andrei", "Negoita", 2231));
        curs.UpdateStudent(new Student("Andreea", "Ilie", 4444));
        cursuri.UpdateCourse(curs);
        curs.UpdateCourse("ME", "Bine ati venit la cursul de Masuratori in electronica si telecomunicatii!!");


    }

}

