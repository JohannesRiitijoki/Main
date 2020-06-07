import java.text.DecimalFormat;
import java.util.Scanner;

public class Puoluetuki {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat des = new DecimalFormat("0");
	double puolueTuki=148175.0;
	int lkm=0;
	double  loppuTulema=0.0;
	System.out.print("Anna kansanedustajien lukumäärä: ");
	lkm = input.nextInt();
	loppuTulema = puolueTuki*lkm;
	System.out.println("Puoluetuen määrä on " + des.format(loppuTulema) + " euroa");
	input.close();
	}
}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Cooper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0");
		int kierrokset=400;
		int matka=0;
		double  loppuTulema=0.0;
		System.out.print("Anna juostu matka: ");
		matka = input.nextInt();
		loppuTulema = matka/kierrokset;
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + des.format(Math.floor(loppuTulema)));
		input.close();
	}
}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double leveys=0.0;
		double pituus=7353.0;
		double korkeus=0.68/100;
		double litraa=140;
		
		
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		leveys = input.nextDouble();
		pituus = input.nextDouble();
		korkeus = input.nextDouble();
		
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		litraa=input.nextDouble();
		
		System.out.println("Maalin tarve on " + des.format(((leveys + leveys + pituus + pituus) * korkeus / litraa)) + " litraa");
		input.close();
	}
}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0");
		int aikuistenMaara=0;
		double lasilliset=7.0;
		double pullojenTarve=0;
		double lukema=(1.0/lasilliset);
		double pullot1=0;
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		aikuistenMaara=input.nextInt();
		pullojenTarve=(aikuistenMaara/lasilliset);
		pullot1=((Math.ceil(pullojenTarve)*lasilliset)-(pullojenTarve*lasilliset));
		System.out.println("Pulloja tarvitaan "+des.format(Math.ceil(pullojenTarve))+" kappaletta");
		System.out.println("Viimeisestä pullosta jää "+des.format(pullot1)+" lasia");
		
		input.close();
		
	}

}





import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tunnit=0;
		System.out.print("Anna tunnit: ");
		tunnit=input.nextInt();
		
		if(tunnit>=7 && tunnit<10) {
			System.out.println("Hyvää huomenta!");
		}else if(tunnit>=10 && tunnit<17){
			System.out.println("Hyvää päivää!");
		}else if(tunnit>=17 && tunnit<22){
			System.out.println("Hyvää iltaa!");
		}else if(tunnit>=22 && tunnit<24 || tunnit>=0 && tunnit<7){
			System.out.println("Hyvää yötä!");
		}
	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int palkka=0;
		double veroProsentti=0;
		int ika=0;
		double bruttoPalkka=0;
		double veronOsuus=0;
		double netto=0;
		double tyelMaksuProsentti=0;
		double tyelMaksu=0;
		double tyottomyysVakuutusMaksu=0;
		
		System.out.print("Anna palkka: ");
		palkka=input.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroProsentti=input.nextDouble();
		
		System.out.print("Anna ikä: ");
		ika=input.nextInt();
		
		veronOsuus=palkka*(veroProsentti/100);
		if(ika>=53 && ika<=62){
			tyelMaksuProsentti = 0.0825;
		}else{
			tyelMaksuProsentti = 0.0675;
		}
		tyelMaksu=tyelMaksuProsentti*palkka;
		tyottomyysVakuutusMaksu=palkka*0.015;
		netto=palkka-veronOsuus-tyelMaksu-tyottomyysVakuutusMaksu;
		
		System.out.println("Bruttopalkka "+palkka);
		System.out.println("Veron osuus "+des.format(veronOsuus));
		System.out.println("Työeläkevakuutusmaksun osuus "+des.format(tyelMaksu));
		System.out.println("Työttömyysvakuutuksen osuus "+des.format(tyottomyysVakuutusMaksu));
		System.out.println("Käteen jää "+des.format(netto));

	}
}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0");
		int tyyppi=0;
		double hinta=0;
		int paastoMittaus=0;
		int autonTyyppi=0;
		
		
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		tyyppi=input.nextInt();
		if(tyyppi==1) {
			hinta=hinta+50;
			System.out.println("Mitataanko päästöt 0=ei, 1=kyllä: ");
			paastoMittaus=input.nextInt();
			if(paastoMittaus==1) {
				System.out.println("Onko auto 0=bensa, 1=diesel: ");
				autonTyyppi=input.nextInt();
				if(autonTyyppi==0){
					hinta=hinta+22;
				}else if(autonTyyppi==1){
					hinta=hinta+31;
				}
			}else if(paastoMittaus==0){
				
			}
		}else if(tyyppi==2) {
		hinta=hinta+30;
		}
		
		
		System.out.println("Hinta on "+des.format(hinta));
		
		
		
		
		
	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int nopeus=0;
		double sakonMaara=0;
		double nettoTulot=0;
		int autonnopeus=0;
		
		
		System.out.print("Anna nopeutesi: ");
		nopeus=input.nextInt();
		if(nopeus>80&&nopeus<=100) {
			System.out.println("Rikesakko");
		}else if(nopeus>100) {
			System.out.println("Päiväsakko");
			System.out.print("Anna nettokuukausitulosi: ");
			nettoTulot=input.nextDouble();
			sakonMaara=(nettoTulot-255)/60;
			if(sakonMaara<6) {
				sakonMaara=6;
			}
			System.out.println("Päiväsakon määrä on "+des.format(sakonMaara)+" euroa");
			
		}else {
		System.out.println("Ei sakkoja");	
		}
		
	}

}




