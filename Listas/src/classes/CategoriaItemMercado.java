/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package classes;

/**
 *
 * @author herrmann
 */
public enum CategoriaItemMercado {
    
    PAPELARIA,
    ALIMENTOS,
    CONGELADOS_FRIOS,
    HORTIFRUTI,
    LIMPEZA,
    HIGIENE,
    BEBIDAS,
    PADARIA;
    
    public String getCategoriaNome(){
        
        return 
                switch (this){
                    case PAPELARIA -> "Papelaria";
                    case ALIMENTOS -> "Alimentos";
                    case CONGELADOS_FRIOS  -> "Congelados e Frios";
                    case HORTIFRUTI -> "Horti e fruti";
                    case LIMPEZA -> "Limpeza";
                    case HIGIENE -> "Higiene";
                    case BEBIDAS -> "Bebidas";
                    case PADARIA -> "Padaria";
                    default -> "Não existe";
                };
    }
    
    
}
