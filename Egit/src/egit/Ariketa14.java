package egit;

import java.util.Scanner;

public class Ariketa14 {

	//Suma tres numeros introducidos por el usuario
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("mete tres numeros");
		int num1 =Integer.parseInt(entrada.nextLine());
		int num2 =Integer.parseInt(entrada.nextLine());
		int num3 =Integer.parseInt(entrada.nextLine());
		//ifififififfififi
		//ififififififififif
		if (num1>num2 && num2>num3) {
			System.out.println("la cadena no es ascendente");
		}else {
			System.out.println("La cadena si es ascendete");
		}
	}

}
