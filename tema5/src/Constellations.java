public class Constellations implements Comparable<Constellations> {
    String name;
    String abbreviation;
    String genitive;
    String meaning;
    String brightestStar;

    // Constructor, getters, setters...
    public Constellations(String name, String abbreviation, String genitive, String meaning, String brightestStar) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.genitive = genitive;
        this.meaning = meaning;
        this.brightestStar = brightestStar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getGenitive() {
        return genitive;
    }

    public void setGenitive(String genitive) {
        this.genitive = genitive;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getBrightestStar() {
        return brightestStar;
    }

    public void setBrightestStar(String brightestStar) {
        this.brightestStar = brightestStar;
    }

    @Override
    public int compareTo(Constellations other) {
        // Comparăm în funcție de un anumit câmp, de exemplu, după abreviere
        return this.brightestStar.compareTo(other.brightestStarn);
    }
}

