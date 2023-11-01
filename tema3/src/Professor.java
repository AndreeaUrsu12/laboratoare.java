public class Professor extends Person {
    @Override
    public String toString() {
        return "Profesor{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }

    public Professor(String nume, String prenume) {
        // Professor obj = new Professor(nume, prenume);
        this.nume = nume;
        this.prenume = prenume;
    }

    public Professor() {

        this.nume = " ";
        this.prenume = " ";
    }
}