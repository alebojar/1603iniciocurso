
import java.util.Scanner;

public class AloMundo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o codigo do seu pedido:");
		int codigoDigitado = scanner.nextInt();

		Pedido pedido = new Pedido();

		pedido.setCodigo(codigoDigitado);
		System.out.println(pedido.getCodigo());
	}
}