/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	   Portugues portugues = new Portugues("Português");
	   Ingles ingles = new Ingles("Inglês");
	   Hungaro hungaro = new Hungaro("Húngaro");
	   Tcheco tcheco = new Tcheco("Tcheco");
	   
	   System.out.println(portugues.saudacao());
	   System.out.println(ingles.saudacao());
	   System.out.println(hungaro.saudacao());
	   System.out.println(tcheco.saudacao());
    }
    
}
