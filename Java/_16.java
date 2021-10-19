public class _16 {

    public static void main(String[] args) {
        BallObject ball = new BallObject();
        FoodObject food = new FoodObject();
        ProductObject product = new ProductObject();

        System.out.println("The object `ball` is of class: " + ball.getClass().getSimpleName());
        System.out.println("The object `food` is of class: " + food.getClass().getSimpleName());
        System.out.println("The object `product` is of class: " + product.getClass().getSimpleName());
    }

}

class BallObject {

}

class FoodObject {

}

class ProductObject {

}