package project1;

class Elemento
{	
	private int valor;    
    private Elemento proximo;    
    private Elemento anterior;
    
    public Elemento(int v)  {
        this.valor = v;        
        this.proximo = null;        
        this.anterior = null;        
    }
    
    public void setProximo(Elemento e)
    {
        this.proximo = e;
    }
    
    public void setAnterior(Elemento e) 
    {
    	this.anterior = e;
    }
    
    public Elemento getAnterior()
    {
        return this.anterior;
    }
   
    public Elemento getProximo()
    {
        return this.proximo;
    }
    
    public void imprime()
    {
        System.out.println("valor = " + this.valor);
    }   
    
    public int getValor() {
    	return this.valor;
    }
}