class Greeting {
    public static void main( String[] args) {
        System.console().printf("Please tell me your name: \n");
        String name = System.console().readLine();

        System.console().printf("Hello %s\n", name);
        System.out.println("Hello "+ name + "!");

    }j
}