
public class igrica21 {
	public static void main(String[] args){
		ConsoleReader u = new ConsoleReader(System.in);
		String zadnji = "r"; //varijabla tko je zadnji igrao, nepotrebno ipak ostavio
		int tezina; // odabir tezine
		int x = 0; // koliko se oduzima
		int y= 0; //racunalo ovoliko oduzima ako je tezina 2 ili 3
		double random = 0; //random se ovde sprema
		int kov = 21; // kovanice
		String odabir = ""; // zelite li prvi igrati
		System.out.println("Igra 21 kovanice!\n Pravila: Tko uzme zadnju kovanicu gubi! U igri je 21 kovanica! Igrac i racunalo naizmjence uzimaju 1, 2 ili 3 kovanice!\n          Postoje 3 tezine! Odaberite tezinu: ");
		tezina  =u.readInt();
		if (tezina!=3){
			System.out.println("Zelite li prvi igrati? (d/n)");
			odabir  =u.readLine();
			if(odabir.equals("n")){
				random = Math.random();
				if(random<0.34) x = 1;
				else if (random>0.67) x = 2;
				else x = 3;
				kov = kov -x;
				System.out.println("Racunalo vuce potez i ostaje ti: "+kov+" kovanica");
				}	
		}
		while (kov>1){
			System.out.println("Uzmite kovanice! ");
			x = u.readInt();
			zadnji  ="i";
			if (x<1||x>3) {
				System.out.println("Varalica!");
				kov = 0;
				zadnji = "i";
				break;
			}
			kov = kov -x;
			System.out.println("Ostalo je: "+ kov+" kovanica!");
			if(kov == 3){
				System.out.println("Racunalo uzima 2 kovanice i tebi ostaje zadnja - GUBIS!");
				kov = 1;
				zadnji  ="r";
			}
			else if(kov==2){
				System.out.println("Racunalo uzima 1 kovanicu i ti gubis!");
				kov = 1;
				zadnji  ="r";
			}
			else if(kov==1){
				System.out.println("Pobijedio si!");
				kov = 0;
				
			}
			else {
				if(tezina==1||(tezina==2&&odabir.equals("n"))){
						random = Math.random();
						if(random<0.34) x = 1;
						else if (random>0.67) x = 2;
						else x = 3;
							kov = kov -x;
							System.out.println("Racunalo vuce potez i ostaje ti: "+kov+" kovanica");
							zadnji  ="r";
				}
				else{
					y = 4-x;
					kov  = kov-y;
					System.out.println("Racunalo vuce potez i ostaje ti: "+kov+" kovanica");
					zadnji = "r";
				}
			}
			if (kov<2&&zadnji.equals("r")) System.out.println("Zalim, izgubili ste!");
		}
	}
}