import java.text.DecimalFormat;
import java.util.Scanner;


public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int kilometrit=0;
		int tulos=0;
		double loppuTulos=0.0;
		boolean nolla = false;
		
		do{
		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		kilometrit=input.nextInt();
		
		if(kilometrit!=0){
			tulos=tulos+kilometrit;
		}else{
			nolla=true;
		}
		
		}while(nolla==false); //nolla laitettu
		loppuTulos = tulos*0.43;
		System.out.println("Yhteensä " + tulos + " Kilometriä");
		System.out.println("Korvaus on  " + des.format(loppuTulos) + " euroa");
		input.close();

	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double korvaus=0;
		double tulos=0;
		double loppuTulos=0.0;
		boolean nolla = false;
		
		do{
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		korvaus=input.nextDouble();
		
		if(korvaus!=0){
			tulos=tulos+korvaus;
		}else{
			nolla=true;
		}
		
		}while(nolla==false); //nolla laitettu
		loppuTulos = tulos*0.5-100;
		if(loppuTulos>2400) {
			loppuTulos=2400;
		}else if(loppuTulos<100){
			loppuTulos=0;
		}
		System.out.println("Kotitalousvähennyksen määrä on " + des.format(loppuTulos) + " euroa");
		input.close();

	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int lkm=0;
		int laskuri=0;
		int opintoPisteet=0;
		int opintoPisteetYht=0;
		int pitaisiOlla=0;
		int lukuKausi=210;
		System.out.print("Anna lukukausien määrä: ");
		lkm = input.nextInt();
		int puuttuu=0;
		
		
		while (laskuri < lkm){
			laskuri++;
			System.out.print("Anna "+laskuri+". lukukauden opintopisteesi: ");
			opintoPisteet = input.nextInt();
			opintoPisteetYht = opintoPisteetYht+opintoPisteet;
		}
		
		pitaisiOlla=lkm*30;
		System.out.println("Sinulla pitäisi olla tähän mennessä "+des.format(pitaisiOlla)+" opintopistettä.");
		System.out.println("Sinulla on "+des.format(opintoPisteetYht)+" opintopistettä.");
		if(opintoPisteetYht<pitaisiOlla) {
			System.out.println("Olet jäljessä tavoitteesta.");
		}else if(opintoPisteetYht>pitaisiOlla){
			System.out.println("Olet edellä tavoitteesta.");
		}
		puuttuu=lukuKausi-opintoPisteetYht;
		System.out.println("Tutkinnosta puuttuu vielä "+des.format(puuttuu)+" opintopistettä.");

	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int korvaus=0;
		int tulos=0;
		boolean nolla = false;
		
		do{
		System.out.print("Paljonko painat: ");
		korvaus=input.nextInt();
		tulos=tulos+korvaus;
		
		if(tulos<240 && korvaus!=0){
			System.out.println("Tule kyytiin.");
		}
		
		}while(tulos<240 && korvaus!=0); //yli 240 tai 0
		if(korvaus==0) {
			
		}else {
		System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
		}
		input.close();
	}

}





