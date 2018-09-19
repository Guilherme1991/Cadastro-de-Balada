package com.projetos.www;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CadastroVip {

	private static Scanner input;

	public static void main(String[] args) {
		//Author: Guilherme Luiz Quintino Da Silva.
		
		input = new Scanner (System.in);
		
	    Date data = new Date();
		
			
			SimpleDateFormat formatar = new SimpleDateFormat("d/M/Y");
			String dataFormatada = formatar.format(data);
			
			String nome, sobreNome, rg;
			int idade;
			
			System.out.println("Digite o seu nome:");
			nome = input.nextLine();
			
			System.out.println("Digite o seu sobrenome:");
			sobreNome = input.nextLine();
			
			System.out.println("Digite o seu RG:");
			rg = input.nextLine();
			
			System.out.println("Digite a sua idade:");
			idade = input.nextInt();
			
			if(idade >=18){
				System.out.println("Cadastro efetuado com sucesso!\n");
				System.out.println("Olá "+nome+""+sobreNome+", seu cadastro foi efetuado com sucesso!\n");
				System.out.println("Registrado no dia "+dataFormatada+" São Paulo SP");	
				}else{
					System.out.println("Olá "+nome+" "+sobreNome+", Não foi possível realizar o seu cadastro!\n");
					System.out.println("Registrado no dia "+dataFormatada+" São Paulo SP");	
				}
		}


	}


