#include <iostream>
using namespace std;

int main()
{
  int luku;

  cout << "Anna kokonaisluku:";
  cin >> luku;
  cout << "Luku oli: " << luku << endl;
}



#include <iostream>
using namespace std; 
int main()
{
  cout << "Terve vaan kaikille!" << endl;
}




#include <iostream>
using namespace std;
int main()
{
	int luku1;
  	int luku2;
	int luvun_summa;
  

	cout << "Anna ensimmäinen luku: ";
	cin >> luku1;
  
  	cout << "Anna toinen luku: ";
	cin >> luku2;

	luvun_summa = luku1 + luku2;
	cout << "Antamiesi lukujen summa on " << luvun_summa;
}





#include <iostream>
using namespace std;

int main()
{
	float luku;
	float markat_euroina;

	cout << "Syötä jokin markkamäärä: ";
	cin >> luku;
	markat_euroina = luku / 5.94573;
	cout << "Markat euroina: " <<markat_euroina<< endl;
}





#include <iostream>
using namespace std;

int main()
{
	int sade;
	float ympyran_sade;

	cout << "Anna ympyrän säde: ";
	cin >> sade;
	ympyran_sade = 3.142 * sade*sade;
	cout << "Ympyrän ala annetulla säteellä: " << ympyran_sade << endl;
}





#include <iostream>
using namespace std;

int main()
{
	int luku,luku2,summa,erotus,tulo,jakojaannos;

	cout << "Syötä ensimmäinen kokonaisluku:";
	cin >> luku;
  cout << "Syötä toinen kokonaisluku:";
  cin >> luku2;
  summa=luku+luku2;
  erotus=luku-luku2;
  tulo=luku*luku2;
  jakojaannos=luku%luku2;
  cout << luku << "+" << luku2 << "=" << summa << endl;
  cout << luku << "-" << luku2 << "=" << erotus << endl;
  cout << luku << "*" << luku2 << "=" << tulo << endl;
  cout << "Jakojäännös: " << jakojaannos;
}




#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int luku,luku2;
  double juuri,summa;

	cout << "Anna ensimmäinen kateetti:";
	cin >> luku;
  cout << "Anna toinen kateetti:";
  cin >> luku2;
  summa=(luku*luku)+(luku2*luku2);
  juuri=sqrt(summa);
  cout << "Hypotenuusan pituus: " << juuri;
}




#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	int luku1,jakojaannos;

	cout<<"Anna kokonaisluku:";
	scanf("%d", &luku1);

    jakojaannos=luku1%2;
    
    if(jakojaannos==0){
        cout<< "Luku"<< luku1 <<"on parillinen.";
    }else{
        cout<< "Luku"<< luku1 <<"on pariton.";
    }
}





#include <iostream>
using namespace std;

int main()
{
	int luku1;
  char sukupuoli;
  cout<<"Oletko mies vai nainen (m/n)";
  cin.get(sukupuoli);
	cout<<"Anna ikäsi:";
	cin>>luku1;
    
    if(luku1>0 && luku1<55 && sukupuoli=='m'){
        cout<< "Olet mies parhaassa iässä!";
    }else if(luku1>0 && luku1<55 && sukupuoli=='n'){
        cout<< "Olet neito kauneimmillaan!";
    }else if(luku1>55 && luku1<100 && sukupuoli=='m'){
      cout<< "Olet viisas mies!";
    }else if(luku1>55 && luku1<100 && sukupuoli=='n'){
      cout<< "Olet nuori ikäiseksesi!";
	}else{
		cout << "Ohjelmassa tapahtunut virhe!";
	}
}




#include <iostream>
using namespace std;

