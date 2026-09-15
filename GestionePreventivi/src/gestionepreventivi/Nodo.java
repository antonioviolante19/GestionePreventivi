/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class Nodo<Accessorio> {
    private Accessorio contenuto;
    private Nodo<Accessorio> next;
    
    public Nodo(Accessorio contenuto){
        this.contenuto=contenuto;
        this.next=null;
    }

    public Accessorio getContenuto() {
        return contenuto;
    }

    public void setContenuto(Accessorio contenuto) {
        this.contenuto = contenuto;
    }

    public Nodo<Accessorio> getNext() {
        return next;
    }

    public void setNext(Nodo<Accessorio> next) {
        this.next = next;
    }
    
    
}
