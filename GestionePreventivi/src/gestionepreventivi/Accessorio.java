/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class Accessorio {
    private String nome;
    private double costobase;
    
    public Accessorio(String nome,double costobase){
        this.nome=nome;
        this.costobase=costobase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCostobase() {
        return costobase;
    }

    public void setCostobase(double costobase) {
        this.costobase = costobase;
    }
    
    @Override
    public String toString(){
        return "ACCESSORIO:" + this.getNome() + " costo:" + this.getCostobase();
    }
}