int main()
{
  int luku,luku2,summa,erotus,tulo,jakojaannos,etsittava_merkki,osamaara;
cout << "Käytössäsi on seuraavat laskutoimitukset:\n1: vähennyslasku\n2: yhteenlasku\n3: kertolasku\n4: osamäärä\n5: jakojäännös\nValitse laskutoimitus:";
  cin>>etsittava_merkki;
	cout << "Anna eka luku:";
	cin >> luku;
  cout << "Anna toinen luku:";
  cin >> luku2;
  summa=luku+luku2;
  erotus=luku-luku2;
  tulo=luku*luku2;
  jakojaannos=luku%luku2;
  osamaara=luku/luku2;

switch(etsittava_merkki)
{
   case 1:
   {
     cout << luku << "-" << luku2 << "=" << erotus << endl;
     break;
   }
   case 2:
   {
     cout << luku << "+" << luku2 << "=" << summa << endl;
     break;
   }case 3:
   {
     cout << luku << "*" << luku2 << "=" << tulo << endl;
     break;
   }case 4:
   {
     cout << luku << "/" << luku2 << "=" << osamaara << endl;
     break;
   }case 5:
   {
     cout << luku << "%" << luku2 << "=" << jakojaannos << endl;
     break;
   }
   default:
   {
     cout << "Nyt ei kyllä muuttujassa ollut mitään, ";
     cout << "mikä olisi kiinnostanut meitä. ";
   }
}
}




#include <iostream>
using namespace std;

int main()
{
  	int luku, i;
	
	  cout<<"Anna kokonaisluku:";
	  cin >> luku;

	
	  for(i = 1; i <= luku; ++i) { 
		cout << i << endl;
	}
}






#include <iostream>
using namespace std;

int main()
{
  	int luku, i,kertoma=1;
	
	  cout<<"Anna kokonaisluku:";
	  cin >> luku;

	
	  for(i = 1; i <= luku; ++i) { 
		kertoma=kertoma*i;
	}
  cout<<"luvun "<<luku<<" kertoma on "<<kertoma;
}




#include <iostream>
using namespace std;

int main()
{
  int arvosana,maara=0;
	double keskiarvo,summa;
	cout<<"Ohjelma laskee koearvosanojen keskiarvon.\nLukujen syöttämisen lopetus negatiivisella luvulla.\n";
	
    do{
        cout<<"Anna arvosana (4-10)";
        cin>>arvosana;
        if(arvosana>=0){
            maara=maara+1;
            summa=summa+arvosana;
        }
    }while(arvosana>=0);
    keskiarvo=summa/maara;
	cout<<"Ohjelmaan syötetty "<<maara<<" arvosanaa.\nArvosanojen keskiarvo:"<<keskiarvo;
}




#include <iostream>

using namespace std;

int suurin(int eka, int toka, int kolmas);
int pienin(int eka, int toka, int kolmas);

int main()
{
  int luku1, luku2, luku3, suurinLuku, pieninLuku;
  cout << "Syötä ensimmäinen kokonaisluku:";
  cin >> luku1;
  cout << "Syötä toinen kokonaisluku:";
  cin >> luku2;
  cout << "Syötä kolmas kokonaisluku:";
  cin >> luku3;
  suurinLuku = suurin(luku1, luku2, luku3);
  pieninLuku = pienin(luku1, luku2, luku3);
  cout << "Syöttämistäsi luvuista suurin oli " << suurinLuku;
  cout << " ja pienin " << pieninLuku << "." << endl;
}

