public class Cars {

    String cars;

    Cars(String car) {
        cars = car;
        System.out.println("Brand : " + cars);

    }

    public static void main(String[] args) {
        Cars bmw = new Cars("BMW");
        Cars benz = new Cars("BENZ");
        Cars audi = new Cars("AUDI");
        Cars mazda = new Cars("MAZDA");
    }
}
