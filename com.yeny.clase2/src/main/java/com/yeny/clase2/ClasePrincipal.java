/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeny.clase2;

/**
 *
 * @author Sandra
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    
//        System.out.println("HOLA");
//        System.out.println(objetolibro2.getNumeroPaginas());
//        System.out.println(libro.toString());

        Libros objetolibro1 = new Libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Libros objetolibro2 = new Libros(2, "PROGRAMACION PHP", 600, "Deitel");

        objetolibro1.setNumeroPaginas(200);

        if (objetolibro1.getNumeroPaginas() < objetolibro2.getNumeroPaginas()) {
            System.out.println("EL libro 2 es mayor que el libro 1, el libro 2 tiene un numero de paginas de "+objetolibro2.getNumeroPaginas());
            System.out.println("La informacion del libro 2 es "+objetolibro2.toString());
        } else {
            System.out.println("EL libro 1 es mayor que el libro 2, el libro 1 tiene un numero de paginas de  "+objetolibro1.getNumeroPaginas());
            System.out.println("La informacion del libro 1 es "+objetolibro1.toString());
        }

    }



    
