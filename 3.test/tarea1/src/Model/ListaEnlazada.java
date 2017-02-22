/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
* <h1>ListaEnlazada</h1>
* Clase listaEnlazada
*
* @author Juan Pablo Ospino Solano
* @version 1.0
* @since   2017-02-05
*/
public class ListaEnlazada {
    private Nodo NodoInicial;
    private Nodo NodoFinal;
    
    
    /**
     * Metodo get del nodo inicial de la lista
     * @return nodo inicial
     */
    public Nodo getNodoInicial() {
        return NodoInicial;
    }

    /**
     * Metodo set del nodo inicial de la lista
     * @param NodoInicial Nodo inicial a configurar
     */
    public void setNodoInicial(Nodo NodoInicial) {
        this.NodoInicial = NodoInicial;
    }

    /**
     * Método get del nodo final de la lista
     * @return nodo final de la lista
     */
    public Nodo getNodoFinal() {
        return NodoFinal;
    }

    /**
     * Método set del nodo final de la lista
     * @param NodoFinal nodo a insertar
     */
    public void setNodoFinal(Nodo NodoFinal) {
        this.NodoFinal = NodoFinal;
    }
    
    /**
     * COnstuctor por defecto de la clase
     */
    public ListaEnlazada()
    {
        this.NodoInicial = null;
        this.NodoFinal = null;
    }
    
    /**
     * Método para insertar un nuevo nodo en la lista
     * @param valor NOdo a insertar
     */
    public void AddNodo(Double valor)
    {
        Nodo nodoInsertar = new Nodo(valor);
        
        if(this.NodoInicial == null)
        {
            this.NodoInicial = nodoInsertar;
            this.NodoFinal = nodoInsertar;
        }
        else
        {
            if(this.NodoInicial == null)
                this.NodoInicial.setNodoSiguente(this.NodoFinal);
            
            this.NodoFinal.setNodoSiguente(nodoInsertar);
            this.NodoFinal = nodoInsertar;
        }
    }
    
    
    
    /**
     * Método para el calculo de la média de los nodos de la lista
     * @return media calculada
     */
    public double CalcularMedia()
    {
        if(this.NodoInicial == null)
        {
            System.out.println("No hay elementos en la lista para calcularla media. Por favor ingrese nuevamente los datos");
            return 0;
        }
        
        double sumatoriaAcumulada = 0;
        int catidadElementoAcumulado = 0;
        
        this.CalcularMediaRecursivo(this.NodoInicial, sumatoriaAcumulada, catidadElementoAcumulado);
        return sumatoriaAcumulada / catidadElementoAcumulado;
    }

    /**
     * Método recursivo para el calculo de la media de la lista
     * @param nodo nodo inicial 
     * @param sumatoriaAcumulada valor acumulado de los nodos
     * @param catidadElementoAcumulado número de nodos de la lista
     */
    private void CalcularMediaRecursivo(Nodo nodo, double sumatoriaAcumulada, int catidadElementoAcumulado)
    {
        catidadElementoAcumulado++;
        sumatoriaAcumulada += nodo.getValor();
        
        if(nodo.getNodoSiguente() != null)   
            this.CalcularMediaRecursivo(nodo, sumatoriaAcumulada, catidadElementoAcumulado);
    }
    
    /**
     * Método para obtener la impresión de la lista
     * @return string con la impresión de la lista
     */
    public String ImprimirLista()
    {
        Nodo nodoImprimir = this.NodoInicial;
        int i = 0;
        String stringLista = "";
        
        while(nodoImprimir != null)
        {
            stringLista += "Nodo " + i + ": " + nodoImprimir.getValor() + "\n\r";
            nodoImprimir = nodoImprimir.getNodoSiguente();
            i++;
        }
        
        return stringLista;
    }
}
