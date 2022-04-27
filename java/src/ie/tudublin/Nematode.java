package ie.tudublin;

public class Nematode {
    String name;
    int length;
    int lims;
    String gender;
    int eyes;

    public Nematode() {

    }

    public Nematode(String name, int length, int lims, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.lims = lims;
        this.gender = gender;
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLims() {
        return lims;
    }

    public void setLims(int lims) {
        this.lims = lims;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Nematode{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", lims=" + lims +
                ", gender='" + gender + '\'' +
                ", eyes=" + eyes +
                '}';
    }
}
