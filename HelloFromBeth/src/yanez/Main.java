package yanez;

public class Main {

    private static final String name = "Beth";

    public static void main(String[] args) {
        System.out.println(String.format("Hello, my name is %s.", name));
        System.out.println(String.format("Hello %s!", name));

        System.out.print(String.format("Hello Beth, my name is %s.", "Anne"));
        System.out.println("");
        String name = "Lisa";
        System.out.println(String.format("Hello Beth, my name is %s.", name));
    }
}
