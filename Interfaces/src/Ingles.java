public class Ingles implements Idioma {


    public void saludar() {
        System.out.println("Hi from England");

    }

    @Override
    public void despedir() {
        System.out.println("Bye");
    }
}
