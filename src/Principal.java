import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Blade Runner");
        miPelicula.setFechaDeLanzamiento(1982);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.9);
        miPelicula.evalua(9.8);
        miPelicula.evalua(7.6);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println("********************");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.setNombre("Matrix");
        miPelicula2.setFechaDeLanzamiento(2001);
        miPelicula2.setDuracionEnMinutos(120);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(miPelicula2);
        System.out.println(calculadora.getTiempoTotal());

    }
}
