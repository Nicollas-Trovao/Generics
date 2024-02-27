package generic;

import java.util.ArrayList;
import java.util.List;

public class Principal{

public class Main {
    public static void main(String[] args) {
        List<Carro<String>> carros = new ArrayList<>();

        HRV<String> hrv = new HRV<>();
        hrv.setModelo("HRV");
        hrv.setAno("2009");
        hrv.setCor("Preto");
        carros.add(hrv);

        Civic<String> civic = new Civic<>();
        civic.setModelo("Civic");
        civic.setAno("2015");
        civic.setCor("Branco");
        carros.add(civic);

        for (Carro<String> carro : carros) {
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Cor: " + carro.getCor());
            System.out.println();
        }
    }
}
    
}