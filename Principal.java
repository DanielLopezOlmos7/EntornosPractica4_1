import java.util.Scanner;

public class Principal {
	static Scanner t = new Scanner(System.in);

	public static void main(String[] args) {
		int numUsers = 3;
		Usuario[] users = createUsuarios(numUsers);
		mostrarUsuarios(users);
	}

	public static Usuario[] createUsuarios(int num) {
		Usuario[] usuarios = new Usuario[num];
		for (int i = 0; i < usuarios.length; i++) {
			System.out.println("\nUSUARIO " + (i + 1) + ":");
			System.out.println("-------------");
			String nombre = getString("Nombre: ");
			String apellidos = getString("Apellidos: ");
			String email = getString("Email: ");
			usuarios[i] = new Usuario(nombre, apellidos, email);
		}
		return usuarios;
	}

	public static void mostrarUsuarios(Usuario[] users) {
		System.out.println("\nMOSTRANDO USUARIOS:");
		System.out.println("----------------------");
		for (int i = 0; i < users.length; i++) {
			System.out.print("USUARIO " + (i + 1) + ": ");
			System.out.println(users[i]);
		}
	}

	public static String getString(String enunciado) {
		System.out.print(enunciado);
		String text = "";
		try {
			text = t.nextLine();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return text;
	}
}