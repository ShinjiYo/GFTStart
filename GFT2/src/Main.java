
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Shinji Yamane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   
	   int ano;
	   
	   System.out.println("Insira o ano de entrada do funcionario:");
	   ano = entrada.nextInt();
	   
	   switch ((2021 - ano)) {
	   	  case 1:
			 System.out.println("O funcionário vai receber um Vale Presente");
			 break;
	   	  case 2:
			 System.out.println("O funcionário vai receber um Smart Watch");
			 break;
	   	  case 5:
			 System.out.println("O funcionário vai receber um Fone Bluetooth");
			 break;
	   	  case 10:
			 System.out.println("O funcionário vai receber um Vale Jantar");
			 break;
	   	  case 15:
			 System.out.println("O funcionário vai receber um Vale Jantar Top");
			 break;
	   	  default:
			 System.out.println("Esse ano não vai ter presente");
			 break;
	   }
	   
	   
    }
    
}
