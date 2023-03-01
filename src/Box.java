public class Box {
    double width;
    double height;
    double length;

     Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size){
         width = size;
         height = size;
         length = size;
    }

    Box(){
         width = 0;
         height = 0;
         length = 0;
    }

    Box(Box box){
         this.width = box.width;
         this.height = box.height;
         this.length = box.length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box increase(int i){
        return new Box(width * i, height * i, length * i);
    }

    double volume() {
        return width * height * length;

    }
    void showVolume(){
         double volume = volume();
        System.out.println(volume);
    }

    int  compare(Box box){
         double thisVolume = volume();
         double boxVolume = box.volume();
         int result;
         if (thisVolume > boxVolume){
             result = 1;
//             System.out.println("Наша коробка больше");
         } else if (thisVolume < boxVolume){
             result = -1;
//             System.out.println("Наша коробка меньше");
         } else {
             result = 0;
//             System.out.println("Коробки равны");
         }
         return result;
    }

    @Override                                                 // переопределяем метод
    public String toString() {
         String result = String.format("Ширина: %s\nДлина: %s\nВысота: %s", width, length, height);
         return result;
    }
}
