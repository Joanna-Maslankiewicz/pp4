import java.util.*;

public class Zajecia {
    private String nazwaZajec;
    private ArrayList<String> listaStudentow = new ArrayList<String>();

    public String getNazwaZajec() {
        return nazwaZajec;
    }

    public void setNazwaZajec(String nazwaZajec) {
        this.nazwaZajec = nazwaZajec;
    }

    public void zapiszStudenta(String nazwaStudenta) {
        if (listaStudentow.size() <= 10) {
            listaStudentow.add(nazwaStudenta);
        } else {
            System.out.println("Na zajęciach może być maksymalnie 10 studentów!");
        }
    }
}
