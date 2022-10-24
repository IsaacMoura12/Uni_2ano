package Aula8;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Viatura> viaturas = new ArrayList<Viatura>();
        viaturas.add(new Motociclo("mota", "bmw", "s1", 250, "gasoil"));
        viaturas.add(new Taxi("manel", "mercedes", "benzer", 690, 40, 1000, 101));
        viaturas.add(new Ligeiro("carrito", "popo", "este", 99, 2, 660));
        viaturas.add(new PesadoMercadorias("pesado", "volvo", "1", 800, 2, 20000, 40000));
        viaturas.add(new PesadoPassageiros("bus", "volvo", "2", 1200, 3, 5000, 32));
        int maxKm = 0;
        Viatura maxima = viaturas.get(0);
        for (Viatura viatura : viaturas) {
            viatura.trajeto(ThreadLocalRandom.current().nextInt(1, 10 + 1));
            viatura.trajeto(ThreadLocalRandom.current().nextInt(1, 10 + 1));
            for (Viatura viatura2 : viaturas) {
                System.out.printf(
                        "\nViatura 1 (%s) equals(Viatura 2): %b\n.ultimoTrajeto(): %d\t.distanciaPercorrida(): %d\n",
                        viatura,
                        viatura.equals(viatura2), viatura.ultimoTrajeto(), viatura.distanciaTotal());
            }
            if (viatura.distanciaTotal() > maxKm) {
                maxKm = viatura.distanciaTotal();
                maxima = viatura;
            }
        }
        Empresa empresa = new Empresa("empresa", "3700-200", "email", viaturas);
        System.out.println("\n\n" + empresa);
        System.out.printf("\n\nViatura com mais distância percorrida: %s", maxima);
    }

}
