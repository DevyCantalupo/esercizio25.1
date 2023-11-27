public class esercizio25di1 {
    private static void sumaEnteros(int z, int y) {
        int suma = z + y;
        System.out.println("Suma de 2 numeros int: " + suma);
    }

    private static void printChar(char z) {
        System.out.println("print valor del char: " + z);
    }

    private static void sumaDeInteger(Integer z, Integer y) {
        Integer suma = z + y;
        System.out.println("Suma de no 2 enteros de la clase Integer: " + suma);
    }

    private static void printCharacter(Character z) {
        System.out.println("print valor de la clase Character: " + z);
    }
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 3;
        sumaEnteros(num1, num2);

        char char1 = 'P';
        printChar(char1);

        Integer num3 = 10;
        Integer num4 = 40;
        sumaDeInteger(num3, num4);

        Character char2 = 'U';
        printCharacter(char2);


        Integer num5 = 99;
        Double num6 = 1.618;
        Character char3 = 'T';

        int numeroInt = num5;
        double numeroDouble = num6;
        char char4 = char3;
        }

    }

