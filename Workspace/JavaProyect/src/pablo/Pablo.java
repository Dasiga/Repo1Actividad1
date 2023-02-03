package pablo;

public class Pablo {
	public static void main(String[] args) {
		
		System.out.println(devolverNombre());
		System.out.println(devolverHobbies());
		System.out.println(tresComidas());
		
	}

	
	
	public static String devolverNombre(){
	
	return "Hola, soy Pablo";
	
	}
	
	
	public static String devolverHobbies() {
		
		return "Mis hobbies son nadar, electrónica y hacer proyectos DIY";
		
	}
	public static String tresComidas() {
		return "pollo frito, pizza hawaiana, helado vainilla";
	}

}

