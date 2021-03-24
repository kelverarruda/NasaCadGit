import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent;
		boolean sair = false;
		
		while(!sair) {
			Menu.menuP();
			ent = new Scanner(System.in);
			
			switch (ent.nextInt()) {
			case 0:
				sair = true;
				break;
			case 1:
				Menu.menuCad();
				break;
			case 2:
				Menu.menuExc();
				break;
			case 3:
				Menu.mostrar();			
				break;				
			default:
				System.out.println("Opcao invalida!\n");
				break;
			}
		}

	}
}
