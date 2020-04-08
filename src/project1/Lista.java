package project1;

public class Lista {
		/*
		 * ATRIBUTOS
		 */
	    private Elemento primeiro;
	    private Elemento ultimo;
	    private Integer totElementos;
	    
	    /*
	     * 2. Construtores
	     */	    
	    // 2.1 constrói uma lista com um único valor v
	    public Lista(int v)
	    {
	        primeiro = new Elemento(v);	   
	        ultimo = primeiro; 
	        this.totElementos = 0;
	    }
	    
	    // 2.2 constrói uma lista a partir de outra lista
	    public Lista (Lista lista)
	    {
	    	//utilizando o construtor padrão
	    	this(lista.getPrimeiro().getValor());
	        Elemento aux = lista.getPrimeiro();
	        aux = aux.getProximo();
	        while(aux != null)
	        {
	        	this.append(new Elemento(aux.getValor()));	 
	            aux = aux.getProximo();
	        }
	    }	 
	    
	    // 2.3 constrói uma lista a partir de um array
	    public Lista(int[] v)
	    {
	    	this(v[0]);
	    	for (int i = 1; i < v.length;i++) {
	    		this.append(new Elemento(v[i]));
	    	}	    		
	    }
	    
	    /*
	     *  3. Métodos
	     */
	    // 3.1 ​ inserção na cauda da lista
	    public void append(Elemento e)
	    {
	        this.ultimo.setProximo(e);
	        e.setAnterior(this.ultimo);
	        this.ultimo = e;
	        this.totElementos++;
	    }
	    
	    // 3.2 inserção na cabeça da lista
	    public void prepend(Elemento e)
	    {
	        this.primeiro.setAnterior(e);
	        e.setProximo(this.primeiro);
	        this.primeiro = e;
	        this.totElementos++;
	    }
	    
	    // 3.3 insere o valor v na posição p da lista. Posição p = 0 é a cabeça da lista
	    public void inserirPosicao(int v, int p){
	    	if(p == 0) {//add na frente	    		
	    		Elemento aux = this.primeiro.getProximo();
	    		this.primeiro = new Elemento(v);
	    		this.primeiro.setProximo(aux);	    	    		
	    	} else if (p == this.totElementos) {
	    		//captura o elemento anterior ao elemento que ocupa a atual posição p 
	    		Elemento aux = this.ultimo.getAnterior();
	    		
	    		Elemento novo = new Elemento(v);
	    		
	    		aux.setProximo(novo);
	    		
	    		novo.setAnterior(aux);
	    		
	    		this.ultimo = aux.getProximo();	
	    		
	    	} else {
	    		//pega o elemento anterior a posição onde sera inserido o novo:
	    		Elemento anterior = this.pegaElemento(p - 1);	    		
	    		//Pega o elemento atual (que será substituído)
	    		Elemento atual = this.pegaElemento(p);	    		
	    		// pega o proximo da posição a ser substituida (atual)
	    		Elemento aux = atual.getProximo();	    		
	    		//cria o novo elemento com o valor passado como parâmetro substituirá o atual
	    		Elemento novo = new Elemento(v);	    		
	    		//aponta o proximo do novo elemento (antigo do atual)
	    		novo.setProximo(aux);	    		
	    		//define o novo anterior do aux
	    		aux.setAnterior(novo);	    		
	    		//define o novo  proximo do anterior (que agora é o novo elemento criado)
	    		anterior.setProximo(novo);	 	   		
	    		//define o anterior do novo elemento
	    		novo.setAnterior(anterior);	    		
	    	}
	    }
	    
	    // 3.4 retorna o valor do elemento na posição p da lista
	    public int valorPosicao(int p) {
	    	return this.pegaElemento(p).getValor();
	    }
	    
	    // 3.5 concatena a lista passada como parâmetro com a instância da sua classe lista
	    public void concatenar(Lista lista) {    
	        Elemento aux = lista.getPrimeiro();
	        while(aux != null)
	        {
	        	this.append(new Elemento(aux.getValor()));	 
	            aux = aux.getProximo();
	        }
	    }	    
	    
