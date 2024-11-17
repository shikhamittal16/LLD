package DecoratorPattern.Pizza;

public class PizzaMain {

    public static void main(String []arg) {
        BasePizza pizza = new ExtraCheese(new Margherita());
        System.out.println(" margherita pizza with extra cheese price ----" + pizza.cost());

        BasePizza newPizza = new Mushroom(pizza);
        System.out.println(" margherita pizza with extra cheese and mushroom price ----" + newPizza.cost());
    }
}