import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sananlasku;
		int lkm = 0;
		int lkm2 = 0;
		do {
			System.out.print("Anna nimi: ");
			sananlasku = input.nextLine();
			sananlasku=sananlasku.toLowerCase();
			if(sananlasku.equalsIgnoreCase("lumi")) {
			lkm++;
			
			}
			lkm2++;
		} while (!sananlasku.equals("loppu"));
		lkm2=lkm2-1;
		System.out.println("Nimiä oli " +lkm2+ " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " +lkm+" kertaa.");
		input.close();
	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		String etunimi="";
		String sukunimi="";
		double katuosoite=0.0;
		String postinumerojapostitoimipaikka="";
		
		System.out.print("Annan tuotenumero: ");
		etunimi = input.nextLine();
		etunimi = etunimi.trim();
		
		System.out.print("Anna tuotteen nimi: ");
		sukunimi = input.nextLine();
		sukunimi = sukunimi.trim().toUpperCase();
		
		System.out.print("Anna tuotteen hinta: ");
		katuosoite = input.nextDouble();
		
		System.out.print("Anna tuotteen kuvaus: ");
		postinumerojapostitoimipaikka = input.next().trim();
		
		System.out.println("Numero: "+etunimi);
		System.out.println("Nimi: "+sukunimi);
		System.out.println("Hinta: "+des.format(katuosoite));
		if(postinumerojapostitoimipaikka.length()>0) {
		System.out.println("Kuvaus: "+postinumerojapostitoimipaikka);
		input.close();
		}

	}

}




import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String lento;
		int numero;
		
		
		System.out.print("Anna lennon numero: ");
		lento=input.nextLine();
		if(lento.startsWith("AY")) {
			lento=lento.substring(2,3);
			numero = Integer.parseInt(lento);
			if(numero==1) {
				System.out.println("Kaukolento");
			}else if(numero<=6 && numero>=2){
				System.out.println("Kotimaan lento");
			}else if(numero==7) {
				System.out.println("Venäjän lento");
			}
		
		}else {
			System.out.println("Ei ole Finnairin lento");
		}
		
		/*
		Esimerkki ohjelmasta
		Anna lennon numero: AY105
		Kaukolento
		Toinen esimerkki ohjelmasta
		Anna lennon numero: AY289
		Kotimaan lento
		Kolmas esimerkki ohjelmasta
		Anna lennon numero: AY701
		Venäjän lento
		Neljäs esimerkki ohjelmasta
		Anna lennon numero: QR3018
		Ei ole Finnairin lento
		 */

	}

}






import java.util.Scanner;

