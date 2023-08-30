package MundoAnimal;

public abstract class Animal {
    double peso;
    String tamanho;

    abstract String comer(String alimento);
    abstract String locomover(String modoLocomocao);

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


}
