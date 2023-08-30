import MundoAnimal.Cachorro;
import MundoAnimal.Animal;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setPeso(5.300);
        c1.mamar();
        System.out.println(c1.comer("carne"));
        System.out.println("O peso é:"+c1.getPeso());



        ;
    }
}