public class Rekisteritunnus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pituus;
		String mitattava1;
		String mitattava2;
		boolean onko;
		boolean onko2;
		System.out.print("Anna rekisterinumero: ");
		mitattava1=input.nextLine();
		
		onko=Character.isLetter(mitattava1.charAt(0));
		pituus=mitattava1.length();
		if(pituus<=7) {
			if(onko=true) {
				onko=Character.isLetter(mitattava1.charAt(1));
				if(onko=true) {
					onko=Character.isLetter(mitattava1.charAt(2));
					if(onko=true) {
						onko=Character.isDigit(mitattava1.charAt(4));
						mitattava2=mitattava1.substring(4,5);
						//onko2=mitattava2.equals("0")
						if(onko=true && mitattava2.equals("0")!=true) {
							onko=Character.isDigit(mitattava1.charAt(5));
								if(onko=true) {
									onko=Character.isDigit(mitattava1.charAt(6));
									if(onko=true) {
										System.out.println("Rekisterinumero on kelvollinen");
									}else {
										System.out.println("Rekisterinumero ei ole kelvollinen");
									}
								}else {
									System.out.println("Rekisterinumero ei ole kelvollinen");
								}
						}else {
							System.out.println("Rekisterinumero ei ole kelvollinen");
						}
					}else {
						System.out.println("Rekisterinumero ei ole kelvollinen");
					}
				}else {
					System.out.println("Rekisterinumero ei ole kelvollinen");
				}
			}else {
				System.out.println("Rekisterinumero ei ole kelvollinen");
			}
		}else {
			System.out.println("Rekisterinumero ei ole kelvollinen");
		}
		
		/*
		Tee ohjelma Rekisteritunnus, joka kertoo, onko auton rekisteritunnus kelvollinen.
		Rekisteritunnus alkaa 2-3 kirjaimella, mitä seuraa viiva ja lopussa on 1-3 numeroa. Ensimmäinen
		numero ei voi olla nolla.
		Esimerkki ohjelmasta
		Anna rekisterinumero: abc-123
		Rekisterinumero on kelvollinen
		Toinen esimerkki ohjelmasta
		Anna rekisterinumero: abc-012
		Rekisterinumero ei ole kelvollinen
		 */

	}

}



import java.util.Scanner;

public class Dominion {
	private Scanner input = new Scanner(System.in);
	public int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		int kirouskortinarvo=-1;
		int tilakortinarvo=1;
		int pitajakortinarvo=3;
		int laanikortinarvo=8;
		int tulos=0;
		
		tulos=kirouskortinarvo*kirous+tilakortinarvo*tila+pitaja*pitajakortinarvo+laani*laanikortinarvo;
		return tulos;
	}
	public void kirjoittaja(String teksti) {
		System.out.println(teksti);
	}
	public int kysyLkm(String teksti) {
		int vastauslauseke=0;
		System.out.print(teksti);
		vastauslauseke=Integer.parseInt(input.nextLine());
		return vastauslauseke;
	}
	public static void main(String[] args) {
		Dominion ohjelma = new Dominion();
		int kirous=0;
		int tila=0;
		int pitaja=0;
		int laani=0;
		int tulos=0;
		kirous = ohjelma.kysyLkm("Anna kirouskorttien määrä: ");
		tila = ohjelma.kysyLkm("Anna tilakorttien määrä: ");
		pitaja = ohjelma.kysyLkm("Anna pitäjäkorttien määrä: ");
		laani = ohjelma.kysyLkm("Anna läänikorttien määrä: ");
		tulos = ohjelma.laskePisteet(kirous, tila, pitaja, laani);
		ohjelma.kirjoittaja("Pisteiden yhteismäärä on "+tulos);
	}

}



import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {

	 
	
	public static double laskeVero(double arvo) {
		if(arvo<5000) {
			arvo=0.0;
		}else if(arvo>=5000 && arvo<=25000) {
			arvo=((arvo-5000)*0.08+100);
		}else if(arvo>=25000 && arvo<=55000) {
			arvo=((arvo-25000)*0.1+1700);
		}else if(arvo>=55000 && arvo<=200000) {
			arvo=((arvo-55000)*0.12+4700);
		}else if(arvo>=200000 && arvo<=1000000) {
			arvo=((arvo-200000)*0.15+22100);
		}else if(arvo>1000000) {
			arvo=((arvo-1000000)*0.17+142100);
		}
		return arvo;
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat des = new DecimalFormat("0.00");
	double maara = 0.0;
	double lopputulos=0;
	System.out.print("Anna lahjan suuruus: ");
	maara=input.nextDouble();
	lopputulos=laskeVero(maara);
	System.out.println("Lahjavero on "+des.format(lopputulos)+" euroa");
	input.close();
	}

}






