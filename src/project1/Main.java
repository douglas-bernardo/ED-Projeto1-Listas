package project1;

import view.Output;

public class Main {

	public static void main(String[] args) {
		
		// 2.1 lista com um único valor
		Lista lista1 = new Lista(5);
		
		// criando mais elementos:		
		lista1.append(new Elemento(7)); // 3.1 inserção na cauda da lista
		lista1.append(new Elemento(2));
		lista1.append(new Elemento(1));
		lista1.append(new Elemento(3));
		lista1.append(new Elemento(10));
		lista1.append(new Elemento(4));
		
		/*
		Output.print("2.2 - constroi uma lista a partir de outra lista:");
		Output.print("Valores Lista1:");
		lista1.imprime();
		Lista lista2 = new Lista(lista1);
		Output.print("Valores Lista2:");
		lista2.imprime();
		*/
		
		/*
		Output.print("2.3 - criando lista a partir de um array:");
		int [] arr = new int[5];
		arr[0] = 20;
		arr[1] = 21;
		arr[2] = 22;
		arr[3] = 23;
		arr[4] = 24;
		Output.print("Valores do array arr:");
		for(int i : arr) {
			Output.printInt(i);
		}
		Output.print("Valores da Lista 3 com base nos valores do array arr:");
		Lista lista3 = new Lista(arr);
		lista3.imprime();
		*/
		
		/*
		Output.print("3.2 inserção na cabeça da lista:");
		Output.print("Valores Lista1:");
		lista1.imprime();
		int v = 99;
		Output.print("Preppendo valor v = " + v);
		lista1.prepend(new Elemento(v));
		lista1.imprime();
		*/
		
		/*
		Output.print("3.3 - Isere um elemento de valor v NA posição p");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		int p = 6;
		int v = 22;
		Output.print("inserindo novo valor " + v + " na posição " + p);
		lista1.inserirPosicao(v, p);		
		lista1.imprime();
		*/
		
		/*
		Output.print("3.4 - retorna o valor da posição p");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		int p = 4;
		Output.print("O valor da posição p = " + p + ", corresponde a " + lista1.valorPosicao(p));
		*/
		
		/*
		Output.print("3.5 - Concatenando listas");
		Output.print("Valores Lista1:");
		lista1.imprime();
		
		Lista lista3 = new Lista(100);
		lista3.append(new Elemento(101));
		lista3.append(new Elemento(102));
		lista3.append(new Elemento(103));
		lista3.append(new Elemento(104));
		
		Output.print("Valores Lista3:");
		lista3.imprime();
		
		Output.print("Concatenando Lista1 e Lista3:");
		lista1.concatenar(lista3);
		lista1.imprime();
		*/
		
		/*
		Output.print("3.6 - Inserindo elemento v APÓS a posição p");
		Output.print("Valores Lista1:");
		lista1.imprime();
		int v = 99;
		int p = 2;
		Output.print("Inserindo elemento v = " + v + " após a posição p = " + p);
		lista1.inserirAposPosicao(99,  2);
		Output.print("Resultado:");
		lista1.imprime();
		*/
		
		/*
		Output.print("3.7 - Invertendo listas");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		Output.print("Invertendo...");		
		lista1.inverter();
		lista1.imprime();
		*/
		
		/*
		Output.print("3.8 - ordenação de valores");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		lista1.ordenar();
		Output.print("ordena");
		lista1.imprime();	
		*/
		
		/*
		Output.print("3.9 - remover elemento da posicao p");
		Output.print("Valores Lista1:");
		lista1.imprime();
		int p = 1;
		Output.print("Removendo elemento da posição p = " + p);
		lista1.remover(p);		
		lista1.imprime();
		*/
		
		/*
		Output.print("3.10 esvaziar");
		Output.print("Valores Lista1:");				
		lista1.imprime();
		lista1.esvaziar();
		lista1.imprime();
		*/
		
		/*
		Output.print("3.11 - retorna uma cópia superficial da lista");
		Output.print("Valores Lista1:");	
		lista1.imprime();
		Output.print("Clone Lista1:");	
		Elemento clone = lista1.clonar();	
		
		Lista nl = new Lista(clone.getValor());
		while(clone.getProximo() != null) {			
			clone = clone.getProximo();
			nl.append(clone);			
		}
		
		nl.inserirPosicao(777, 3);
		
		nl.imprime();
		
		Output.print("Valores Lista1:");	
		lista1.imprime();
		*/
		
		
		
		
		
		/*
		Output.print("3.12 -retorna a posição do primeiro elemento com o valor v.");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		int v = 10;
		Output.print("o indice do elemento de valor " + v + " é:");
		Output.printInt(lista1.indice(v));
		*/
		
		/*
		Output.print("3.13 - retorna o tamanho");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		Output.print("O tamanho da lista  é : " + lista1.tamanho());
		*/
		
		/*
		Output.print("3.14 - ​ retorna um array com todos os valores da lista");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		int[] arr;
		arr = lista1.array();
		Output.print("Valores array resultante:");
		for(int i: arr) {
			Output.printInt(i);
		}
		*/
		
		/*
		Output.print("3.15 - retorna true se o valor v pertence à	lista, false em caso negativo.");
		Output.print("Valores Lista1:");
		lista1.imprime();
		int v = 99;
		Output.print("O elemento " + v + " pertence a lista?");
		System.out.println(lista1.pertence(v));
		*/
		
		/*
		Output.print("3.16 - adiciona os valores do array v no final da lista e na ordem do mesmo.");
		Output.print("Valores Lista1:");
		lista1.imprime();
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		Output.print("Valores array arr:");
		for (int i : arr) {
			Output.printInt(i);
		}
		
		Output.print("Append de array arr em Lista1");
		lista1.appendArray(arr);
		lista1.imprime();
		*/
		
		/*
		Output.print("3.17 - adiciona os valores do array v no começo da lista, mantendo a ordem dos elementos de ambos.");
		Output.print("Valores Lista1:");
		lista1.imprime();
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		Output.print("Valores array arr:");
		for (int i : arr) {
			Output.printInt(i);
		}
		
		Output.print("prepend array:");
		lista1.prependArray(arr);
		lista1.imprime();
		*/
		
		/*
		Output.print("3.18 - insere os elementos da lista passada como parâmetro DEPOIS da posição p");
		Output.print("Valores Lista1:");
		lista1.imprime();		
		Output.print("Criando nova lista L");
		Lista L = new Lista(99);
		L.append(new Elemento(100));
		L.append(new Elemento(101));
		L.append(new Elemento(102));
		L.append(new Elemento(103));
		L.imprime();	
		
		int p = 3;
		Output.print("Inserindo valores nova lista L na Lista1 na posição " + p);		
		lista1.inserirListaPosicao(L, p);		
		Output.print("Resultado:");
		
		lista1.imprime();
		*/
		
		/*
		Output.print("3.19 insere os valores do array v depois da posição p.");
		Output.print("Valores Lista1:");
		lista1.imprime();
		
		Output.print("criando array arr");		
		int[] arr = new int[4];
		arr[0] = 99;
		arr[1] = 100;
		arr[2] = 100;
		arr[3] = 100;		
		
		Output.print("Valores array arr:");
		for (int i : arr) {
			Output.printInt(i);
		}
		
		int p = 3;
		Output.print("Inserindo valores do array na posição " + p);		
		lista1.inserirArrayPosicao(arr, p);
		
		Output.print("Imprimindo lista 1 com os novos valores do array:");		
		lista1.imprime();
	    */
		
		/*
		Output.print("Valores Lista1:");
		lista1.imprime();
		int v = 1;
		Output.print("3.20 - retorna quantas vezes o valor v aparece na lista.");
		Output.print("O valor " + v + ", aparece " + lista1.contar(v) + " vez na lista1");
		*/
		
	}
}
