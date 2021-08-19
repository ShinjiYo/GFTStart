

/**
 *
 * @author Lucas Shinji Yamane
 */
public class main {


    public static void main(String[] args) {
	   Gato gato1 = new Gato("Coca", 20);
	   Gato gato2 = new Gato("Foxy", 3);
	   Gato gato3 = new Gato("Edward", 5);
	   Cachorro cachorro1 = new Cachorro("Einstein", 10);
	
	   
	   System.out.println("A gata " + gato1.getNome() + " consome " + gato1.quantidadeDeRacao() + " e ela faz " + gato1.som());
	   
	   System.out.println("A gata " + gato2.getNome() + " consome " + gato2.quantidadeDeRacao() + " e ela faz " + gato2.som());
	   
	   System.out.println("O cachorro " + cachorro1.getNome() + " consome " + cachorro1.quantidadeDeRacao() + " e ele faz " + cachorro1.som());
	   
	   System.out.println("O gato " + gato3.getNome() + " consome " + gato3.quantidadeDeRacao() + " e ele faz " + gato3.som());

    }
    
    
}
