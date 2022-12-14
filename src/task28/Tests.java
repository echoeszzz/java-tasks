package task28;


import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        System.out.println("\n" + "Заказ в ресторане: ");
        Order restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Dish(400, "Болоньезе", "паста"));
        try {
            restaurantOrder.add(new Dish(-1, "Карбонара", "Сливочная"));
        } catch (IllegalArgumentException e) {
            System.err.println(e.toString());
        }
        restaurantOrder.add(new Drink(190, "Лимонад", "Дюшес"));
        restaurantOrder.add(new Drink(150, "Лимонад", "Ситро"));

        System.out.println(Arrays.toString(restaurantOrder.getMenu()));
        OrderManager orderManager = new OrderManager();
        try {
            orderManager.add(restaurantOrder, 1);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }
        try {
            orderManager.add(restaurantOrder, 1);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n" + "Заказ через Интернет: ");
        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish(666, "Вок", "Острый"));
        internetOrder.add(new Drink(160, "Сок", "Апельсиновый"));
        String address = "Связистов 10, 23";

        try {
            orderManager.add(internetOrder, address);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderManager.add(internetOrder, address);
        } catch (OrderAlreadyException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(Arrays.toString(internetOrder.getMenu()));
    }
}