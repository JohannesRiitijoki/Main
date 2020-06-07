# -*- coding: cp1252 -*-

print("Moi maailma!")
print("Tämä on Python-ohjelma.")



muuttuja = "merkkijonosisältöä"
print("Muuttujaan muuttuja on tallennettu ",muuttuja,".",sep="")

muuttuja_1=1000
muuttuja2=24
print("Laskutoimituksen tulos on:",(muuttuja_1+muuttuja2+15)**2)

muuttuja1="Merkkijono"
muuttuja2=10.6411
muuttuja2=int(muuttuja2)

print("Kokonaislukumuunnos ei osaa pyöristää:",muuttuja2)
print("Merkkijonon kertominen tuottaa toistoa:",muuttuja1*2)

print("""Tämä on usean rivin tulostus:
Teksti on jaettu usealle riville.
Nimi:\tPetteri
Ammatti:\tKartturi""")

print("Laskin")
luku1=int(input("Anna ensimmäinen luku: "))
luku2=int(input("Anna toinen luku: "))
print("Tulos on:",luku1+luku2)

pitkasana="Hattukauppias"
leikkaus_1=pitkasana[:4]
leikkaus_2=pitkasana[-4::]
leikkaus_3 = pitkasana[::-1]
print("Muuttujan 4 ensimmäistä kirjainta ovat ",leikkaus_1,"\n","Muuttujan 4 viimeistä kirjainta ovat ",leikkaus_2,"\n","Muuttujan teksti on väärinpäin ",leikkaus_3,sep="")

num = int(input("Anna luku:"))
if (num % 2) == 0:
   print("Antamasi luku oli parillinen.")

nimi=input("Anna nimi: ")
if (nimi=="Erkki"):
    salasana=input("Anna salasana: ")
    if (salasana=="Esimerkki"):
        print("Salasana ja nimi oli oikein!")
    else:
        print("Salasana oli väärin.")
else:
    print("Nimi oli väärin.")


nimi=input("Valitse kohde (1-3): ")
if (nimi=="1"):
    print("Haukion kala Oy")
elif (nimi=="2"):
    print("Metallipaja VasaraAika")
elif (nimi=="3"):
    print("Balin palapelitehdas")


num = int(input("Anna luku: "))
num2 = int(input("Anna toinen luku: "))
if ((num % 2) == 0 or (num2 % 2) == 0) and ((num % 2) == 1 or (num2 % 2) == 1):
   print("Toinen luku on parillinen.")
elif (num % 2) == 0 and (num2 % 2) == 0:
    print("Molemmat luvut ovat parillisia.")
else:
    print("Molemmat luvut ovat parittomia.")
    
    
luku1=int(input("Anna ensimmäinen luku: "))
luku2=int(input("Anna toinen luku: "))

print("""(1) +
(2) -
(3) *
(4) /""")
valinta=input("Tee valinta (1-4): ")

if valinta=="2":
      print("Tulos on: ",luku1-luku2)
elif valinta=="1":
    print("Tulos on: ",luku1+luku2)
elif valinta=="3":
    print("Tulos on: ",luku1*luku2)
elif valinta=="4":
    print("Tulos on: ",luku1/luku2)
else:
	print("Valintaa ei tunnistettu.")
  
  
 
 kierroksia = 5
kierros = 0

#määritellään katkaisuehto;
#kun tehtyjen kierrosten määrä ylittää
#kierrosten kokonaismäärän niin lopetetaan.

while kierros < kierroksia:
      print("Olemme kierroksella",kierros)

      #Kasvatetaan kierrosmittaria yhdellä
      kierros += 1

jatkuu = True

while jatkuu:
      syote = input("Kirjoita jotain: ")

      if syote == "lopeta":
            jatkuu = False
            print("Lopetit ohjelman.")
      else:
            print(syote)


