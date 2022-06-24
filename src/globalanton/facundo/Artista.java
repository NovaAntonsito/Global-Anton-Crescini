package globalanton.facundo;

import java.util.Date;

public class Artista extends SerCantor {

    public String nombre;
    public ArrayList<Instrumentos> instrumentosArrayListArray = new ArrayList();
    public Date fecha;


    public Artista(String nombre, String instrumento, Date fecha) {
        this.nombre = nombre;
        this.instrumentosArrayListArray.add(new Instrumentos(instrumento));
        this.fecha = fecha;
}
