/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp1_arquitetura_software;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
	Scanner sc = new Scanner(System.in);
	private ArrayList names = new ArrayList();
	
	
	public void addNames() 
	{
		System.out.println("Digite o nome:");
		String name = sc.nextLine();
		names.add(name);
	}
	public void listNames()
	{
		for(int i = 0 ; i < names.size() ; i++)
		{
			System.out.println(names.get(i));
		}
	}
	
}