	    // 3.6 insere o valor v logo após a posição p
	    public void inserirAposPosicao(int v, int p) {
	    	if(p == this.totElementos) {//add na frente
	    		this.append(new Elemento(v));
	    		this.totElementos++;
	    	} else {	    		
	    		//pega o elemento que esta na posição p
	    		Elemento atualP = this.pegaElemento(p);
	    		//pega o atual proximo de atualP
	    		Elemento proximoP = atualP.getProximo();	    		
	    		//cria o novo elemento com o valor passado como parâmetro
	    		Elemento novo = new Elemento(v);	    		
	    		//define o proximo elemento do novo (correspondente proximoP)
	    		novo.setProximo(proximoP);	    		
	    		//define o atualP como sendo o anterior do novo:
	    		novo.setAnterior(atualP);	    		
	    		//define o proximo do atual p como sendo o novo
	    		atualP.setProximo(novo);	    		
	    		//defino o anterior de proximoP como sendo o novo
	    		proximoP.setAnterior(novo);	    		
	    		this.totElementos++;	    		
	    	}
	    }    
	    
        // 3.7 inverte a lista encadeada
        public void inverter() {
            //grava na variavel aux o ultimo elemento da lista
            Elemento  aux = this.ultimo;
            //aponta o 1º elemento da lista atual para o ultimo (nesse momento ele se torna o 1º da lista)
            this.primeiro = aux;
            //laço de repetição percorrento todos os elementos da lista
            for (int i = 0; i < this.totElementos; i++)
            {
                //sala o elemento anterior do ultimo
                Elemento ant = aux.getAnterior();
                //aponta o proximo elemento do 1º elemento da lista atual como sendo o anterior do ultimo.
                aux.setProximo(ant);
                aux = aux.getAnterior();
            }
            aux.setProximo(null);
        }
	    
	    // 3.8 ordena a lista em ordem crescente de valores
	    public void ordenar() {	    	
	    	// usando bubble sort:
	    	for(int i = 0; i <= this.totElementos-1; i++) {		
	    		for(int j = 0; j <= this.totElementos-1; j++) {	    			
	    			int valor = this.pegaElemento(j).getValor();	    
	    			int valor2 = this.pegaElemento(j+1).getValor();
	    			if ( valor > valor2) {	    				
	    				this.inserirPosicao(valor2, j);
	    				this.inserirPosicao(valor, j+1);	    			
	    			}
	    		}
	    	}
	    }
	    
	    // 3.9 ​ remove o elemento na posição p
	    public void remover(int posicao) {
	    	//verifica se existe
	    	if(!this.posicaoOcupada(posicao)) {
	    		throw new IllegalArgumentException("Posição não existe");
	    	}	    	
	    	if (posicao == 0) {
	    		this.removeDoComeco();
	    	} else if (posicao == this.totElementos) {
	    		this.removeDoFim();
	    	} else {
	    		//pega o elemento anterior a posicao atualP
	    		Elemento anterior = this.pegaElemento(posicao -1);	    		
	    		//cria uma referencia para a atualP
	    		Elemento atual = anterior.getProximo();	    		
	    		//cria uma referencia para o proximo elemento de atualP
	    		Elemento proximo = atual.getProximo();	    		
	    		//realiza as novas conexões
	    		anterior.setProximo(proximo);
	    		proximo.setAnterior(anterior);	    		
	    		//decremento do indice
	    		this.totElementos--;	    		
	    	}	    	
	    }
	    
	    // 3.10 remove todos os elementos da lista
	    public void esvaziar() {
	    	this.primeiro = null;
	    	this.ultimo = null;
	    	this.totElementos = null;
	    }	    
	    
	    // 3.11 retorna uma cópia superficial da lista
	    public Elemento clonar() {
	    	Elemento aux = new Elemento(this.primeiro.getValor());
	    	Elemento clone = aux;
	    	for (int i = 1; i <= this.totElementos;i++) {
	    		Elemento atual = new Elemento(this.valorPosicao(i));
	    		aux.setProximo(atual);
	    		aux = atual;
	    	}
	    	return clone;
	    }	    	    
	    
	    // 3.12 retorna a posição do primeiro elemento com o valor v
	    public Integer indice(int v) {
		    	for (int i = 0; i <= this.totElementos;i++) {
		    		Elemento aux = this.pegaElemento(i);
		    		if(v == aux.getValor()) {
		    			return i;
		    		}
		    	}
	    	return null;
	    }
	    
	    // 3.13 retorna a quantidade de elementos na lista
	    public int tamanho() {
	    	return this.totElementos + 1;
	    }    

	    // 3.14 retorna um array com todos os valores da lista
	    public int[] array() {
	    	//instancia do array
	    	int[] arr = new int[this.totElementos+1];
	    	//percorre os elementos preenchedo o array
	    	for (int i = 0; i <= this.totElementos;i++) {
	    		arr[i] = this.pegaElemento(i).getValor();
	    	} 	    	
	    	return arr;
	    }
	    