import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
    private Scanner input = new Scanner(System.in);
    DecimalFormat des = new DecimalFormat("0.00");  
    public Kulutus(){
        int km=kysyKilometrit();        
        double litrat=kysyTankkaus();        
        double kulutus = laskeKulutus(km,litrat);
        naytaKulutus(kulutus);
    }
    
    public int kysyKilometrit(){
        System.out.print("Anna ajetut kilometrit: ");
        return input.nextInt();
    }
    
    public double kysyTankkaus(){
        System.out.print("Anna tankattu määrä: ");
        return input.nextDouble();
    }
    
    public double laskeKulutus(int kilometrit, double tankattu){
        return tankattu / kilometrit * 100;
    }
    
    public void naytaKulutus(double kulutus){      
        System.out.println("Kulutus/100km on "+des.format(kulutus)+" litraa");
    }
    
    public static void main(String[] args) {
        new Kulutus();
    }

}







import java.util.Scanner;

public class Tunnus {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String etunimi="";
	String sukunimi="";
	String yhdistelma="";
	System.out.print("Anna sukunimi: ");
	sukunimi=input.nextLine();
	System.out.print("Anna etunimi: ");
	etunimi=input.nextLine();
	yhdistelma = teeTunnus(etunimi,sukunimi);
	System.out.println("Tunnus on "+yhdistelma.toLowerCase());
	}
	static String teeTunnus(String etu, String suku) {
		etu=etu.substring(0,3);
		suku=suku.substring(0,3);
		return suku+etu;
	}
	
	
}






import java.util.Scanner;

public class Kellonaika {
	static Scanner input = new Scanner(System.in);
	static String kysyKellonaika() {
		String vastaus;
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		vastaus=input.nextLine();
		return vastaus;
	}
	static boolean tarkastaKellonaika(String kellonaika) {
		boolean onko;
		 if (kellonaika.matches("(^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$)")) {
			  onko=true;
		  }else {
			  onko=false;
		  }
		 return onko;
	}
	public static void main(String[] args) {
		String vastaus;
		vastaus=kysyKellonaika();
		boolean onko=false;
		onko=tarkastaKellonaika(vastaus);
		if (onko==true) {
			System.out.println("Kellonaika on oikein");
		}else {
			System.out.println("Kellonaika on väärin");
		}
		

	}

}






import java.text.DecimalFormat;

public class Sademaara {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		double lkm=0.0;
		double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};
		for (int i = 0; i < sademaarat.length; i++) {
		lkm=lkm+sademaarat[i];
		}
		System.out.println("Vuoden sademäärä on "+des.format(lkm)+" mm");
	}

}





import java.util.Arrays;

import java.util.Scanner;


public class Lampotilat {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lkm2=100;
		int nimi;
		int[] nimet = new int[lkm2];
		int lkm = 0;
		
		do{
			System.out.print("Anna lämpötila: ");
			nimi = input.nextInt();
			
				if(nimi==-999){
					break;
				}else{
					nimet[lkm] = nimi;
					lkm++;
				}
		}while (lkm <= lkm2 && -999!=nimi);
				
				int[] nimet2 = new int[lkm];
				for (int i = 0; i < lkm; i++) {
					nimet2[i]=nimet[i];	
			}
		Arrays.sort(nimet2);
		System.out.print("Annoit lämpötilat: ");
		for (int i = 0; i < lkm; i++) {
		System.out.print(nimet2[i] + " ");
		}
		input.close();
		}

}




