/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
* <h1>Nodo</h1>
* Clase nodo 
*
* @author Juan Pablo Ospino Solano
* @version 1.0
* @since   2017-02-05
*/
public class Nodo extends Model.Interface.INodo{
    private Nodo NodoSiguente;
    
    private double Valor;
    
    /**
     * Método get del nodo siguiente
     * @return el nodo siguiente
     */
    public Nodo getNodoSiguente() {
        return NodoSiguente;
    }

    /**
     * Método set del nodo siguiente
     * @param NodoSiguente nodo a configurar como el siguiente
     */
    public void setNodoSiguente(Nodo NodoSiguente) {
        this.NodoSiguente = NodoSiguente;
    }

    /**
     * Método get del valor
     * @return valor del nodo
     */
    public double getValor() {
        return Valor;
    }
    
    /**
     * Constructor por defecto del nodo
     */
    private Nodo()
    {
    }
    
    /**
     * Constructor que recibe el valor de un nodo
     * @param valor Valor a crear el nodo
     */
    public Nodo(double valor)
    {
        this.Valor = valor;
    }
}
