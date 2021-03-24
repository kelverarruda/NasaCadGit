import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private static List<Ponto> form = new ArrayList<Ponto>();
	private static Scanner ent;
	
	public static void menuP() {
		System.out.println("\t---- Menu ----");
		System.out.println("1 - Cadastrar Formas");
		System.out.println("2 - Excluir Formas");
		System.out.println("3 - Mostrar todas Formas");
		System.out.println("0 - Sair");
	}
	
	public static void menuCad() {
		System.out.println("\n\t---- Cadastrar ----");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Circulo");
		System.out.println("4 - Triangulo");
		
		ent = new Scanner(System.in);
		
		switch (ent.nextInt()) {
		case 1:
			form.add(new Quadrado());
			System.out.println("Quadrado cadastrado!\n");
			break;
		case 2:
			form.add(new Retangulo());
			System.out.println("Retangulo cadastrado!\n");					
			break;
		case 3:
			form.add(new Circulo());
			System.out.println("Circulo cadastrado!\n");
			break;
		case 4:
			form.add(new Triangulo());
			System.out.println("Triangulo cadastrado!\n");
			break;
		default:
			System.out.println("Opcao invalida!\n");
			break;
		}
		
	}
	
	public static void menuExc() {
		System.out.println("\n\t---- Excluir ----");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Circulo");
		System.out.println("4 - Triangulo");
		
		ent = new Scanner(System.in);
		
		switch (ent.nextInt()) {
		case 1:
			for(int i = 0; i < form.size(); i++) {
				Ponto q = form.get(i);
				if (q.getNome().equals("Quadrado")) {
					form.remove(q);
					i--;
					System.out.println("Quadrado removido!\n");
				}
			}
			break;
		case 2:
			for(int i = 0; i < form.size(); i++) {
				Ponto r = form.get(i);
				if (r.getNome().equals("Retangulo")) {
					form.remove(r);
					i--;
					System.out.println("Retangulo removido!\n");
				}
			}
			break;
		case 3:
			for(int i = 0; i < form.size(); i++) {
				Ponto c = form.get(i);
				if (c.getNome().equals("Circulo")) {
					form.remove(c);
					i--;
					System.out.println("Circulo removido!\n");
				}
			}
			break;
		case 4:
			for(int i = 0; i < form.size(); i++) {
				Ponto t = form.get(i);
				if (t.getNome().equals("Triangulo")) {
					form.remove(t);
					i--;
					System.out.println("Triangulo removido!\n");
				}
			}
			break;
		default:
			System.out.println("Opcao invalida!\n");
			break;
		}
		
	}
	
	public static void mostrar() {
		System.out.println(form.toString() + "\n");
	}
	

}
