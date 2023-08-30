package MundoAnimal;

public class Cachorro extends Animal implements Mamifero {


    @Override
    public String comer(String alimento) {
        return "Comendo "+alimento;
    }

    @Override
    String locomover(String modoLocomocao) {
        return "Andando";
    }

    @Override
    public String mamar() {
        return "Mamando";
    }
}
