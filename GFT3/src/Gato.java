/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public class Gato extends Animal{

    public Gato(String nome, int peso) {
	   super(nome, peso);
    }

    @Override
    public String som() {
	   return "Miau!";
    }

    @Override
    public String quantidadeDeRacao() {
	   int quantidade;
	   if(this.peso <= 4){
		  quantidade = this.peso * 12;
	   } else{
		  quantidade = this.peso * 15;
	   }
	   
	   return (quantidade + "g");
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
    
}
