/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp1_arquitetura_software;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		Register register = new Register();
		do {
			System.out.println("O que deseja fazer ?");
			System.out.println("1-Cadastrar");
			System.out.println("2-Listar cadastrados");
			System.out.println("3-Sair");
			opt = sc.nextInt();;
			switch(opt) {
			case 1:
				register.addNames();
				break;
			case 2:
				System.out.println("======================");
				register.listNames();
				System.out.println("======================");
				break;
			case 3: 
				break;
			default:
				System.out.println("Opção inválida, digite novamente.");
			}
			
		}while(opt != 3);
		
		System.exit(0);
	}
	
	
}