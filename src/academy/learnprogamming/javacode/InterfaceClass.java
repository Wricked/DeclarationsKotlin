package academy.learnprogamming.javacode;

public class InterfaceClass {
    public static void main(String[] args) {
        // Declaração de variáveis
        int[] cx = new int[]{2, 3, 1, 4, 49, -8, 20, 99, 12, 9, 3, 33, 4};
        boolean skip = false;

        cx[10] = cx[2] + cx[10]; // 4
        cx[4] = cx[0] + cx[cx[8]]; // 6

        while (!skip) {
            cx[3] *= cx[3]; // 16

            if (cx[4] == cx[9]) {
                cx[7] = cx[6] - cx[4]; // 14
                cx[5] = cx[3] + cx[7]; //
                skip = true;
            } else {
                cx[3] -= 6; //10
                cx[4] += cx[1]; // 9
            }
        }
        System.out.println(cx[5]);
    }
    // {2, 3, 1, 4, 49, -8, 20, 99, 12, 9, 3, 33, 4};
    // Somar: cx[2] + cx[10] -> cx[10]
    // {2, 3, 1, 4, 49, -8, 20, 99, 12, 9, 4, 33, 4};
    // Somar: cx[0] + cx[cx[8]] -> cx[4]
    // {2, 3, 1, 4, 6, -8, 20, 99, 12, 9, 4, 33, 4};
    // Entra em um loop igual a true;
    // Somar: cx[3] * cx[3] -> cx[3]
    // {2, 3, 1, 16, 6, -8, 20, 99, 12, 9, 4, 33, 4};
    // Verificar: cx[4] == cx[9]?
    // Result: Não, entra no else
    // Somar: cx[3] - 6 -> cx[3]
    // {2, 3, 1, 10, 6, -8, 20, 99, 12, 9, 4, 33, 4};
    // Somar: cx[4] + cx[1] -> cx[4]
    // {2, 3, 1, 10, 9, -8, 20, 99, 12, 9, 4, 33, 4};
    // Finaliza else e retorna no começo do loop.
    // Somar: cx[3] * cx[3] -> cx[3]
    // {2, 3, 1, 100, 9, -8, 20, 99, 12, 9, 4, 33, 4};
    // Verificar: cx[4] == cx[9]?
    // Result: Sim, entra no if
    // Somar: cx[6] - cx[4] -> cx[7]
    // {2, 3, 1, 100, 9, -8, 20, 11, 12, 9, 4, 33, 4};
    // Somar: cx[3] + cx[7] -> cx[5]
    // {2, 3, 1, 100, 9, 111, 20, 11, 12, 9, 4, 33, 4};
    // Sai do if e do loop e termina o programa.
}