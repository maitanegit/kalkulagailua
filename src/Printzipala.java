import java.util.Scanner;

public class Printzipala {

	static Scanner teklatua = new Scanner(System.in);
	static kalkuFx kalk = new kalkuFx(); 
	
	public static void main(String[] args) {
		//Azaltzeko:
		//√ -12.122222 = NaN
		//1/0
		
		String aukera = "";
		do {
			aukera = menuNagusia();
			if (aukera.equals("1")) {
				oinarrizkoEragiketak();
				
			}else if (aukera.equals("2")) {
				eragiketaKonplexuak();
			}
		
		}while(!(aukera.equals("3")));
	}
	
	public static String menuNagusia(){
        System.out.println("Aukeratu (1-3): \r\n" +
        		"1. Oinarrizko eragiketak\r\n" +
                "2. Eragiketa konplexuak\r\n" + 
                "3. Programa amaitu\r\n"); 
        return teklatua.nextLine();
    }
	
	public static String menuOinarrizkoEragiketak(){
        System.out.println(
        		"a. Batuketa\r\n" +
                "b. Kenketa\r\n" + 
                "c. Biderketa\r\n" + 
                "d. Zatiketa\r\n"); 
        return teklatua.nextLine();
    }
	
	public static void oinarrizkoEragiketak() {
		String aukera = "";
		double zbk1, zbk2;
		boolean ondoAukeratuta = false;
		do {
			aukera = menuOinarrizkoEragiketak();
			if ((aukera.equals("a")) | (aukera.equals("b")) | (aukera.equals("c")) | (aukera.equals("d")) ){
				ondoAukeratuta = true;
				zbk1 = zenbakiaEskatu();
				zbk2 = zenbakiaEskatu();
				switch (aukera) {
					case "a": 
						System.out.println(zbk1 + " + " + zbk2 + " = " + kalk.batuketa(zbk1, zbk2) + "\n");
						break;
					case "b": 
						System.out.println(zbk1 + " - " + zbk2 + " = " + kalk.kenketa(zbk1, zbk2) + "\n");
						break;
					case "c": 
						System.out.println(zbk1 + " * " + zbk2 + " = " + kalk.biderketa(zbk1, zbk2) + "\n");
						break;
					case "d": 
						try {
							System.out.println(zbk1 + " / " + zbk2 + " = " + kalk.zatiketa(zbk1, zbk2) + "\n");
						} catch (ArithmeticException e) {
						    System.out.println("Zenbaki oso baten zatitzailea ezin da 0 izan. \n");
						}
						break;
				}
			}
		}while (!ondoAukeratuta);
	}
	
	public static String menuEragiketaKonplexuak(){
        System.out.println(
        		"a. Berreketa\r\n" +
                "b. Erro karratua\r\n"); 
        return teklatua.nextLine();
    }
	
	public static void eragiketaKonplexuak() {
		String aukera = "";
		double zbk1, zbk2;
		boolean ondoAukeratuta = false;
		do {
			aukera = menuEragiketaKonplexuak();
			if ((aukera.equals("a")) | (aukera.equals("b"))){
				ondoAukeratuta = true;
				
				zbk1 = zenbakiaEskatu();
				if (aukera.equals("a")) {
					zbk2 = zenbakiaEskatu();
					System.out.println(zbk1 + " ^ " + zbk2 + " = " + kalk.berreketa(zbk1, zbk2) + "\n");
					
				}else if (aukera.equals("b")) {
					System.out.println(" √ " + zbk1 + " = " + kalk.errokarratua(zbk1) + "\n");
				}
				
			}
		}while (!ondoAukeratuta);
	}
	
	public static double zenbakiaEskatu() {
		boolean zbkZuzena = false; 
		double zbk = -1;
		System.out.println("Sartu zenbaki bat");
		do {
			try {
	    		zbk = Double.parseDouble(teklatua.nextLine());
	    		zbkZuzena = true;
	    	}catch (NumberFormatException e){
	    		System.out.println("Sartutako zenbakia ez da zuzena, saiatu berriz.");
	    	}catch(Exception e){ 
	    		System.out.println("Errore bat eman da zenbakia sartzerakoan, saiatu berriz.");
	    	}
			
		}while(!zbkZuzena);//eskatu zenbakia zuzena izan arte
		return zbk;
	}
}