kertoma = int(input("Kuinka monta kierrosta?: "))
tulos = int(1)
for kierros in range(0,kertoma):
    tulos = tulos+kierros

print("Kertymäksi saatiin:", tulos-1)



luku1=int(input("Anna ensimmäinen luku: "))
luku2=int(input("Anna toinen luku: "))

jatkuu = True

while jatkuu:
      print("""(1) +
(2) -
(3) *
(4) /
(5)Vaihda luvut
(6)Lopeta""")
      print("Valitut luvut:",luku1,luku2)
      valinta=input("Tee valinta (1-6): ")

      if valinta=="2":
            print("Tulos on: ",luku1-luku2)
      elif valinta=="1":
          print("Tulos on: ",luku1+luku2)
      elif valinta=="3":
          print("Tulos on: ",luku1*luku2)
      elif valinta=="4":
          print("Tulos on: ",luku1/luku2)
      elif valinta=="5":
            luku1=int(input("Anna uusi ensimmäinen luku: "))
            luku2=int(input("Anna uusi toinen luku: "))
      elif valinta=="6":
            jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")
              
              
              
              
              
              
 tiedosto = open("faktat.txt","r")
sisalto = tiedosto.readlines()

print("Tiedostosta luettiin teksti:")
for i in sisalto:
    print(i)

tiedosto.close()


nimi=input("Minkäniminen tiedosto luodaan?: ")
tiedosto = open(nimi,"w")
sisalto = input("Mitä kirjoitetaan tiedostoon?: ")

tiedosto.write(sisalto)
tiedosto.close()

print("Luotiin tiedosto",nimi,"ja siihen tallennettiin teksti:",sisalto)





tiedosto = open("merkkijonoja.txt","r")
sisalto = tiedosto.readlines()
tiedosto.close()
sijainti=0
for i in sisalto:
      tiedosto = open("merkkijonoja.txt","r")
      tiedosto.seek(sijainti)
      luetturivi=tiedosto.readline()
      luetturivi = luetturivi[:-1]
      if luetturivi!="":
            if luetturivi.isalnum():
                  print(luetturivi,"kelpaa salasanaksi.")
            else:
                  print(luetturivi,"sisältää virheellisiä merkkejä.")
            #print(luetturivi)
      sijainti=tiedosto.tell()
      #print("sijainti:",sijainti)
      tiedosto.close()
      
      
      
      
      
      
#valitsin

tiedostonimi="muistio.txt"
jatkuu = True
while jatkuu:
      valinta=input("""(1) Lue muistikirjaa
(2) Lisää merkintä
(3) Tyhjennä muistikirja
(4) Lopeta\n\nMitä haluat tehdä?: """)

      #1. Lue muistikirjaa
      if valinta=="1":
            tiedosto = open(tiedostonimi,"r")
            sisalto = tiedosto.readlines()
            tiedosto.close()
            sijainti=0
            for i in sisalto:
                  tiedosto = open(tiedostonimi,"r")
                  tiedosto.seek(sijainti)
                  luetturivi=tiedosto.readline()
                  luetturivi = luetturivi[:-1]
                  print(luetturivi)
                  sijainti=tiedosto.tell()
                  tiedosto.close()

            print("\n")

      #2. Lisää merkintä
      elif valinta=="2":
            merkinta=input("Kirjoita uusi merkintä: ")
            tiedosto = open(tiedostonimi,"a")
            tiedosto.write(merkinta+"\n")
            tiedosto.close()

      #3. Tyhjennä muistikirja
      elif valinta=="3":
            tiedosto = open(tiedostonimi,"w")
            tiedosto.close()
            print("Muistio tyhjennetty.")

      #4. Lopeta
      elif valinta=="4":
          print("Lopetetaan.")
          jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")
      

              

def tulostusfunktio():
      print("Tulostusfunktio!")

#Luomme erillisen pääfunktion
def main():
      tulostusfunktio()

