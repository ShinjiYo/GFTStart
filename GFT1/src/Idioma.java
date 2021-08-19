/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public abstract class Idioma {
    protected String nomeDoIdioma;

    public Idioma(String nomeDoIdioma) {
	   this.nomeDoIdioma = nomeDoIdioma;
    }
    
    public abstract String saudacao();

}
