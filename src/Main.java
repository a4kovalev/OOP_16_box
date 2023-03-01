public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = box1.increase(3);
        box1.showVolume();
        box2.showVolume();
        System.out.println(box1);                // метод toString, для использования переопределяем в классе Box




        double random = Math.random();          // метод рандома
        random *= 6;
        int randomInt = (int) random;
        randomInt++;
        System.out.println(randomInt);

        int result = (int) (Math.random() * 7 + 1);      // или короче так
        System.out.println(result);

    }
}