#Lopuksi käynnistämme ohjelman pääfunktiosta
if __name__ == "__main__":
      main()
      
      
      
      
 def toinenpotenssi(luku_1):
      print("Toinen potenssi on ",luku_1**2,sep="")

#Luomme erillisen pääfunktion
def main():
      lukema=int(input("Anna lukuarvo: "))

      #Kutsutaan funktiota ja annetaan parametrit
      toinenpotenssi(lukema)

#Lopuksi käynnistämme ohjelman pääfunktiosta
if __name__ == "__main__":
      main()






def tulostaja(merkkijono = "Oletustulostus"):
      print(merkkijono)

#Luomme erillisen pääfunktion
def main():
      jatkuu=True
      while jatkuu:
            
            syote=input("Anna syöte (Lopeta lopettaa): ")
            if len(syote) >= 5 and syote!="Lopeta":
                  tulostaja(syote)
            elif len(syote)<5 and syote!="Lopeta":
                  tulostaja()
            elif syote=="Lopeta":
                  jatkuu=False


#Lopuksi käynnistämme ohjelman pääfunktiosta
if __name__ == "__main__":
      main()



def tulostaja(merkkijono = ""):
      pituus=len(merkkijono)
      return pituus

#Luomme erillisen pääfunktion
def main():
      jatkuu=True
      while jatkuu:
            
            syote=input("Anna syöte (Lopeta lopettaa): ")
            if syote=="Lopeta":
                  jatkuu=False
                  continue
            else:
                  pituus=tulostaja(syote)

            if pituus==0:
                  print("Et antanut syötettä")
            elif pituus !=0:
                  print("Antamasi syöte oli",pituus,"merkkiä pitkä.")


#Lopuksi käynnistämme ohjelman pääfunktiosta
if __name__ == "__main__":
      main()



import random
print("Heitetään kolikkoa viidesti:")
for x in range(0, 5):
      luku = random.randint(0,1)
      if luku==0:
            print("Klaava!")
      elif luku==1:
            print("Kruuna!")

def tarkistaja(tietokone,pelaaja):
      if tietokone=="Torakka" and pelaaja=="Jalka":
            vastaus="Voitit!"
            return vastaus
      elif tietokone=="Ydinase" and pelaaja=="Torakka":
            vastaus="Voitit!"
            return vastaus
      elif tietokone=="Jalka" and pelaaja=="Ydinase":
            vastaus="Voitit!"
            return vastaus
      elif tietokone==pelaaja:
            vastaus="Tasapeli!"
            return vastaus
      else:
            vastaus="Hävisit!"
            return vastaus
            
            

#Luomme erillisen pääfunktion
def main():
      import random
      tasapeli=0
      voitot=0
      kierros=0
      jatkuu=True
      while jatkuu:
            pelaaja=input("Jalka, Ydinase vai Torakka? (Lopeta lopettaa): ")
            if pelaaja=="Lopeta":
                  jatkuu=False
                  continue
            luku = random.randint(1,3)
            if luku==1:
                  tietokone="Jalka"
            elif luku==2:
                  tietokone="Ydinase"
            elif luku==3:
                  tietokone="Torakka"
            print("Sinä valitsit:",pelaaja)
            print("tietokone valitsi:",tietokone)
            kierros=kierros+1
            vastaus=tarkistaja(tietokone,pelaaja)
            print(vastaus)
            if vastaus=="Voitit!":
                  voitot=voitot+1
            elif vastaus=="Tasapeli!":
                  tasapeli=tasapeli+1

      print("Pelasit",kierros,"kierrosta, joista voitit",voitot,"ja pelasit tasan",tasapeli,"peliä.")
      


#Lopuksi käynnistämme ohjelman pääfunktiosta
if __name__ == "__main__":
      main()



