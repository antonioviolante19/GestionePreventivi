/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionepreventivi;

/**
 *
 * @author Salva
 */
public class GestionePreventivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto_Elettrica auto1 = new Auto_Elettrica("Fiat","500",21000,1500,2000);
        Auto_a_Combustione auto2 = new Auto_a_Combustione("Fiat","Panda",10000,"benzina",300);
        
        
        auto1.InserisciAccessorio(new Accessorio("Sensori di parcheggio",700));
        auto1.InserisciAccessorio(new Accessorio("Cerchi in lega",1300));
        auto2.InserisciAccessorio(new Accessorio("Navigatore",500));
        auto2.InserisciAccessorio(new Accessorio("Sedili in pelle",1200));
        
        if(auto1.compareTo(auto2)<=0){
            auto1.toString();
            auto1.StampaVociPreventivo();
            
            auto2.toString();
            auto2.StampaVociPreventivo();
        }else{
            auto2.toString();
            auto2.StampaVociPreventivo();
            
            auto1.toString();
            auto1.StampaVociPreventivo();
        }
    }
    
}
