#include <stdio.h>
/* Tämä on hieno ohjelma*/

int main(void){
  int luku;
  printf("Anna luku:");
  scanf("%d", &luku);
  printf("Luku oli: %d\n",luku);
  return 0;
}



#include <stdio.h>

/* Tämä on hieno ohjelma, joka on kommentoitu */
int main()
{


	
	printf("Terve vaan kaikille!\n");

}




#include <stdio.h>

/* Tämä on hieno ohjelma, joka on kommentoitu */
int main()
{
	/* Esitellään muuttuja luku */
	int luku;

	/* Kysytään käyttäjältä luku */
	printf("Anna kokonaisluku: ");

	// yhden rivin kommentti
	scanf("%d", &luku);

	/* Tämä kommentti havainnollistaa
	usean rivin mittaista kommenttia.
	Nyt tulostetaan syötetty luku */
	printf("Antamasi luvun neliö on %d\n", luku*luku);

}



#include <stdio.h>
int
main ()
{
  float liukuluku;
    float markat_euroina;
  printf ("Syötä jokin markkamäärä: ");
  scanf ("%f", &liukuluku);


	markat_euroina= liukuluku / 5.94573;
  printf("Markat euroina: %.2f\n", markat_euroina);
  return 0;
}



#include <stdio.h>

int main()
{
	int kokonaisluku;
	float liukuluku;

	printf("Anna kokonaisluku: ");
	scanf("%d", &kokonaisluku);

	printf("Anna desimaaliluku: ");
	scanf("%f", &liukuluku);

	printf("\nSyöttämäsi kokonaisluku: %d\n",kokonaisluku);
	printf("Syöttämäsi desimaaliluku kahden desimaalin tarkkuudella: %.2f\n",liukuluku);
	return 0;
} 



#include <stdio.h>

int main()
{
	int luku1,luku2,summa,erotus,kerroin;

	printf("Anna eka luku: ");
	scanf("%d", &luku1);
	printf("Anna toka luku: ");
	scanf("%d", &luku2);
	

    summa=luku1+luku2;
    erotus=luku1-luku2;
    kerroin=luku1*luku2;

    printf("\n%d+%d=%d\n",luku1,luku2,summa);
    printf("%d-%d=%d\n",luku1,luku2,erotus);
    printf("%d*%d=%d",luku1,luku2,kerroin);


	return 0;
} 




#include <stdio.h>

int main()
{
	int luku1,jakojaannos;

	printf("Anna kokonaisluku: ");
	scanf("%d", &luku1);

    jakojaannos=luku1%2;

    printf("Luku on %d",jakojaannos);
	return 0;
} 





#include <stdio.h>

int main()
{
	int luku1,jakojaannos;

	printf("Anna kokonaisluku:");
	scanf("%d", &luku1);

    jakojaannos=luku1%2;
    
    if(jakojaannos==0){
        printf("Luku %d on parillinen.",luku1);
    }else{
        printf("Luku %d on pariton.",luku1);
    }

	return 0;
}







#include <stdio.h>
#include <ctype.h>

int main()
{
	char kirjain;
	int luku1;

	printf("juotko kahvia vai teetä (k/t)?");
	kirjain=getchar();
	getchar();
	kirjain = tolower(kirjain);
	printf("Montako kuppia juot päivässä:");
	scanf("%d", &luku1);
    
    if(kirjain=='k' && luku1 <=2){
        printf("Et taida juoda paljoa kahvia.");
    }else if(kirjain=='k' && (luku1 >=3 && luku1 <= 20)){
        printf("Juotpa paljon kahvia!");
    }else if(kirjain=='t' && luku1 <=2){
        printf("Et taida juoda paljoa teetä.");
    }else if(kirjain=='t' && (luku1 >=3 && luku1 <= 20)){
        printf("Juotpa paljon teetä!");
    }else{
        printf("Ohjelmassa tapahtunut virhe!");
    }

	return 0;
}






#include <stdio.h>

