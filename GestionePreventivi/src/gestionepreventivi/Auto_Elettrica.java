/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class Auto_Elettrica extends Autovettura {
    private double CostoBatteria;
    private double TassaAmbientale;
    
    public Auto_Elettrica(String marca,String tipo,double costo,double batteria,double tassa){
        super(marca,tipo,costo);
        this.CostoBatteria=batteria;
        this.TassaAmbientale=tassa;
    }

    public int compareTo(Autovettura o) {
        int preventivo1 = (int) this.CalcolaPreventivo();
        int preventivo2 = (int) o.CalcolaPreventivo();
        return Integer.compare(preventivo1, preventivo2);
    }

    public double getCostoBatteria() {
        return CostoBatteria;
    }

    public void setCostoBatteria(double CostoBatteria) {
        this.CostoBatteria = CostoBatteria;
    }

    public double getTassaAmbientale() {
        return TassaAmbientale;
    }

    public void setTassaAmbientale(double TassaAmbientale) {
        this.TassaAmbientale = TassaAmbientale;
    }
    
    @Override
    public double CalcolaPreventivo(){
        return (this.getCosto()+this.getCostoBatteria()+this.getTassaAmbientale()+this.getLista().CalcolaTotaleAccessori());
    }
    
    @Override
    public void StampaVociPreventivo(){
        System.out.println("Costo base:" + this.getCosto() + " Costo Batteria:" + this.getCostoBatteria() + " Costo tassa:" + this.getTassaAmbientale());
        System.out.println("lista accessori:");
        this.getLista().StampaCostiAccessori();
        
        System.out.println("Preventivo finale:" + this.CalcolaPreventivo());
    }
    
    @Override
    public String toString(){
        return "[AUTO ELETTRICA] [marca:" + this.getMarca() + " tipo:" + this.getTipo() + " preventivo:" + this.CalcolaPreventivo();
    }
    
}
