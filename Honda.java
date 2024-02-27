package generic;

public abstract class Honda <T> {
    
    private T Modelo, Ano, Cor;
   
    // Getters
    public T getModelo(){
      return Modelo;
    }
    public T getAno(){
        return Ano;
    }
    public T getCor(){
        return Cor;
    }
    //Setters
    public void setMod(T Modelo){
        this.Modelo = Modelo;
    }
    public void setAno(T Ano){
        this.Ano = Ano;
    }
    public void setCor(T Cor){
        this.Cor = Cor;
    }
}

