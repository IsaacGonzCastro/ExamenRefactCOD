package examenrefact;

/**
 *
 * @author igonzalezcastro
 */
public class ExamenRefact {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.

    public static boolean p = false;

    public static void main(String[] args) {
        {
            int digitos = 3;
            int numerodigitos = 0;
            PedirNumeroDigitos(digitos);
            for (int i = 1; i <= 99999; i++) {
                int auxiliar = i;

                int contador = 0;

                contador = Contador(auxiliar, contador);
                numerodigitos = contador;

                if (numerodigitos == digitos) {
                    if (i < 4) {
                        p = true;
                    } else {
                        if (i % 2 == 0) {
                            p = false;
                        } else {
                            int contador1 = 0;
                            int i1 = 1;
                            int k = (i - 1) / 2;
                            if (k % 2 == 0) {
                                k--;
                            }

                            contador1 = NumerosPrimos(i1, k, i, contador1);

                            if (contador1 == 1) {
                                p = true;
                            }
                        }
                    }

                    if (p == true) {
                        System.out.println(i);
                    }
                }
            }
        }

    }

    public static int NumerosPrimos(int i1, int k, int i, int contador1) {
        while (i1 <= k) {
            if (i % i1 == 0) {
                contador1++;
            }
            i1 += 2;
            if (contador1 == 2) {
                i1 = k + 1;
            }
        }
        return contador1;
    }

    public static int Contador(int auxiliar, int contador) {
        while (auxiliar != 0) {
            auxiliar = auxiliar / 10;
            contador++;
        }
        return contador;
    }

    public static void PedirNumeroDigitos(int digitos) {
        if (digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }
}
