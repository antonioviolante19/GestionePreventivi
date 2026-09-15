/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;
import java.util.Scanner;
/**
 *
 * @author Salva
 */
public abstract class Autovettura implements Comparable<Autovettura> {
    private String marca;
    private String tipo;
    private double costo;
    private ListaAccessori lista;
    
    public Autovettura(String marca,String tipo,double costo){
        this.marca=marca;
        this.tipo=tipo;
        this.costo=costo;
    }
    
    public void InserisciAccessorio(Accessorio a){
        lista.inserisci(a);
    }
    
    public void EliminaAccessorio(){
        lista.elimina();
    }
    
    public abstract double CalcolaPreventivo();
    public abstract void StampaVociPreventivo();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ListaAccessori getLista() {
        return lista;
    }

    public void setLista(ListaAccessori lista) {
        this.lista = lista;
    }
    
    
}
