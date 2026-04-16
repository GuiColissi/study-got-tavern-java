package com.guilherme.got;

public class MenuItem {

    // Attributes
String name;
int price;
String description;

boolean hasVariation;
String variationName;
int variationPrice;

public MenuItem(String name, String description, int price, 
                    boolean hasVariation, String variationName, int variationPrice) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.hasVariation = hasVariation;
        this.variationName = variationName;
        this.variationPrice = variationPrice;
    }

public static void printIncorrect(){
    System.out.println(
   " ╔════════════════════════════════════════╗\n"+
   " ║      INCORRECT SELECTION, WARRIOR!     ║\n"+
   " ╚════════════════════════════════════════╝\n");
 }

    

public void printItem() {
    System.out.println("╔════════════════════════════════════════════════════════════╗");
    System.out.printf("║ ||  ITEM: %-47s ||║%n", name);
    System.out.println("║ ||--------------------------------------------------------||║");
    System.out.printf("║ ||  Description: %-39s ||║%n", description);
    System.out.printf("║ ||  Price:     %-42d ||║%n", price);
    System.out.println("║ ||                                                        ||║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");
}
   

public void printVariation(){
    System.out.println("╔════════════════════════════════════════════════════════════╗");
    System.out.printf("║ ||  ITEM: %-47s ||║%n", variationName);
    System.out.println("║ ||--------------------------------------------------------||║");
    System.out.printf("║ ||  Description: %-39s ||║%n", description);
    System.out.printf("║ ||  Price:     %-42d ||║%n", variationPrice);
    System.out.println("║ ||                                                        ||║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");
 }

 }