def tulosta(esimerkki):
	pituus=len(esimerkki)
	print("Saatiin syöte:",esimerkki,"\n Syötteen pituus on",pituus,"merkkiä.")
  
  
  
  def testaa(merkkijono = ""):
	if len(merkkijono) < 5 or merkkijono.isalpha() or merkkijono.isdigit():
		return False
	else:
		return True




import math
luku1=int(input("Anna ensimmäinen luku: "))
luku2=int(input("Anna toinen luku: "))

jatkuu = True

while jatkuu:
      print("""(1) +
(2) -
(3) *
(4) /
(5)sin(luku1/luku2)
(6)cos(luku1/luku2)
(7)Vaihda luvut
(8)Lopeta""")
      print("Valitut luvut:",luku1,luku2)
      valinta=input("Tee valinta (1-8): ")

      if valinta=="1":
            print("Tulos on: ",luku1+luku2)
      elif valinta=="2":
            print("Tulos on: ",luku1-luku2)
      elif valinta=="3":
            print("Tulos on: ",luku1*luku2)
      elif valinta=="4":
            print("Tulos on: ",luku1/luku2)
      elif valinta=="5":
            print("Tulos on: ",math.sin(luku1/luku2))
      elif valinta=="6":
            print("Tulos on: ",math.cos(luku1/luku2))
      elif valinta=="7":
            luku1=int(input("Anna uusi ensimmäinen luku: "))
            luku2=int(input("Anna uusi toinen luku: "))
      elif valinta=="8":
            jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")
              
              
              
              
    #valitsin
import time
tiedostonimi="muistio.txt"
jatkuu = True
while jatkuu:
      valinta=input("""(1) Lue muistikirjaa
(2) Lisää merkintä
(3) Tyhjennä muistikirja
(4) Lopeta\n\nMitä haluat tehdä?: """)

      #1. Lue muistikirjaa
      if valinta=="1":
            tiedosto = open(tiedostonimi,"r")
            sisalto = tiedosto.readlines()
            tiedosto.close()
            sijainti=0
            for i in sisalto:
                  tiedosto = open(tiedostonimi,"r")
                  tiedosto.seek(sijainti)
                  luetturivi=tiedosto.readline()
                  luetturivi = luetturivi[:-1]
                  print(luetturivi)
                  sijainti=tiedosto.tell()
                  tiedosto.close()

            print("\n")

      #2. Lisää merkintä
      elif valinta=="2":
            merkinta=input("Kirjoita uusi merkintä: ")
            tiedosto = open(tiedostonimi,"a")
            tiedosto.write(merkinta+":::"+time.strftime("%X %x")+"\n")
            tiedosto.close()

      #3. Tyhjennä muistikirja
      elif valinta=="3":
            tiedosto = open(tiedostonimi,"w")
            tiedosto.close()
            print("Muistio tyhjennetty.")

      #4. Lopeta
      elif valinta=="4":
          print("Lopetetaan.")
          jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")

#Pyydetään käyttäjältä luku syötteenä
luku = input("Anna luku: ")

#koitetaan muuttaa syöte lukuarvoksi
try:
      luku = int(luku)
      print("Syöte oli kelvollinen.")
    
#Jos tapahtuu mikä tahansa virhe,
#Ajetaan except-osio
except Exception:
      print("Virheellinen syöte!")
      
      
      
      
 #Pyydetään käyttäjältä nimi syötteenä
nimi = input("Anna tiedoston nimi: ")
try:
      tiedosto = open(nimi,"r")
      sisalto = tiedosto.readline()
      tiedosto.close()
      sisalto = int(sisalto)+313
      print("Saatiin tulos",sisalto)
except (FileNotFoundError):
      print("Virheellinen tiedostonnimi")
#koitetaan muuttaa syöte lukuarvoksi
except (TypeError, ValueError):
      print("Tiedoston sisältö virheellinen!")
      
      
      
      
      
      
  import math
jatkuu = True
while jatkuu:
      try:
            luku1=int(input("Anna luku: "))
      except (TypeError, ValueError):
            print("Virheellinen syöte!")
            continue
      jatkuu=False
