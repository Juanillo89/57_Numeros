package ejercicio57;

/**
 * Prueba las funcionalidades de la clase Numero.
 * @author Xuan
 */
public class Main
{

	public static void main(String[] args)
	{
		System.out.println(Numero.esPrimo(7));
		System.out.println(Numero.esPrimo(50));
		System.out.println(Numero.esPerfecto(6));
		System.out.println(Numero.esPerfecto(10));
		System.out.println(Numero.esCapicua(45654));
		System.out.println(Numero.esCapicua(23456));
		System.out.println(Numero.sonAmigos(220, 284));
		System.out.println(Numero.sonAmigos(10, 6));
		int[] numeros;
		numeros = Numero.extraeDivisores(200);
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		Numero.duplica(numeros);
		System.out.println("Numeros duplicados:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		Numero.ordena(numeros, Numero.DESCENDENTE);
		System.out.println("Numeros ordenados descendente:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		Numero.ordena(numeros, Numero.ASCENDENTE);


		System.out.println("Numeros ordenados ascendente:");
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}


		System.out.println("Numeros ordenados ascendente sin primos:");
		numeros = Numero.eliminaPrimos(numeros);
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}
}