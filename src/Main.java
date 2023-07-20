public class Main {

    public static void main(String[] args) {

        String[] carBrands = { "Fiat", "Lancia", "Skoda", "BMW", "Dacia" };

        System.out.println("Numeri di elementi nell'array: " + carBrands.length);
        System.out.println("Terzo elemento nell'array: " + carBrands[2]);


        int[] primeNumbers = new int[6];

        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println("Il contenuto del primeNumbers array è: ");
        System.out.println(primeNumbers[0]);
        System.out.println(primeNumbers[1]);
        System.out.println(primeNumbers[2]);
        System.out.println(primeNumbers[3]);
        System.out.println(primeNumbers[4]);
        System.out.println(primeNumbers[5]);

    }
}