import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Sahkolasku {

	public static void main(String[] args) {
		double hinta;
		double yhteensa;
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna kilowatin hinta euroina: ");
		hinta=input.nextDouble();
		int[] sahkot = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("Anna kuukauden "+(i+1)+" sähkölukema: ");
			sahkot[i]=input.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+". kuukauden kulutus: "+sahkot[i]+"kwh "+des.format(sahkot[i]*hinta)+" euroa");
		}
	}
	

}



public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		int nopeus;
		int pituus;
		String[] osanen= new String[2];
		String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85",
		"CCC-111;83"};
		pituus=peltipoliisi.length;
		for (int i = 0; i < pituus; i++) {
			osanen=peltipoliisi[i].split(";",2);
			nopeus = Integer.parseInt(osanen[1]);
			if(nopeus>=84) {
				System.out.println(osanen[0]+" "+osanen[1]);
			}
		}

	}

}






import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lukema=0;
		int lkm2=20;
		String suurennos;
		String yhdistys;
		String nimi="";
		String[] nimet = new String[lkm2];
		
		
		int lkm = 0;
		
		
		do{
			System.out.print("Anna rekisterinumero: ");
			nimi = input.nextLine();
			if(lkm==20){
				System.out.println("Ei enää rekisterinumeroita!");
				break;
			}
			else if("-".equals(nimi) == true){
				break;
			}
			else {
				nimi = nimi.trim();
				suurennos = nimi.substring(0,3).toUpperCase();
				yhdistys = nimi.substring(3).toUpperCase();
				nimi=(suurennos+yhdistys);
				nimet[lkm] = nimi;
				lkm++;
			}
			
			}while ("-".equals(nimi) != true);			
		for (int i = 0; i < lkm; i++) {
		System.out.println(nimet[i] + " ");
		}
		
}
}




import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String annettu=input.next();
		LocalDate pvm = LocalDate.parse(annettu);
		pvm=pvm.plusDays(14);
		System.out.println("Eräpäivä on "+pvm);
	}

}




import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String nimi = (input.nextLine());
		System.out.print("Anna isbn: ");
		String isbn = (input.nextLine());
		System.out.print("Anna hinta: ");
		double hinta = (Double.parseDouble(input.nextLine().replace(",", ".")));
		System.out.print("Anna julkaisuvuosi: ");
		int jvuosi = (input.nextInt());
		Kirja kirja = new Kirja(nimi, isbn, hinta, jvuosi);
		System.out.println();
		System.out.println(kirja.toString());
		Kirja kirja1=null;
		kirja1=new Kirja();
		kirja1.setHinta(hinta);
		kirja1.setIsbn(isbn);
		kirja1.setJulkaisuvuosi(jvuosi);
		kirja1.setNimi(nimi);
		System.out.println();
		System.out.println("Nimi: "+kirja1.getNimi());
		System.out.println("Isbn: "+kirja1.getIsbn());
		System.out.println("Hinta: "+des.format(kirja1.getHinta()));
		System.out.println("Julkaisuvuosi: "+kirja1.getJulkaisuvuosi());
		input.close();
		}

}

class Kirja {
private String nimi, isbn;
private double hinta;
private int julkaisuvuosi;

public Kirja() { // New Auto (Parametriton konstruktori)
	
}

public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi) {
this.nimi = nimi;
this.isbn = isbn;
this.hinta = hinta;
this.julkaisuvuosi = julkaisuvuosi;
}

public String getNimi() {
return nimi;
}

public void setNimi(String nimi) {
this.nimi = nimi;
}

public String getIsbn() {
return isbn;
}

public void setIsbn(String isbn) {
this.isbn = isbn;
}

public double getHinta() {
return hinta;
}

public void setHinta(double hinta) {
this.hinta = hinta;
}

public int getJulkaisuvuosi() {
	return julkaisuvuosi;
}

public void setJulkaisuvuosi(int julkaisuvuosi) {
	this.julkaisuvuosi = julkaisuvuosi;
}

