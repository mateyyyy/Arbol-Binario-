/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol;

/**
 *
 * @author matia
 */
public class Nodo {
    Object valor;
    Nodo izq;
    Nodo dcho;
    
    public Nodo(Object valor)
    {
        this.valor = valor;
        dcho = izq = null;
    }
    
    public Nodo(Object valor, Nodo izq, Nodo dcho)
    {
        this.valor = valor;
        this.izq = izq;
        this.dcho = dcho;
    }
}
