package generic;

abstract class Carro<T> {
    private T modelo;
    private T ano;
    private T cor;

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }

    public T getAno() {
        return ano;
    }

    public void setAno(T ano) {
        this.ano = ano;
    }

    public T getCor() {
        return cor;
    }

    public void setCor(T cor) {
        this.cor = cor;
    }
}

class HRV<T> extends Carro<T> {

}

class Civic<T> extends Carro<T> {

}