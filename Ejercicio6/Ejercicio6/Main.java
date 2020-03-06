/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class Main {
    
    public static void main(String [] args) {
    System.out.println("GSAD");
    
    Cliente ana=new Cliente("Ana","12345698");
    Cliente bob=new Cliente("Bob","9875665431");
    Cliente carlos=new Cliente("Carlos","6666666");
    
    Coche passat=new Coche("bmw",23456);
    Coche ferrari=new Coche("ferrari",23456);
    Coche porche=new Coche("porche",23456);
    Coche vectra=new Coche("opel",23456);
    
    Motor motor1=new Motor(50);
    Motor motor2=new Motor(30);
    
    System.out.println(bob.toString());
    System.out.println(ferrari.toString());
    System.out.println(motor1.toString());
    
    porche.asignarCliente(bob);
    bob.asignarCoche(porche);
    
    }
    
    
}
