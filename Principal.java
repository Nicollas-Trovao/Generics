package generic;

public class Principal{

    public static void main(String [] args){

    //HRV
    HRV<String> hrv = new HRV<>("HRV", "2009", "Preto");
    String modelo = hrv.getModelo();
    String ano = hrv.getAno();
    String cor = hrv.getCor();

    System.out.print("Modelo: " + modelo);
    System.out.print("Ano: " + ano);
    System.out.println("Cor: " + cor);

    //Civic
    Civic<String> civic = new Civic<String>("Civic", "2005", "Azul");
    String modelo2 = civic.getModelo();
    String ano2 = civic.getAno();
    String cor2 = civic.getCor();

    System.out.print("Modelo: " + modelo2);
    System.out.print("Ano: " + ano2);
    System.out.println("Cor: " + cor2);

    //City
    City<String> city = new City<String>("City", "2000", "Branco");
    String modelo3 = city.getModelo();
    String ano3 = city.getAno();
    String cor3 = city.getCor();

    System.out.print("Modelo: " + modelo3);
    System.out.print("Ano: " + ano3);
    System.out.println("Cor: " + cor3);
    }
    
}