	    // 3.15 retorna true se o valor v pertence à  lista, false em caso negativo.
	    public boolean pertence(int v)
	    {
	    	for(int i = 0; i <= this.totElementos; i++) {
	    		if(v == this.pegaElemento(i).getValor()) {
	    			return true;
	    		}
	    	}
	    	return false;
	    }		    
	    
	    // 3.16 adiciona os valores do array v no final da lista e na ordem do mesmo.
	    public void appendArray(int[] v) {
	    	for (int i = 0; i < v.length;i++) {
	    		this.append(new Elemento(v[i]));
	    	}	 
	    }	    
	    
	    // 3.17 adiciona os valores do array v no começo da lista, mantendo a ordem dos elementos de ambos. 
	    public void prependArray(int[] v) {
	    	for (int i = v.length -1; i >= 0;i--) {
	    		this.prepend(new Elemento(v[i]));
	    	}	 
	    }
	    
	    // 3.18 insere os elementos  da lista passada como parâmetro depois da posição p.
	    public void inserirListaPosicao(Lista lista, int p) {	    	
	    	// for (int i = lista.totElementos; i >= 0; i--) {
	    	for (int i = 0; i <= lista.totElementos; i++) {
	    		this.inserirAposPosicao(lista.pegaElemento(i).getValor(),p);
	    	}	    	
	    }	    
	    
	    // 3.19 insere os valores do  array v depois da posição p.
	    public void inserirArrayPosicao(int[] v, int p) {
	    	for (int i = v.length -1; i >= 0;i--) {
	    		this.inserirAposPosicao(v[i], p);
	    	}	 
	    }
	    
	    // 3.20 - retorna quantas vezes o valor v aparece na lista.
	    public int contar(int v) {
	    	int counter = 0;
	    	int[] arr = this.array();
	    	for (Integer i : arr) {
	    		if(i == v) {
	    			counter++;
	    		}
	    	}
	    	return counter;
	    }    
	    
	    /*
	     * Métodos auxiliares (ajudam em tarefas diversas)
	     */
	    private void removeDoFim() {
	    	//verifica se existe
	    	if(!this.posicaoOcupada(this.totElementos)) {
	    		throw new IllegalArgumentException("Posição não existe");
	    	}	  
	    	
	    	if (this.totElementos == 1) {
	    		this.removeDoComeco();
	    	} else {
	    		Elemento penultimo = this.ultimo.getAnterior();
	    		penultimo.setProximo(null);
	    		this.ultimo = penultimo;
	    		this.totElementos--;
	    	}
	    }
	    
	    private void removeDoComeco() {
	    	//verifica se existe
	    	if(!this.posicaoOcupada(0)) {
	    		throw new IllegalArgumentException("Posição não existe");
	    	}	    	
	    	//faz com que o primeiro elemento torne-se o próximo, ja que este será removido
	    	this.primeiro = this.primeiro.getProximo();
	    	//subtrai o total de elementos
	    	this.totElementos--;	    	
	    	
	    	if(this.totElementos ==0) {
	    		this.ultimo = null;
	    	}	    	
	    }
	    
	    //auxiliar: verifica se a posicao existe
	    private boolean posicaoOcupada(int posicao) {
	    	return posicao >= 0 && posicao <= this.totElementos;
	    }
	    
	    //auxiliar: localiza o elemento anterior a posicao (index) desejada
	    private Elemento pegaElemento(int posicao) {	    	
	    	if(!this.posicaoOcupada(posicao)) {
	    		throw new IllegalArgumentException("Posição não existe");
	    	}		    	
	    	Elemento primeiro = this.primeiro;	    	
	    	for (int i =0; i < posicao; i++) {
	    		primeiro = primeiro.getProximo();
	    	}
	    	return primeiro;
	    }
	    
	    public void imprime()
	    {
	        Elemento aux = this.primeiro;
	        while(aux != null)
	        {
	        	aux.imprime();
	            aux = aux.getProximo();
	        }
	    }
	    
	    public void imprimeAnt()
	    {
	        Elemento aux = this.ultimo;
	        while(aux != null)
	        {
	            aux.imprime();
	            aux = aux.getAnterior();
	        }
	    }
	    
	    public Elemento getPrimeiro()
	    {
	    	return this.primeiro;
	    }	    
	}