package com.guilherme.got;

public class DrinkItem extends MenuItem {
    public DrinkItem(
        String name, 
        String description, 
        int price, 

        boolean hasVariation, 
        String variationName,
         int variationPrice)
         
         {
        super(name, description, price, hasVariation, variationName, variationPrice);
    }

public static void DrinkMenu(DrinkItem[] drinks) {
System.out.println(
 "\n"+
 "           ╔════════════════════════════════════════════════════════════╗\n"+
 "           ||                   + DRINKS OF SHADOWS +                  ||\n"+
 "           ╚════════════════════════════════════════════════════════════╝\n");

System.out.println(
"|  [0] Winterfell Mead        | Sweet mead   (cup / mug)                               |  $8/$12 |\n"+
"|  [1] Iron Throne Beer       | Cold lager   (light / dark)                            |  $6/$7  |\n"+
"|  [2] Dornish Red Wine       | Strong wine  (glass / bottle)                          | $10/$40 |\n"+
"|  [3] Seven Kingdoms Water  | Mineral water (sparkling / still)                       |  $4/$5  |\n"+

"\n"+
   
"═════════════════════════════════════════════════════════════════════════════════════════════\n"+
"||                              [10] + FINISH ORDER +                                       ||\n"+
"═════════════════════════════════════════════════════════════════════════════════════════════\n");


       }
}