public class Programming {

    String name;

    Programming() {

        System.out.println("Constructor Called :");
        name = "Programmer";
    }

    public static void main(String[] args) {

        Programming hashini = new Programming();
        System.out.println("Name is :- " + hashini.name);
    }
}
