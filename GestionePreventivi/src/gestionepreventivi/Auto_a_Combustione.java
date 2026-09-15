/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class Auto_a_Combustione extends Autovettura {
    private String carburante;
    private double tassa_ambientale;
    
    public Auto_a_Combustione(String marca,String tipo,double costo,String carburante,double tassa){
        super(marca,tipo,costo);
        this.carburante=carburante;
        this.tassa_ambientale=tassa;
    }

    @Override
    public double CalcolaPreventivo() {
        return (this.getCosto()+this.getTassa_ambientale()+this.getLista().CalcolaTotaleAccessori());
    }

    @Override
    public void StampaVociPreventivo() {
        System.out.println("Costo base:" + this.getCosto() + " Costo tassa:" + this.getTassa_ambientale());
        System.out.println("lista accessori:");
        this.getLista().StampaCostiAccessori();
        
        System.out.println("Preventivo finale:" + this.CalcolaPreventivo());
    }

    @Override
    public int compareTo(Autovettura o) {
        int preventivo1 = (int) this.CalcolaPreventivo();
        int preventivo2 = (int) o.CalcolaPreventivo();
        return Integer.compare(preventivo1, preventivo2);
    }

    public String getCarburante() {
        return carburante;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public double getTassa_ambientale() {
        return tassa_ambientale;
    }

    public void setTassa_ambientale(double tassa_ambientale) {
        this.tassa_ambientale = tassa_ambientale;
    }
    
    @Override
    public String toString(){
       return "[AUTO A COMBUSTIONE]" + " [marca:" + this.getMarca() + " tipo:" + this.getTipo() + " carburante:" + this.getCarburante() + " tassa:" + this.getTassa_ambientale() + " preventivo:" + this.CalcolaPreventivo();
    }
}