@Override
public String toString() {
	return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", vuosi=" + julkaisuvuosi + "]";
}





}





package Tentti;

public class Henkilo {
	private String nimi;
	private String osoite;
	private Henkilo aiti;
	private Henkilo isa;

	public Henkilo(String nimi, String osoite, Henkilo aiti, Henkilo isa) {
		super();
		this.nimi = nimi;
		this.osoite = osoite;
		this.aiti = aiti;
		this.isa = isa;
	}

	public Henkilo getAiti() {
		return aiti;
	}

	public void setAiti(Henkilo aiti) {
		this.aiti = aiti;
	}

	public Henkilo getIsa() {
		return isa;
	}

	public void setIsa(Henkilo isa) {
		this.isa = isa;
	}

	public Henkilo() {
		nimi = "";
		osoite = "";
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}


	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}


	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + "]";
	}

}


package Tentti; // Muuta tätä

import java.util.Scanner;

public class PerheOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna isän nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna isän osoite: ");
		String osoite = input.nextLine();	
		Henkilo isa = new Henkilo(nimi,osoite);
		System.out.print("Anna äidin nimi: ");
		nimi = input.nextLine();
		System.out.print("Anna äidin osoite: ");
		osoite = input.nextLine();	
		Henkilo aiti = new Henkilo(nimi,osoite);
		System.out.print("Anna lapsen nimi: ");
		nimi = input.nextLine();
		System.out.print("Anna lapsen osoite: ");
		osoite = input.nextLine();	
		Henkilo lapsi = new Henkilo(nimi,osoite,aiti,isa);
		System.out.println("Lapsen isä on "+lapsi.getIsa().getNimi()+" ja äiti on "+lapsi.getAiti().getNimi());
		if(lapsi.getIsa().getOsoite().equals(lapsi.getOsoite()) && lapsi.getAiti().getOsoite().equals(lapsi.getOsoite())) {
			System.out.println("Perhe asuu samassa osoitteessa");
		}else if(lapsi.getIsa().getOsoite().equals(lapsi.getOsoite())) {
			System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
		}else if(lapsi.getAiti().getOsoite().equals(lapsi.getOsoite())){
			System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
		}
	}

}


package Tentti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Osallistumismaksu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		String osallistujakatsoja="";
		double maksu=0.0;
		int ika=0;
		String nuoretaikuiset="";
		
		System.out.print("Osallistuja (OS) / Katsoja (KA): ");
		osallistujakatsoja=input.next();
		
		if(osallistujakatsoja.equals("OS")) {
			System.out.println("Nuoret (NU) / Aikuiset (AI): ");
			nuoretaikuiset=input.next();
			if (nuoretaikuiset.equals("NU")) {
				maksu=10;
			}else if(nuoretaikuiset.equals("AI")) {
				maksu=20;
			}
		}else if(osallistujakatsoja.equals("KA")) {
			System.out.println("Ikä: ");
			ika=input.nextInt();
			if(ika>=18) {
				maksu=12.50;
			}else {
				maksu=8;
			}
		}
		System.out.println("Maksu on "+des.format(maksu)+" euroa");
	}

}




package Tentti;

public class Tankkaus {
	private String paiva;
	private double maara, litrahinta;
	
	public Tankkaus(String paiva, double maara, double litrahinta) {
		this.paiva = paiva;
		this.maara = maara;
		this.litrahinta = litrahinta;
	}
	
	
	public Tankkaus() {
		
	}


	public String getPaiva() {
		return paiva;
	}


	public void setPaiva(String paiva) {
		this.paiva = paiva;
	}


	public double getMaara() {
		return maara;
	}


	public void setMaara(double maara) {
		this.maara = maara;
	}


	public double getLitrahinta() {
		return litrahinta;
	}


	public void setLitrahinta(double litrahinta) {
		this.litrahinta = litrahinta;
	}


