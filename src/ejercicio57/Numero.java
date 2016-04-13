package ejercicio57;

/**
 * @author Xuan
 */
public class Numero
{
	public static final int ASCENDENTE = 0;
	public static final int DESCENDENTE = 1;

	/**
	 * Dice si un numero entero es primo o no.
	 * Es decir, si es divisible unicamente por 0 y por si mismo.
	 * @param numero int
	 * @return TRUE si es primo y FALSE si no lo es.
	 */
	public static boolean esPrimo(int numero)
	{
		for (int i = 2; i <= numero / 2; i++ )
		{
			if(numero % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Dice si un numero entero es perfecto o no.
	 * Es decir, si es igual a la suma de sus divisores propios positivos.
	 * @param numero int
	 * @return TRUE si es perfecto y FALSE si no lo es.
	 */
	public static boolean esPerfecto(int numero)
	{
		int sumaDivisores = 0;
		for (int i = 1; i <= numero / 2; i++)
		{
			if (numero % i == 0)
				sumaDivisores += i;
		}
		if(numero == sumaDivisores)
			return true;
		return false;
	}

	/**
	 * Dice si un numero entero es capicua o no.
	 * Es decir, se lee igual de de principio a fin y viceversa.
	 * @param numero int
	 * @return TRUE si es capicua y FALSE si no lo es.
	 */
	public static boolean esCapicua(int numero)
	{
		String num = String.valueOf(numero);
		int contador = num.length() - 1;
		for (int i = 0; i < num.length() / 2; i++)
		{
			if (num.charAt(i) != num.charAt(contador))
				return false;
			contador--;
		}

		return true;
	}

	/**
	 * Dice si dos numeros enteros son amigos o no.
	 * Dos numeros son amigos si la suma de los divisores propios
	 * de uno es igual al otro numero y viceversa.
	 * @param numero1 int
	 * @param numero2 int
	 * @return TRUE si son amigos FALSE si no lo son.
	 */
	public static boolean sonAmigos(int numero1, int numero2)
	{
		int sumaDivisores = 0;
		for (int i = 1; i <= numero1 / 2; i++)
		{
			if (numero1 % i == 0)
				sumaDivisores += i;
		}
		if (sumaDivisores == numero2)
		{
			sumaDivisores = 0;
			for (int i = 1; i <= numero2 / 2; i++)
			{
				if(numero2 % i == 0)
				{
					sumaDivisores += i;
				}
			}
			if(sumaDivisores == numero1)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Extrae los divisores de un numero entero.
	 * Los divisores de un numero son los numeros que lo pueden dividir,
	 * resultando de cociente otro numero y de resto 0.
	 * @param numero int
	 * @return int[] Contiene los divisores del numero sin incluir
	 * el propio numero y su tamaño varía segun los divisores que tenga.
	 */
	public static int[] extraeDivisores(int numero)
	{
		int contDivisores = 0;
		int posicion = 0;
		for (int i = 1; i <= numero / 2; i++)
		{
			if (numero % i == 0)
				contDivisores++;
		}
		int [] divisores = new int[contDivisores];
		for (int i = 1; i <= numero / 2; i++)
		{
			if (numero % i == 0)
			{
				divisores[posicion] = i;
				posicion++;
			}
		}
		return divisores;
	}

	/**
	 * Duplica el contenido de cada uno de los numeros de un array de enteros
	 * pasado como parámetro.
	 * @param enteros int[]
	 */
	public static void duplica(int[] enteros)
	{
		for (int i = 0; i < enteros.length; i++)
		{
			enteros[i] = enteros[i] * 2;
		}
	}

	/**
	 * Ordena el contenido de un array de enteros pasado como primer parametro.
	 * @param enteros int[] El array a ordenar.
	 * @param tipoOrden int Indica el tipo de orden, siendo los valores posibles
	 * las constantes ASCENDENTE y DESCENDENTE.
	 */
	public static void ordena(int[] enteros, int tipoOrden)
	{
		boolean ordenado = false;
		int aux;
		if(tipoOrden == ASCENDENTE)
		{
			for (int i = 0; i < enteros.length - 1 && !ordenado; i++)
			{
				ordenado = true;
				for (int j = 0; j < enteros.length - 1 - i; j++)
				{
					if(enteros[j] > enteros[j + 1])
					{
						aux = enteros[j];
						enteros[j] = enteros[j + 1];
						enteros[j + 1] = aux;
						ordenado = false;
					}
				}
			}
		}
		else if(tipoOrden == DESCENDENTE)
		{
			for (int i = 0; i < enteros.length - 1 && !ordenado; i++)
			{
				ordenado = true;
				for (int j = 0; j < enteros.length - 1 - i; j++)
				{
					if(enteros[j] < enteros[j + 1])
					{
						aux = enteros[j];
						enteros[j] = enteros[j + 1];
						enteros[j + 1] = aux;
						ordenado = false;
					}
				}
			}
		}
	}

	/**
	 * Elimina los posibles numeros primos que pudiera tener un array de enteros,
	 * y lo redimensiona a su nuevo tamaño si fuera necesario.
	 * @param enteros int[] El array al que se le suprimiran los primos si los hay.
	 * @return int[] Array redimensionado sin los primos en caso de haberlos.
	 */
	public static int[] eliminaPrimos(int[] enteros)
	{
		int contadorPrimos = 0;
		for (int i = 0; i < enteros.length; i++)
		{
			if(Numero.esPrimo(enteros[i]))
			{
				for (int j = i; j < enteros.length - 1; j++)
				{
					enteros[j] = enteros[j + 1];
				}
				contadorPrimos++;
			}
		}
		if(contadorPrimos != 0)
		{
			int nuevoTam = enteros.length - contadorPrimos;
			int[] enterosSinPrimos = new int[nuevoTam];
			for (int i = 0; i < enterosSinPrimos.length; i++)
			{
				enterosSinPrimos[i] = enteros[i];
			}
			return enterosSinPrimos;
		}
		return enteros;
	}
}