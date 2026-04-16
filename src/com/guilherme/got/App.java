package com.guilherme.got;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            FoodItem[] foods = {
                    new FoodItem("Northern Roast Leg", "Leg of beast, seasoned in frozen shadows", 30, true,
                            "Northern Shadowed Lamb Leg", 35),
                    new FoodItem("Harrenhal Stew", "Stew of crimson broth and haunted meat", 25, false, "", 0),
                    new FoodItem("Wall Soup", "Soup of frostbitten roots and cursed fowl", 15, false, "", 0),
                    new FoodItem("Dragon Wings", "Wings scorched in draconic fire", 20, false, "", 0),
                    new FoodItem("King's Bread", "Dark crust, golden cursed heart", 10, false, "", 0),
                    new FoodItem("Royal Garden Salad", "Greens from shadow-haunted gardens", 12, false, "", 0)
            };

            DrinkItem[] drinks = {
                    new DrinkItem("Winterfell Mead", "Sweet mead brewed under icy moons", 8, true,
                            "Winterfell Ironbark Mug Mead", 12),
                    new DrinkItem("Iron Throne Beer", "Lager of kings fallen and betrayed", 6, true,
                            "Iron Throne Shadowforge Beer", 7),
                    new DrinkItem("Dornish Red Wine", "Red fire from desert tombs", 10, true, "Dornish Bloodmoon Cask", 40),
                    new DrinkItem("Seven Kingdoms Water", "Water from wells cursed by old gods", 4, true,
                            "Seven Kingdoms Silent Spring", 5)
            };

            ArrayList<MenuItem> order = new ArrayList<>();
            String confirm;
            int option;
            int total = 0;

            System.out.println(
                    "╔═════════════════════════════════════════════════════════════════════════════════════╗\n" +
                            "||                                                                                   ||\n" +
                            "||                 ████████╗ █████╗ ██╗   ██╗███████╗██████╗ ███╗   ██╗              ||\n" +
                            "||                 ╚══██╔══╝██╔══██╗██║   ██║██╔════╝██╔══██╗████╗  ██║              ||\n" +
                            "||                    ██║   ███████║██║   ██║█████╗  ██████╔╝██╔██╗ ██║              ||\n" +
                            "||                    ██║   ██╔══██║██║   ██║██╔══╝  ██╔══██╗██║╚██╗██║              ||\n" +
                            "||                    ██║   ██║  ██║╚██████╔╝███████╗██║  ██║██║ ╚████║              ||\n" +
                            "||                    ╚═╝   ╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝              ||\n" +
                            "||                          + ~ OF GAME OF THRONES  - WELCOME ~ +                    ||\n" +
                            "╚═════════════════════════════════════════════════════════════════════════════════════╝");

            System.out.println(
                    "                 />                                                            \n" +
                            "    (═          //══════════════════════════════════════════════════════(       \n" +
                            "    (*)OXOXOXOXO(*>   ---------------------------------------------------\\\\   \n" +
                            "    (═          \\\\════════════════════════════════════════════════════════)   \n" +
                            "                 \\\\>                                                          \n");

            System.out.println(
                            "╔══════════════════════════════════════════════════╗\r\n" + //
                            "║  BARTENDER RYKER                                 ║\r\n" + //
                            "╠══════════════════════════════════════════════════╣\r\n" + //
                            "║ \"Welcome, traveler… step inside the Shadow       ║\r\n" + //
                            "║  Hearth Tavern, where every choice has a price. \"║\r\n" + //
                            "╚══════════════════════════════════════════════════╝\r\n" + //
                            "");

            // Menu
            while (true) {
                System.out.println("╔════════════════════════════╗");
                System.out.println("║    ~ CHOOSE YOUR PATH ~    ║");
                System.out.println("▓░  [1] Food                 ║");
                System.out.println("▓░  [2] Drinks               ║");
                System.out.println("▓░  [0] Finish order         ║");
                System.out.println("╚════════════════════════════╝");
                System.out.print("-- ");
                option = teclado.nextInt();

                switch (option) {
                    case 1:
                        FoodItem.FoodMenu(foods);
                        System.out.print("\n-- ");
                        int foodoption = teclado.nextInt();
                        if (foodoption == 10)
                            break;
                        FoodItem selectedFood = foods[foodoption];

                        if (selectedFood.hasVariation) {
                            System.out.println(
                                          "\n╔════════════════════════════════════════╗\n" +
                                            "║▓░        EMBRACE THE VARIATION       ░▓║\n" +
                                            "║▓░   (Or stay in the mortal realm…)   ░▓║\n" +
                                            "╚════════════════════════════════════════╝\n" +
                                            "  [1] First Path  : " + selectedFood.name + "\n" +
                                            "  [2] Second Path : " + selectedFood.variationName + "\n");
                            System.out.print("-- ");
                            int varChoice = teclado.nextInt();

                            MenuItem itemToAdd;
                            switch (varChoice) {
                                case 1:
                                    selectedFood.printItem();
                                    itemToAdd = selectedFood;
                                    break;
                                case 2:
                                    selectedFood.printVariation();
                                    itemToAdd = new FoodItem(
                                            selectedFood.variationName,
                                            selectedFood.description,
                                            selectedFood.variationPrice,
                                            false,
                                            "",
                                            0);
                                    break;
                                default:
                                    MenuItem.printIncorrect();
                                    return;
                            }

                            teclado.nextLine();
                            System.out.println("\nConfirm? (y / n)");
                            System.out.print("-- ");
                            confirm = teclado.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                order.add(itemToAdd);
                                System.out.println("\nAh, a fine choice! Your feast shall be prepared immediately.\n");
                            } else {
                                System.out.println("\nChanged your mind? No worries, the tavern awaits your return!\n");
                            }

                        } else {
                            selectedFood.printItem();
                            teclado.nextLine();
                            System.out.println("\nConfirm? (y / n)");
                            System.out.print("-- ");
                            confirm = teclado.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                order.add(selectedFood);
                                System.out.println("\nAh, a fine choice! Your feast shall be prepared immediately.\n");
                            } else {
                                System.out.println("\nChanged your mind? No worries, the tavern awaits your return!\n");
                            }
                        }
                        break;

                    case 2:
                        DrinkItem.DrinkMenu(drinks);
                        System.out.print("\n-- ");
                        int drinkoption = teclado.nextInt();
                        if (drinkoption == 10)
                            break;
                        DrinkItem selectedDrink = drinks[drinkoption];

                        if (selectedDrink.hasVariation) {
                            System.out.println(
                                          "\n╔════════════════════════════════════════╗\n" +
                                            "║▓░        EMBRACE THE VARIATION       ░▓║\n" +
                                            "║▓░   (Or stay in the mortal realm…)   ░▓║\n" +
                                            "╚════════════════════════════════════════╝\n" +
                                            "  [1] First Path  : " + selectedDrink.name + "\n" +
                                            "  [2] Second Path : " + selectedDrink.variationName + "\n");
                            System.out.print("-- ");
                            int varChoice = teclado.nextInt();

                            MenuItem itemToAdd;
                            switch (varChoice) {
                                case 1:
                                    selectedDrink.printItem();
                                    itemToAdd = selectedDrink;
                                    break;
                                case 2:
                                    selectedDrink.printVariation();
                                    itemToAdd = new DrinkItem(
                                            selectedDrink.variationName,
                                            selectedDrink.description,
                                            selectedDrink.variationPrice,
                                            false,
                                            "",
                                            0);
                                    break;
                                default:
                                    MenuItem.printIncorrect();
                                    return;
                            }

                            teclado.nextLine();
                            System.out.println("\nConfirm? (y / n)");
                            System.out.print("-- ");
                            confirm = teclado.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                order.add(itemToAdd);
                                System.out.println("\nAh, a drink worthy of a true warrior! May it warm your soul.\n");
                            } else {
                                System.out.println("\nAh, cold feet again? The mug stays on the shelf!\n");
                            }

                        } else {
                            selectedDrink.printItem();
                            teclado.nextLine();
                            System.out.println("\nConfirm? (y / n)");
                            System.out.print("-- ");
                            confirm = teclado.nextLine();
                            if (confirm.equalsIgnoreCase("y")) {
                                order.add(selectedDrink);
                                System.out.println("\nAh, a drink worthy of a true warrior! May it warm your soul.\n");
                            } else {
                                System.out.println("\nAh, cold feet again? The mug stays on the shelf!\n");
                            }
                        }
                        break;

                    case 0:
                        System.out.println("\n The tavern keeper nods: Your feast awaits! Finalizing your order...");
                        break;

                    default:
                        MenuItem.printIncorrect();
                        break;

                }

                if (option == 0)
                    break;
            }
            for (MenuItem item : order) {
                total += item.price;
            }

            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║ ||                    ORDER NOTE                          ||║");
            System.out.println("║ ||--------------------------------------------------------||║");
            for (MenuItem item : order) {
                String line = item.name + " - $" + item.price;
                System.out.printf("║ ||  %-53s ||║%n", line);
            }
            System.out.println("║ ||                                                        ||║");
            System.out.printf("║ ||  Price: $%-45d ||║%n", total);
        }

        System.out.println("║ ||                                                        ||║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        System.out.println("\nMay your steps be steady, traveler.  \r\n" + //
                        "And may the night watch over your return..\r\n" + //
                        "");

        System.out.println(
                   "\n\n                  \\(______     ______)/\r\n" + //
                        "                  /`.----.\\   /.----.`\\\r\n" + //
                        "                 } /      :} {:      \\ {\r\n" + //
                        "                / {        } {        } \\\r\n" + //
                        "                } }      ) } { (      { {\r\n" + //
                        "               / {      /|\\}!{/|\\      }\\           NAME: GUILHERME COLISSI MARTINS\\r\n" + //
                        "               } }     ( (.\"^\".) )     { {          CLASS: 101 INFO.\r\n" + //
                        "              / {       (b\\   /d)       } \\\r\n" + //
                        "              } }       |\\~   ~/|       { {               THANKS!\r\n" + //
                        "             / /        | )   ( |        \\ \\\r\n" + //
                        "            { {        _)(,   ,)(_        } }\r\n" + //
                        "             } }      //  `\";\"`  \\\\      { {\r\n" + //
                        "            / /      //     (     \\\\      \\ \\\r\n" + //
                        "           { {      {(     -=)     )}      } }\r\n" + //
                        "            \\ \\     /)    -=(=-     (\\    / /\r\n" + //
                        "             `\\\\  /'/    /-=|\\-\\    \\`\\  //'\r\n" + //
                        "               `\\{  |   ( -===- )   |  }/'\r\n" + //
                        "                 `  _\\   \\-===-/   /_  '\r\n" + //
                        "                   (_(_(_)'-=-'(_)_)_)\n\n");
    }
}
