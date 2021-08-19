/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public class Cachorro extends Animal{

    public Cachorro(String nome, int peso) {
	   super(nome, peso);
    }

    @Override
    public String som() {
	   return "Auau!";
    }

    @Override
    public String quantidadeDeRacao() {
	   	   int quantidade;
	   if(this.peso <= 3){
		  quantidade = this.peso * 35;
	   } else if(this.peso <=10){
		  quantidade = this.peso * 45;
	   }else{
		  quantidade = this.peso * 50;
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
    
