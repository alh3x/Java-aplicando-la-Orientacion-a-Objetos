package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;//
    private int totalEvaluaciones;//solo podemos manipular estos atributos en esta clase

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;//this se refiere al atributo de esta clase
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}
