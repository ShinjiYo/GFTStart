/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public class Portugues extends Idioma{


    public Portugues(String nomeDoIdioma) {
	   super(nomeDoIdioma);
    }
    
    
    
    @Override
    public String saudacao() {
	   return ("Nome do idioma: " + this.nomeDoIdioma + "\nSaudação: Olá Mundo!\n");
    }
    
}
