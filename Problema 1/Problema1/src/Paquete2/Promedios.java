/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

/**
 *
 * @author gabyl
 */
public class Promedios {
   private String nombre;
   private double caliMateria1;
   private double caliMateria2;
   private double caliMateria3;
   private double promedio;
   
   public Promedios(String n, double c1, double c2, double c3){
       nombre = n;
       caliMateria1 = c1;
       caliMateria2 = c2;
       caliMateria3 = c3;
       
   }
   public Promedios(String n,double c1, double c2){
       nombre = n;
       caliMateria1 = c1;
       caliMateria2 = c2;
       caliMateria3 = (1+c2)/2;
               
   }
   
   public void establecerNombre(String a){
       nombre = a;
   }
   public void establecerCaliMateria1(double a){
       caliMateria1 = a;
   }
   public void establecerCaliMateria2(double a){
       caliMateria2 = a;
   }
   public void establecerCaliMateria3( double a){
       caliMateria3 = a;
   }
   public void calcularPromedio(){
       promedio = (obtenerCaliMateria1()+obtenerCaliMateria2()/2);
   }
   public String obtenerNombre(){
       return nombre;
   }
   public double obtenerCaliMateria1(){
       return caliMateria1;
   }
   public double obtenerCaliMateria2(){
       return caliMateria2;
   }
   public double obtenerCaliMateria3(){
       return caliMateria3;
   }
   public double obtenerPromedio(){
       return promedio;
   }
   @Override
   public String toString(){
       String cadena = String.format("Ficha Alumno \n\n"
               + "Nombre: %s\n"
               +"Calificacion Materia 1: %.2f\n"
               + "Calificacion Matria 2: %.2f\n"
               + "CalificacionMateria 3: %.2f\n"
               + "Promedio: %.2f\n ", obtenerNombre(), 
               obtenerCaliMateria1(),obtenerCaliMateria2(),
               obtenerCaliMateria3(),obtenerPromedio());
       return cadena;
   }
}