int suurin(int luku1,int luku2,int luku3){
  int suurin;
  if((luku1>luku2)&&(luku1>luku3)){
      suurin=luku1;
  }else if((luku2>luku1)&&(luku2>luku3)){
    suurin=luku2;
  }else if((luku3>luku1)&&(luku3>luku2)){
    suurin=luku3;
  }
  return suurin;
}
int pienin(int luku1,int luku2,int luku3){
    int pienin;
    if((luku1<luku2)&&(luku1<luku3)){
      pienin=luku1;
  }else if((luku2<luku1)&&(luku2<luku3)){
    pienin=luku2;
  }else if((luku3<luku1)&&(luku3<luku2)){
    pienin=luku3;
  }
    return pienin;






#include <iostream>
using namespace std;
int suurin(int luku1,int luku2,int luku3);
int pienin(int luku1,int luku2,int luku3);
int main()
{
  int i,paivat;
  float summa,keskiarvo;
  cout<<"Ohjelma laskee yhteen haluamasi ajanjakson aikana\ntehdyt työtunnit sekä keskimääräisen työpäivän pituuden.";

  cout<<"\n\n\nKuinka monta päivää:";
  cin>>paivat;
  float luvut[paivat];
  

  for(i=1; paivat >= i; ++i){
    cout<<"Anna "<<i<<". päivän työtunnit: ";
    cin>>luvut[i-1];
  }

  for(i=0; (paivat-1) >= i; ++i){
 summa=luvut[i]+summa;
  }
  
  keskiarvo=summa/paivat;
  cout<<"\nTehdyt tunnit yhteensä: "<<summa;
  cout<<"\nKeskimääräinen työpäivän pituus: "<<keskiarvo;
  cout<<"\nSyötetyt tunnit:";
  for(i=0; (paivat-1) >= i; ++i){
    cout<<" "<<luvut[i];
  }
}




#include <iostream>
#include <fstream>

using namespace std;

void tulosta_matriisi(int matriisi[5][5]);
int laske_summa(int matriisi[5][5]);

int main(void)
{
  int matriisi[5][5];
  int summa;
  ifstream luku("matriisi.txt");
  if (!luku){
        cout << "Tiedoston avaaminen epäonnistui...";
  }
  else {
    for (int y=0; y<5;y++){
          for (int x=0;x<5;x++){
            luku >> matriisi[y][x];
          }
    }
    luku.close();
    cout << "Matriisi:" << endl;
    tulosta_matriisi(matriisi);
    summa = laske_summa(matriisi);
    cout << "Alkioiden summa: " << summa << endl;
  }
}


void tulosta_matriisi(int matriisi[5][5]){
  int i,j;
  for(i=0; i<=4; i++) {
    
    for(j=0; j<=4; j++) {
      cout<<matriisi[i][j]<<" ";
      if(j==4){
        cout<<"\n";
      }
    } 
  }
}
int laske_summa(int matriisi[5][5]){
  int yht=0,i,j,lukema;
  for(i=0; i<=4; i++) {
  
    for(j=0; j<=4; j++) {
      yht += matriisi[i][j];
   }
}
return yht;






#include <iostream>
#include <string>
using namespace std;

// sinun koodisi tulee tähän


int main()
{
  char merkkijono[50];
  cout << "Anna merkkijono, jonka tulostan:";
  cin.get(merkkijono, 50);
  Tulostusluokka tulostaja;
  tulostaja.Tulosta(merkkijono);
}
class Tulostusluokka
{
public:
void Tulosta(char merkkijono[]);
};

void Tulostusluokka::Tulosta(char merkkijono[])
{
  cout << merkkijono;
}






#include <iostream>
#include <string>
using namespace std;

// sinun koodisi tulee tähän

int main (void)
{   
   char merkkijono[] = "Anna merkkijono, jonka tulostan:";
   KysyJaTulosta olio;
   olio.TeeHommasi(merkkijono);
}
class KysyJaTulosta
{
public:
void TeeHommasi(char merkkijono[]);
};

void KysyJaTulosta::TeeHommasi(char merkkijono[])
{
  cout << merkkijono;
  cin.get(merkkijono, 50);
  cout << merkkijono;
}



#include <iostream>
using namespace std;

class Laskin
{
  public:

  int Summa(int eka, int toka);
};

int Laskin::Summa(int eka, int toka)
{
  int summa = eka + toka;
  return summa;
}

// sinun koodisi tulee tähän

int main()
{  
  Tulostaja olio;
  olio.Tulosta();
}
#include <iostream>
using namespace std;

class Laskin
{
  public:

  int Summa(int eka, int toka);
};

int Laskin::Summa(int eka, int toka)
{
  int summa = eka + toka;
  return summa;
}


class Tulostaja
{
public:
void Tulosta();
};

void Tulostaja::Tulosta()
{
  int luku1,luku2,summa;
  cout<<"Syötä ensimmäinen kokonaisluku:";
  cin>>luku1;
  cout<<"Syötä toinen kokonaisluku:";
  cin>>luku2;
  Laskin laskin;
  summa=laskin.Summa(luku1, luku2);
  cout<<"Lukujen summa: "<<summa;
}