int main()
{
	int valitsin,luku1,luku2,vastaus; 

	printf("1: vähennyslasku\n2: yhteenlasku\n3: kertolasku\nValitse toiminto:");
	scanf("%d", &valitsin);
	printf("Anna eka luku:");
	scanf("%d", &luku1);
	printf("Anna toka luku:");
	scanf("%d", &luku2);


	switch(valitsin) { 
	case 1: 
		{ 
			vastaus=luku1-luku2;
			printf("%d-%d=%d",luku1,luku2,vastaus);
			break; 
		} 
	case 2: 
		{  
			vastaus=luku1+luku2;
			printf("%d+%d=%d",luku1,luku2,vastaus);
			break; 
		} 
	case 3: 
		{ 
			vastaus=luku1*luku2;
			printf("%d*%d=%d",luku1,luku2,vastaus); 
			break; 
		} 
	default: 
		printf("Antamasi syöte on arvoalueen ulkopuolella.\n"); 
                break;
	} 


	return 0;
}







#include <stdio.h> 
   
int main() 
{ 
	int luku, i;
	
	printf("Anna kokonaisluku:");
	scanf("%d", &luku);

	
	for(i = 1; i <= luku; ++i) { 
			printf("%d\n", i);
	}
	
	return 0; 
}





#include <stdio.h> 
   
int main() 
{ 
	int luku, i, kerroin=1;
	printf("Anna kokonaisluku:");
	scanf("%d", &luku);

	
	for(i = 1; i <= luku; ++i) {
			kerroin=kerroin*i;
	}
	printf("Luvun %d kertoma on %d",luku,kerroin);
	return 0; 
}





#include <stdio.h> 

int main() 
{ 
	int arvosana,maara=0;
	double keskiarvo,summa;
	printf("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\nLopetus negatiivisella kokonaisluvulla.\n");
	
    do{
        printf("Anna arvosana (4-10):");
        scanf("%d", &arvosana);
        if(arvosana>=0){
            maara=maara+1;
            summa=summa+arvosana;
        }
    }while(arvosana>=0);
    keskiarvo=summa/maara;
	printf("Ohjelmaan syötetty %d arvosanaa.\nArvosanojen keskiarvo: %.2f",maara,keskiarvo);
	
	
}






#include <stdio.h>

void kissa(void);
void koira(void);
void lehma(void);

int main(void)
{
  int valinta;
  do{

    printf("1:kissa\n2:koira\n3:lehmä\n");
    printf("Lopetus negatiivisella luvulla.\n");
    printf("Valitse eläin:");
    scanf("%d", &valinta);
    if(valinta < 0) {
      printf("Ohjelma lopetetaan...");
    }
    else if(valinta == 1) {
      kissa();
    }
    else if(valinta == 2) {
      koira();
    }
    else if(valinta == 3) {
      lehma();
    }
    else {
      printf("Antamasi luku ei kelpaa.\n\n");
    }
  }while(valinta>0);
  return 0;
}


