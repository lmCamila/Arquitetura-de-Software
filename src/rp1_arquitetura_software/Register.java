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
            int i=1;
            do{
                System.out.println("Digite o nome(Para sair digite 0):");
		String name = sc.nextLine();
		
                if("0".equals(name)){
                i =  Integer.parseInt(name);
                }else{
                    names.add(name);
                }
            }while(i != 0);
	}
	public void listNames()
	{
		for(int i = 0 ; i < names.size() ; i++)
		{
			System.out.println(names.get(i));
		}
	}
	
}
