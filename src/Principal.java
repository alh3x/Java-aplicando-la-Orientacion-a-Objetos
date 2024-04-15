public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Blade Runner";
        miPelicula.fechaDeLanzamiento = 1982;
        miPelicula.duracionEnMinutos = 117;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.9);
        miPelicula.evalua(9.8);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.nombre = "Matrix";
        miPelicula2.fechaDeLanzamiento = 2000;
        miPelicula2.duracionEnMinutos = 120;

        //miPelicula2.muestraFichaTecnica();


    }
}