void kissa(){ 
	printf("Kissa sanoo miau!");
	
}
void koira(){ 
	printf("Koira sanoo hau-hau!");
	
}
void lehma(){ 
	printf("Lehmä sanoo ammuu!");
	
  
  
  
  
  

#include <stdio.h>

void summa(int luku1, int luku2);
void erotus(int luku1, int luku2);
void tulo(int luku1, int luku2);

int main(void)
{
  int luku1;
  int luku2;
  int valinta;
  do{

    printf("1:kahden luvun summa\n2:kahden luvun erotus\n3:kahden luvun tulo\n");
    printf("<0: ohjelman lopetus\n");
    printf("Valitse laskutoimitus:");
    scanf("%d", &valinta);
    
    if(valinta < 0) {
      printf("Ohjelma lopetetaan...");
      break;
    }else if(valinta > 3 || valinta == 0){
        printf("Antamasi luku ei kelpaa.\n\n");
    }else{
        printf("Syötä ensimmäinen luku:");
        scanf("%d",&luku1);
        printf("Syötä toinen luku:");
        scanf("%d",&luku2);
        
        if(valinta == 1) {
          summa(luku1,luku2);
        }
        else if(valinta == 2) {
          erotus(luku1,luku2);
        }
        else if(valinta == 3) {
          tulo(luku1,luku2);
        }
        else {
          printf("Antamasi luku ei kelpaa.\n\n");
        }
    }
  }while(valinta>0);
  return 0;
}
void summa(int luku1, int luku2){ 
	printf("%d + %d = %d\n\n",luku1,luku2,luku1+luku2);
	
}
void erotus(int luku1, int luku2){ 
	printf("%d - %d = %d\n\n",luku1,luku2,luku1-luku2);
	
}
void tulo(int luku1, int luku2){ 
	printf("%d * %d = %d\n\n",luku1,luku2,luku1*luku2);
	
}




#include <stdio.h>
int suurin(int luku1,int luku2,int luku3);
int pienin(int luku1,int luku2,int luku3);
int main()
{
    int luku1,luku2,luku3,pieninluku,suurinluku;
    
    printf("Anna 1. luku:");
    scanf("%d",&luku1);
    printf("Anna 2. luku:");
    scanf("%d",&luku2);
    printf("Anna 3. luku:");
    scanf("%d",&luku3);
    
    suurinluku = suurin(luku1,luku2,luku3);
    pieninluku = pienin(luku1,luku2,luku3);
    
    printf("Syöttämistäsi luvuista suurin oli %d ja pienin %d.",suurinluku,pieninluku);
    
    return 0;
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
}






#include <stdio.h>
#include <math.h>
int main() {
  int i,paivat;
  float summa,keskiarvo;
  printf("Ohjelma laskee yhteen haluamasi ajanjakson aikana\ntehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");

  printf("\n\n\nKuinka monta päivää:");
  scanf("%d",&paivat);
  float luvut[paivat];
  

  for(i=1; paivat >= i; ++i){
    printf("Anna %d. päivän työtunnit: ",i);
    scanf("%f",&luvut[i-1]);
  }

  for(i=0; (paivat-1) >= i; ++i){
 summa=luvut[i]+summa;
  }
  
  keskiarvo=summa/paivat;
  printf("\nTehdyt työtunnit yhteensä: %.1f",summa);
  printf("\nKeskimääräinen työpäivän pituus: %.1f",keskiarvo);
  printf("\nSyötetyt tunnit: ");
  for(i=0; (paivat-1) >= i; ++i){
    printf("%.1f ",luvut[i]);
  }
  return 0;
}




#include <stdio.h>

int main(void) {
  int jakojaannos,yht,i,j,matriisi[5][5] =
{
4, 6, 25, 88, 5,
34, 5, 300, 4, 65,
78, 43, 11, 90, 125,
98, 585, 12, 63, 21,
45, 35, 9, 5, 1
};
printf("Taulukon:");
for(i=0; i<=4; i++) {
  printf("\n");
    for(j=0; j<=4; j++) {
      yht = yht + matriisi[i][j];
      printf("%d ",matriisi[i][j]);
      
   } 
}

printf("\n\n\nalkioiden summa on %d\n",yht);
  return 0;
}






#include <stdio.h> 
int main(void)  
{  
FILE *avaus = fopen("hello.usr", "w");  
fprintf(avaus, "Moi maailma!"); 
fclose(avaus);
printf("Tiedostoon kirjoittaminen onnistui.\n");
printf("Ohjelma suljetaan.");
return 0;  
}




#include <stdio.h> 
 
int main(void) 
{ 
FILE *tied_kahv; 
int luku1, luku2, luku3, luku4,summa; 
  if((tied_kahv = fopen("luvut.s", "r")) == NULL) { 
    printf("Tiedostoa ei löydetty!"); return 0; 
  } else { 
    fscanf(tied_kahv, "%d %d %d %d ", &luku1, &luku2, &luku3, &luku4);  
    fclose(tied_kahv); 
    summa = luku1+luku2+luku3+luku4;
    printf("Tiedostosta luvut.s löytyneet luvut:\n%d, %d, %d ja %d\n\nLukujen summa: %d", luku1, luku2, luku3, luku4,summa); 
} 
return 0; 
}






#include <stdio.h> 
    int main(void)  
    {  
      int matriisi[10][10];
      int matriisi2[10][10],matriisi3[10][10]; 
      int neliot[10][10]; 

      int x, y; 
 
FILE *luku_tied; 
FILE *kirj_tied; 

/*--------------------------------------------------------*/

     if((luku_tied = fopen("mata.txt", "r")) == NULL) { 
       printf("Tiedoston avaus epäonnistui (mata.txt)."); 
       return 0; 
     } 
     else { 
       for(y = 0; y < 10; y++) { 
         for(x = 0; x < 10; x++) {  
             fscanf(luku_tied, "%d", &matriisi[y][x]);  
         } 
      } 
     } 
 
    fclose(luku_tied); 

/*--------------------------------------------------------*/

     if((luku_tied = fopen("matb.txt", "r")) == NULL) { 
       printf("Tiedoston avaus epäonnistui (matb.txt)."); 
       return 0; 
     } 
     else { 
       for(y = 0; y < 10; y++) { 
         for(x = 0; x < 10; x++) {  
             fscanf(luku_tied, "%d", &matriisi2[y][x]);  
         } 
      } 
     } 
 
    fclose(luku_tied); 
 
/*--------------------------------------------------------*/

    for(y = 0; y < 10; y++) {  
      for(x = 0; x < 10; x++) {  
        neliot[y][x] = matriisi[y][x] + matriisi2[y][x]; 
      }  
    } 

/*--------------------------------------------------------*/
 
    if((kirj_tied = fopen("summa.usr" , "w")) == NULL) {  
      printf("Tiedoston avaus epäonnistui (summa.usr)."); 
    } 
    else {  
      for(y = 0; y < 10; y++) {  
        for(x = 0; x < 10; x++) {  
          if(x == 9) { 
            fprintf(kirj_tied, "%d\n", neliot[y][x]); 
          }  
          else {  
            fprintf(kirj_tied, "%d ", neliot[y][x]); 
          } 
        } 
      } 
    } 
    fclose(kirj_tied); 

    if((luku_tied = fopen("summa.usr", "r")) == NULL) { 
       printf("Tiedoston avaus epäonnistui (summa.usr)."); 
       return 0; 
     } 
     else { 
       for(y = 0; y < 10; y++) { 
         for(x = 0; x < 10; x++) {  
             fscanf(luku_tied, "%d", &matriisi3[y][x]);  
         } 
      } 
     } 
 
    fclose(luku_tied); 

   
   printf("Matriisien summa on laskettu tiedostoon summa.usr.\n");
   return 0; 
 }
 
 
 
 
 #include <stdio.h> 
  int main(void) {

  char etunimi[16], sukunimi[21],tiedostonimi[13];
  printf("Ohjelma tallentaa etunimesi ja sukunimesi tiedostoon.\n");
  printf("Syötä etunimesi:");
  scanf("%s", &etunimi);
  printf("Syötä sukunimesi:");
  scanf("%s", &sukunimi);
  printf("Tiedosto johon haluat tallentaa nimesi:");
  scanf("%s", &tiedostonimi);
   
  FILE *avaus = fopen(tiedostonimi, "w");
  fprintf(avaus, "%s %s",etunimi,sukunimi);
  fclose(avaus);
  printf("Tallennus onnistui!");
  return 0; 

 }
 
 
 
 
 
 #include <stdio.h> 
  int main(void) {

  char etunimi[15],kirjain;
  int vokaaleja=0,x;
  printf("Ohjelma laskee vokaalien määriä.\n");
  printf("Anna sana:");
  scanf("%s", etunimi);
  for(x=0;x<15;x++){
    if(etunimi[x]=='a' || etunimi[x]=='e' || etunimi[x]=='i' || etunimi[x]=='o' || etunimi[x]=='u' || etunimi[x]=='y'){
      vokaaleja=vokaaleja+1;
    }
  }
  printf("Sanassa vokaaleja: %d",vokaaleja);
  return 0; 

 }