	public String toString() {
		return "Tankkaus [paiva=" + paiva + ", maara=" + maara + ", litrahinta=" + litrahinta + "]";
	}
	
	public double laskeTankkaus(double maara, double litrahinta) {
		double maksettu=maara*litrahinta;
		return maksettu;
	}
	
	
}



package Tentti;

import java.text.DecimalFormat;
import java.util.Scanner;

import palautettavat5.Kirja;

public class TankkausOhjelma {

	public static void main(String[] args) {
		DecimalFormat des = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Anna päivämäärä: ");
		String paiva=input.next();
		System.out.print("Anna tankattu määrä: ");
		double maara=input.nextDouble();
		System.out.print("Anna litrahinta: ");
		double litrahinta=input.nextDouble();
		Tankkaus tankkaus= new Tankkaus(paiva, maara, litrahinta);
		double maksunmaara=tankkaus.laskeTankkaus(tankkaus.getMaara(), tankkaus.getLitrahinta());
		System.out.println("Päivä: "+tankkaus.getPaiva());
		System.out.println("Maksettu: "+des.format(maksunmaara));
	}

}





package Tentti;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lista.Henkilo;

public class TankkausSovellus {

	ArrayList<Tankkaus> tankkausLista = new ArrayList<Tankkaus>();

	private void lisaaTankkaus() {
		DecimalFormat des = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Anna päivämäärä: ");
		String paiva=input.next();
		System.out.print("Anna tankattu määrä: ");
		double maara=input.nextDouble();
		System.out.print("Anna litrahinta: ");
		double litrahinta=input.nextDouble();
		Tankkaus tankkaus= new Tankkaus(paiva, maara, litrahinta);
		double maksunmaara=tankkaus.laskeTankkaus(tankkaus.getMaara(), tankkaus.getLitrahinta());
		tankkausLista.add(tankkaus);
	}

	private void naytaKaikkiTankkaukset() {
		DecimalFormat des = new DecimalFormat("0.00");
		// Käydään koko lista läpi
				for (int i = 0; i < tankkausLista.size(); i++) {
					Tankkaus tankkaus = tankkausLista.get(i);
					System.out.println("\nPäivä: " + tankkaus.getPaiva());
					System.out.println("Maksettu: " + des.format(tankkaus.getLitrahinta()*tankkaus.getMaara()));
				}
	}

	private void naytaTilasto() {
		DecimalFormat des = new DecimalFormat("0.00");
		double yhteensa=0.0;
		double keskiarvo=0.0;
		int kerrat=0;
		double alin=99999999.9;
		double ylin=0.0;
		// Käydään koko lista läpi
				for (int i = 0; i < tankkausLista.size(); i++) {
					Tankkaus tankkaus = tankkausLista.get(i);
					yhteensa=tankkaus.getMaara()+yhteensa;
					kerrat++;
					if(tankkaus.getMaara()>ylin) {
						ylin=tankkaus.getMaara();
					}
					if(tankkaus.getMaara()<alin) {
						alin=tankkaus.getMaara();
					}
					
				}
		keskiarvo=yhteensa/kerrat;
		System.out.println("Keskitankkaus: "+des.format(keskiarvo));
		System.out.println("Minimitankkaus: "+des.format(alin));
		System.out.println("Maksimitankkaus: "+des.format(ylin));
		
	}

	public static void main(String[] args) {
		TankkausSovellus ohjelma = new TankkausSovellus();
		Scanner input = new Scanner(System.in);
		int valinta = -1;
		do {
			System.out.println("\n1 = Lisää tankkaus");
			System.out.println("2 = Näytä kaikki tankkaukset");
			System.out.println("3 = Tilasto");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaTankkaus();
				break;

			case 2:
				ohjelma.naytaKaikkiTankkaukset();
				break;

			case 3:
				ohjelma.naytaTilasto();
				break;

			}

		} while (valinta != 0);

	}

}







