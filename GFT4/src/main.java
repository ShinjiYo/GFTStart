
import java.util.Scanner;



/**
 *
 * @author Lucas Shinji Yamane
 */
public class main {


    public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   int n1,n2;
	   
	   System.out.println("Digite o número inicial:");
	   n1 = entrada.nextInt();
	   System.out.println("Digite o número final:");
	   n2 = entrada.nextInt();
	   
	   for(int i = n1; i <= n2; i++){
		  switch((i%7)){
		  case(0):
			 System.out.print("Dó ");
		  break;
		  case(1):
			 System.out.print("Ré ");
		  break;
		  case(2):
			 System.out.print("Mi ");
		  break;
		  case(3):
			 System.out.print("Fá ");
		  break;
		  case(4):
			 System.out.print("Sol ");
		  break;
		  case(5):
			 System.out.print("Lá ");
		  break;
		  case(6):
			 System.out.print("Si ");
		  break;
		  
	   }
    }
    
}
}
