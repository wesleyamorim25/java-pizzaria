package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		
	    LocalDateTime hours = LocalDateTime.now();
		
	    System.out.println("=======PIZZARIA ABENÇOADA============");
		System.out.print("Digite o nome do cliente: ");
		String name = sc.nextLine();
		System.out.print("Digite o numero de telefone: ");
		int phone = sc.nextInt();
		System.out.print("Digite o endereço: ");
		sc.nextLine();
		String ende = sc.nextLine();
		
		People client = new People(name, phone, ende);
		
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("A PIZZA SERÁ DE QUANTOS SABORES? ");
		int qSabor = sc.nextInt();
		int x = 0;
		int y = 0;
		String sabor;
		String sabor2;
		double precoUni = 0;
		double precoUni2 = 0;
		double valorTotal = 0;
		if(qSabor == 1) {
			System.out.println("DIGITE O SABOR: ");
			System.out.println("1 - CALABREZA-  R$ 30.00");
			System.out.println("2 - BACON-      R$ 32.00");
			System.out.println("3 - PORTUGUESA- R$ 35.00");
			System.out.println("4 - MUSSARELA-  R$ 30.00");
			System.out.println("5 - BOLONHESA-  R$ 36.00");
			x = sc.nextInt();
			if (x == 1) {
				sabor = "CALABRESA";
				precoUni = 30.00;
			}else if (x == 2) {
				sabor = "BACON";
				precoUni = 32.00;
			} else if (x == 3) {
				sabor = "PORTUGUESA";
				precoUni = 35.00;
			} else if (x == 4) {
				sabor = "MUSSARELA";
				precoUni = 30.00;
			} else if (x == 5) {
				sabor = "BOLONHESA";
				precoUni = 36.00;
			} else {
				sabor = "CODIGO INVALIDO";
			}
			valorTotal = precoUni;
			System.out.println();
			System.out.println("========================================");
			System.out.println("DETALHES DO PEDIDO/ pedido realizado em: " + (hours.format(fmt1)));
			System.out.println(client);
			System.out.println("sabor: " + sabor + " VALOR TOTAL: R$ " + String.format("%.2f", valorTotal));
		}
		else {
			System.out.println("DIGITE O PRIMEIRO SABOR: ");
			System.out.println("1 - CALABREZA-  R$ 15.00");
			System.out.println("2 - BACON-      R$ 16.00");
			System.out.println("3 - PORTUGUESA- R$ 17.50");
			System.out.println("4 - MUSSARELA-  R$ 15.00");
			System.out.println("5 - BOLONHESA-  R$ 18.00");
			x = sc.nextInt();
			if (x == 1) {
				sabor = "CALABRESA";
				precoUni = 15.00;
			}else if (x == 2) {
				sabor = "BACON";
				precoUni = 16.00;
			} else if (x == 3) {
				sabor = "PORTUGUESA";
				precoUni = 17.50;
			} else if (x == 4) {
				sabor = "MUSSARELA";
				precoUni = 15.00;
			} else if (x == 5) {
				sabor = "BOLONHESA";
				precoUni = 18.00;
			} else {
				sabor = "CODIGO INVALIDO";
			}
			
			System.out.println("DIGITE O SEGUNDO SABOR: ");
			System.out.println("1 - CALABREZA-  R$ 15.00");
			System.out.println("2 - BACON-      R$ 16.00");
			System.out.println("3 - PORTUGUESA- R$ 17.50");
			System.out.println("4 - MUSSARELA-  R$ 15.00");
			System.out.println("5 - BOLONHESA-  R$ 18.00");
			y = sc.nextInt();
			if (y == 1) {
				sabor2 = "CALABRESA";
				precoUni2 = 15.00;
			}else if (y == 2) {
				sabor2 = "BACON";
				precoUni2 = 16.00;
			} else if (y == 3) {
				sabor2 = "PORTUGUESA";
				precoUni2 = 17.50;
			} else if (y == 4) {
				sabor2 = "MUSSARELA";
				precoUni2 = 15.00;
			} else if (y == 5) {
				sabor2 = "BOLONHESA";
				precoUni2 = 18.00;
			} else {
				sabor2 = "CODIGO INVALIDO";
			}
			valorTotal = precoUni + precoUni2;
			System.out.println();
			System.out.println("========================================");
			System.out.println("DETALHES DO PEDIDO/ pedido realizado em: " + (hours.format(fmt1)));
			System.out.println(client);
			System.out.printf("sabor: " + sabor + "/" + sabor2 + " VALOR TOTAL: R$ " + String.format("%.2f", valorTotal));
		}
		
		
		sc.close();
	}

}
