/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public abstract class Animal {
    protected String nome;
    protected int peso;

    public Animal(String nome, int peso) {
	   this.nome = nome;
	   this.peso = peso;
    }

    public String getNome() {
	   return nome;
    }

    public void setNome(String nome) {
	   this.nome = nome;
    }

    public int getPeso() {
	   return peso;
    }

    public void setPeso(int peso) {
	   this.peso = peso;
    }
    
    
    
    public abstract String som();
    public abstract String quantidadeDeRacao();
}
