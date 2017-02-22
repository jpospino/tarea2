/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ListaEnlazada;

/**
* <h1>Empleado</h1>
* Controlador de la vista App
*
* @author JJuan Pablo Ospino Solano
* @version 1.0
* @since   2017-02-05
*/
public class ListaEnlazadaController {
    private Model.ListaEnlazada ListaEnladada = null;
    
    /**
     * COnstructor de la case
     * @param arreglo arreglo de npumero a calcular
     */
    public ListaEnlazadaController(String[] arreglo)
    {
        this.ListaEnladada = this.CargarListaArreglo(arreglo);
    }
    
    /**
     * Carga un arreglo y retorna una lista en lazada
     * @param arreglo arreglo de números
     * @return lista en lazada de los números
     */
    private Model.ListaEnlazada CargarListaArreglo(String[] arreglo)
    {
        Model.ListaEnlazada listaEnlazada = new ListaEnlazada();
        
        Double[] arrayDouble = new Double[arreglo.length];
        
        for(int i = 0; i < arreglo.length; i++)
        {
            Boolean esDouble = true;
            Double valor = 0.0;
            try
            {
                valor = Double.parseDouble(arreglo[i]);
            }
            catch (Exception exc)
            {
                esDouble = false;
            }
            
            if(!esDouble)
            {
                System.out.println("hay errores en la definición del archivo.");
                return null;
            }
            
            listaEnlazada.AddNodo(valor);
        }
        
        return listaEnlazada;
    }
    
    
    public static ListaEnlazadaController CargarListaArchivo(String filePath)
    {
        return null;
    }
    
    /**
     * IMprime en consola la lista enlazada
     * @return string con la impresión de la lista enlazada
     */
    public String ImprimirLista()
    {
        if(this.ListaEnladada.getNodoInicial() == null)
            return "No hay elementos para mostrar";
        else
            return this.ListaEnladada.ImprimirLista();
    }
    
    /**
     * Calculo de la media de la lista enlazada
     * @return valor de la media de la lista
     */
    public Double CalcularMedia()
    {
        Model.Nodo nodo = ListaEnladada.getNodoInicial();
        Double sumatoria = 0.0;
        int cantidadElementos = 0;
        while(nodo != null)
        {
            cantidadElementos++;
            sumatoria += nodo.getValor();
            nodo = nodo.getNodoSiguente();
        }
        
        return sumatoria / cantidadElementos;
    }
    
    
    /**
     * Cálculo del a desviación estandar de la lista enlazada
     * @return desviación estandar de la lista.
     */
    public Double CalcularDesviacionStandar()
    {
        Model.Nodo nodo = ListaEnladada.getNodoInicial();
        Double valorMenosPromedioAlCuadrado = 0.0;
        Double valorPromedio = this.CalcularMedia();
        int cantidadElementos = 0;
        while(nodo != null)
        {
            cantidadElementos++;
            valorMenosPromedioAlCuadrado += Math.pow((nodo.getValor() - valorPromedio), 2);
            nodo = nodo.getNodoSiguente();
        }
        
        if(cantidadElementos == 1)
            return 0.0;
        
        return Math.sqrt(valorMenosPromedioAlCuadrado / (cantidadElementos - 1));
    }
}
