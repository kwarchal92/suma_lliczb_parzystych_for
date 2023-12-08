package suma_liczb_parzystych_for;

public class Suma {

    public static void main(String[] args)
    {
        int i, suma = 0;

        System.out.println("Program Sumuje liczby parzyste: ");

        for (i = 1; i<=100; i++)
        {
            if (i % 2 == 0) suma += i;
        }

        System.out.println("Suma liczb parzystych od 1-100 wynosi:\t" + suma);
    }
}
