public class Main {
    public static void main(String[] args) {

        String margin = "----------------------------------------------------".repeat(5);
           Item coke = new Item("drink","coke",1.50);
           coke.printItem();
           coke.setSize("Large");
           coke.printItem();

           Item avocado = new Item("Topping","Avocado",1.50);
           avocado.printItem();

           System.out.println(margin);
           Burger burger = new Burger("regular",4.00);
           burger.addToppings("BACON","CHEESE","MAYO");
           burger.printItem();

           System.out.println(margin);
           MealOrder regularMeal = new MealOrder();
           regularMeal.addBurgerToppings("bacon","cheese","mayo");
           regularMeal.setDrinkSize("large");
           regularMeal.printItemizedList();

           System.out.println(margin);

           MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
           secondMeal.addBurgerToppings("lettuce","cheese","mayo");
           secondMeal.setDrinkSize("small");
           secondMeal.printItemizedList();

            System.out.println(margin);

            MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chili");
            deluxeMeal.addBurgerToppings("Avocado","Bacon","Lettuce","Cheese","Mayo");
            deluxeMeal.setDrinkSize("SMALL");
            deluxeMeal.printItemizedList();

    }
}
