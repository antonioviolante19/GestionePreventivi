/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class ListaAccessori {
    private Nodo<Accessorio> head;
    private int lunghezza=5;
    
    public ListaAccessori(int lunghezza){
        this.lunghezza=lunghezza;
    }
    
    public void inserisci(Accessorio a){
        if(this.full()==false){
        Nodo<Accessorio> n = new Nodo<Accessorio>(a);
        n.setNext(head);
        head=n;
        }else{
            System.out.println("La lista è piena,impossibile inserire altri accessori.");
        }
    }
    
    public Accessorio elimina(){
        Accessorio eliminato = head.getContenuto();
        if(head==null){
            System.out.println("la lista è vuota.");
        }else{
            head = head.getNext();
        }
        return eliminato;
    }
    
    public boolean empty(){
        return (head==null);
    }
    
    public boolean full(){
        int contatore = 0;
        Nodo<Accessorio> current = head;
        while(current!=null){
            contatore++;
            current = current.getNext();
        }
        return(contatore<this.lunghezza);
    }
    
    public boolean cerca(String a){
        boolean cerca = false;
        Nodo<Accessorio> current = head;
        while(current!=null){
            if(current.getContenuto().getNome().equalsIgnoreCase(a)){
                System.out.println("Accessorio presente in lista.");
                cerca = true;
            }
            current = current.getNext();
            }
        return cerca;
        }
    
    public void StampaCostiAccessori(){
        Nodo<Accessorio> current = head;
        while(current!=null){
            current.getContenuto().toString();
            current = current.getNext();
        }
    }
    
    public double CalcolaTotaleAccessori(){
        Nodo<Accessorio> current = head;
        double costototale=0;
        while(current!=null){
            costototale += current.getContenuto().getCostobase();
            current = current.getNext();
        }
        System.out.println("l'ammontare di prezzo di tutti gli accessori presenti in lista è:" + costototale);
        return costototale;
    }

    public Nodo<Accessorio> getHead() {
        return head;
    }

    public void setHead(Nodo<Accessorio> head) {
        this.head = head;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }
    
    }

