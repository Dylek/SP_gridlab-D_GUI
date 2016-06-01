# SP_gridlab-D_GUI
Projekt GUI dla programu Gridlab-D.

1. Uruchamianie \n
Z użyciem kodu źródłowego: kompilujemy klasę GridalbGUI.java
Deskopowo: uruchamiamy aplikację gridlabdGUI.jar

2. Dodawanie obiektu do modelu
Wybór modułu z toolboxa znajdującego się w lewej części okna. Po kliknięciu, w panelu obok pojawi się lista dostępnych obiektów.
Wybór obiektu, który chcemy utworzyć.
Obiekt pojawi się w polu w dolnej części okna, gdzie można go przesuwać.
Obiekty można usunąć przyciskiem „-”.

3. Zmienianie właściwości obiektu
Klikamy obiekt, którego właściwości chcemy zmienić.
Pojawia się panel właściwości obiektu.
Zmiany zapisują się automatycznie przy przejściu od wyświetlania cech jednego obiektu do cech drugiego lub po kolejnym kliknięciu w obiekt.

4. Zapis modelu
Aby zapisać model należy wybrać z menu File opcję Save. Dokona to serializacji odpowiednich zmiennych i przygotuje plik.

5. Wczytanie modelu
Aby wczytać model należy wybrać z menu File opcję Load. Dokona to deserializacji pliku i odtworzenia modelu.

6. Czyszczenie modelu
Aby wyczyścić model należy wybrać z menu File opcję Clear.

7. Generowanie pliku GLM
Z menu wybieramy zakładkę GLM
Z listy opcji wybieramy Export To GLM
Pojawi się okno, w którym wybieramy gdzie  i pod jaką nazwą ma zostać utworzony plik GLM.

8. Uruchamianie skryptu
Z menu wybieramy zakładkę GLM.
Z listy opcji wybieramy Run Simulation.
W oknie, które się pojawi wybieramy plik, który chcemy uruchomić w Gridlab-D.

9. Uruchamianie bieżącego modelu
Aby uruchomić aktualnie edytowany model w Gridlab-D, należy nacisnąć przycisk Start symulacji z paska menu.

10. Wyjście konsoli
Po uruchomieniu skryptu zostaną wyświetlone komunikaty konsoli.

11. Łączenie obiektów
a. Przez Parent: Po kliknięciu pojawia się okno, w którym wybieramy połączenie typu rodzic-dziecko.
b. Przez From-To: Po kliknięciu pojawia się okno, w którym wybieramy połączenie typu obiekt-łącznik-obiekt2.
