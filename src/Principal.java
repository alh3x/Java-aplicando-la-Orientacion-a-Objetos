import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Blade Runner");
        miPelicula.setFechaDeLanzamiento(1982);
        miPelicula.setDuracionEnMinutos(117);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.9);
        miPelicula.evalua(9.8);
        miPelicula.evalua(7.6);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());










        //com.aluracursos.screenmatch.modelos.Pelicula miPelicula2 = new com.aluracursos.screenmatch.modelos.Pelicula();
        //miPelicula2.nombre = "Matrix";
        //miPelicula2.fechaDeLanzamiento = 2000;
        //miPelicula2.duracionEnMinutos = 120;
        //miPelicula2.muestraFichaTecnica();
    }
}