jatkuu=True
while jatkuu:
      try:
            luku2=int(input("Anna luku: "))
      except (TypeError, ValueError):
            print("Virheellinen syöte!")
            continue
      jatkuu=False
jatkuu = True

while jatkuu:
      print("""(1) +
(2) -
(3) *
(4) /
(5)sin(luku1/luku2)
(6)cos(luku1/luku2)
(7)Vaihda luvut
(8)Lopeta""")
      print("Valitut luvut:",luku1,luku2)
      valinta=input("Tee valinta (1-8): ")

      if valinta=="1":
            print("Tulos on: ",luku1+luku2)
      elif valinta=="2":
            print("Tulos on: ",luku1-luku2)
      elif valinta=="3":
            print("Tulos on: ",luku1*luku2)
      elif valinta=="4":
            print("Tulos on: ",luku1/luku2)
      elif valinta=="5":
            print("Tulos on: ",math.sin(luku1/luku2))
      elif valinta=="6":
            print("Tulos on: ",math.cos(luku1/luku2))
      elif valinta=="7":
            jatkuu2=True
            while jatkuu2:
                  try:
                        luku1=int(input("Anna luku: "))
                  except (TypeError, ValueError):
                        print("Virheellinen syöte!")
                        continue
                  jatkuu2=False
            jatkuu2=True
            while jatkuu2:
                  try:
                        luku2=int(input("Anna luku: "))
                  except (TypeError, ValueError):
                        print("Virheellinen syöte!")
                        continue
                  jatkuu2=False
      elif valinta=="8":
            jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")
              
              
              
              
  #valitsin
import time
tiedostonimi="muistio.txt"
try:            
      tiedosto = open(tiedostonimi,"r")
      tiedosto.close()
except (IOError):
      tiedosto = open(tiedostonimi,"w")
      tiedosto.close()
      print("Oletusmuistioa ei löydy, luodaan tiedosto.")
jatkuu = True
while jatkuu:
      try:            
            tiedosto = open(tiedostonimi,"r")
            tiedosto.close()
      except (IOError):
            tiedosto = open(tiedostonimi,"w")
            tiedosto.close()
            print("Tiedostoa ei löydy, luodaan tiedosto.")
      print("Käytetään muistiota:",tiedostonimi)
      valinta=input("""(1) Lue muistikirjaa
(2) Lisää merkintä
(3) Tyhjennä muistikirja
(4) Vaihda muistiota
(5) Lopeta\n\nMitä haluat tehdä?: """)

      #1. Lue muistikirjaa
      if valinta=="1":
            tiedosto = open(tiedostonimi,"r")
            sisalto = tiedosto.readlines()
            tiedosto.close()
            sijainti=0
            for i in sisalto:
                  tiedosto = open(tiedostonimi,"r")
                  tiedosto.seek(sijainti)
                  luetturivi=tiedosto.readline()
                  luetturivi = luetturivi[:-1]
                  print(luetturivi)
                  sijainti=tiedosto.tell()
                  tiedosto.close()

            print("\n")

      #2. Lisää merkintä
      elif valinta=="2":
            merkinta=input("Kirjoita uusi merkintä: ")      
            tiedosto = open(tiedostonimi,"a")
            tiedosto.write(merkinta+":::"+time.strftime("%X %x")+"\n")
            tiedosto.close()

      #3. Tyhjennä muistikirja
      elif valinta=="3":
            tiedosto = open(tiedostonimi,"w")
            tiedosto.close()
            print("Muistio tyhjennetty.")
            
      #4. Vaihda muistiota
      elif valinta=="4":
            tiedostonimi=input("Anna tiedoston nimi:")
            
      #5. Lopeta
      elif valinta=="5":
          print("Lopetetaan.")
          jatkuu=False
      else:
              print("Valintaa ei tunnistettu.")


