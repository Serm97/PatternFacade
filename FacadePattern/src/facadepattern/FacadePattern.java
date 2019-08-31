/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

import java.util.Scanner;

/**
 * @author seramirez
 */
public class FacadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FacadeCRM interfaceClient = new FacadeCRM();

        mostrarMenu();


        int opcion = sc.nextInt();

        interfaceClient.menuFacade(opcion);

    }

    public static void mostrarMenu(){
        System.out.println("\n\n----------- CRM -----------");
        System.out.println("[1] Customer Services");
        System.out.println("[2] Marketing");
        System.out.println("[3] Sales");
    }

}
