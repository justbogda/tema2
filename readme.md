#     __*Seelvaree meteo*__
![alt text](./src/main/resources/Seelvaree.jpg "Logo Title Text 1")


### Utilizarea aplicatiei
___
Aplicatia are rolul de a arata informatile in timp real ale vrmei in diverse lucatii salvate in baza de date


### Ce contine interfata
___

1. Un ChoiceBox pentru selectarea tarii
2. Un ChoiceBox pentru selectarea orasului din tara selectata la anteriorul
3. Un Button la apasarea caruia sunt afisate diverse informatii
4. 4 Label-uri care or sa afiseze informatiile in urma apasari butonului.
    - label pentru temperatura curenta
    - label pentru temperatura minima
    - label pentru temperatura maxima
    - label pentru temperatura simtita
    
### Cum functioneaza aplicatia
___

1. Aplicatia ia din fisierul de configurare datele pentru cele 2 ChoiceBox-uri

2. Face un apel la OpenWeather folosid un API Key, din care este returnat un string in format JSON

3. Avem o clasa ce interpreteaza acest JSON si este parsat astfel incat sunt extrase datele pentru cele 4 Label-uri

4. Dupa fiecare apasare a butonului informatile cautate referitoare la oras sunt salvate in fisierul histroy.txt

### Un model de interogare folosita este:
___

[Exemplu de interogare](http://api.openweathermap.org/data/2.5/weather?q=Iasi&units=metric&appid=ba253fc6353d2351ea05b7541d47052d&lang=ro)

Aici facem o interogare folosind Orasul=Iasi, unitatea de masura=metric, cheia api=..... si limba=romana.

### Limbajul folosit

JAVA JDK 15

### Author

Vlaicu George Bogdan