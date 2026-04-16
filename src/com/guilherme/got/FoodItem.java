package com.guilherme.got;

public class FoodItem extends MenuItem {
    public FoodItem(String name, 
        String description, 
        int price, 
        boolean hasVariation, 
        String variationName, 
        int variationPrice)
        
        {
        super(name, description, price, hasVariation, variationName, variationPrice);
    }

public static void FoodMenu(FoodItem[] foods) {
System.out.println(
 "\n"+
 "           ╔════════════════════════════════════════════════════════════╗\n"+
 "           ||                  + FEASTS OF THE REALM +                 ||\n"+
 "           ╚════════════════════════════════════════════════════════════╝\n");
System.out.println(

"|  [0] Northern Roast Leg     | Roast leg w/ Northern spices (beef/lamb)               | $30/$35 |\n"+
"|  [1] Harrenhal Stew         | Beef stew w/ vegetables and heavy gravy                |   $25   |\n"+
"|  [2] Wall Soup              | Hearty vegetable + chicken soup                        |   $15   |\n"+
"|  [3] Dragon Wings           | Spicy baked chicken wings                              |   $20   |\n"+
"|  [4] King's Bread           | Rustic bread w/ cheese, herbs, butter                  |   $10   |\n"+
"|  [5] Royal Garden Salad     | Mixed greens, nuts, balsamic                           |   $12   |\n"+

"\n"+
    
"═════════════════════════════════════════════════════════════════════════════════════════════\n"+
"||                              [10] + FINISH ORDER +                                       ||\n"+
"═════════════════════════════════════════════════════════════════════════════════════════════\n");


       }
}
    
