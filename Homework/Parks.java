package Homework;

public class Parks {
    public String attractions;
    public String time;
    public int price;

    public static class Inner extends Parks {
        public Inner(String attractions, String time, int price) {
            this.attractions = attractions;
            this.time = time;
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return String.format("Аттракцион: %s \nВремя работы: %s \nСтоимость: %s", attractions, time, price);
    }

    public static void main(String[] args) {
        Parks karusel = new Parks.Inner("Карусель", "9:00 - 14:00", 2);
        Parks gorki = new Parks.Inner("Американские горки", "10:00 - 18:00", 4);
        System.out.println(karusel);
        System.out.println();
        System.out.println(gorki);
    }
}
