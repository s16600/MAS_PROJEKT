--  JEDNOSTKA_MIARY
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (1,'mg');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (2,'g');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (3,'ug');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (4,'kg');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (5,'ml');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (6,'l');
INSERT INTO jednostka_miary(id_jednostka_miary,symbol_jednostki) VALUES (7,'ul');

--  URZADZENIE
INSERT INTO urzadzenie(id_urzadzenia, nazwa_urzadzenia, data_kalibracji, okres_kalibracji) VALUES (1,'HPLC Waters 1','2019-01-19', 12);
INSERT INTO urzadzenie(id_urzadzenia, nazwa_urzadzenia, data_kalibracji, okres_kalibracji) VALUES (2,'HPLC Shimadzu 5','2019-01-19', 12);
INSERT INTO urzadzenie(id_urzadzenia, nazwa_urzadzenia, data_kalibracji, okres_kalibracji) VALUES (3,'Spektrofotometr UV-Vis 1','2019-01-19', 12);

--  UPRAWNIENIA
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (1, 'pobór próby');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (2, 'wykonanie analizy');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (3, 'rejestracja wyników');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (4, 'sprawdzenie wyników');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (5, 'sprawdzenie certyfikatu');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (6, 'ocena certyfikatu');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (7, 'wprowadzenie specyfikacji');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (8, 'modyfikacja specyfikacji');
INSERT INTO uprawnienia(id_uprawnienia, nazwa_uprawnienia) VALUES (9, 'sprawdzenie specyfikacji');

--  FUNKCJA
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (1, 'Próbobiorca');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (2, 'Laborant');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (3, 'Analityk');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (4, 'Kierownik pracowni');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (5, 'Kierownik działu');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (6, 'Administrator');
INSERT INTO funkcja(id_funkcja, nazwa_funkcji) VALUES (7, 'Specjalista ds. technicznych');

-- UPRAWNIENIA_FUNKCJI
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (1, 1, 1);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (2, 2, 2);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (3, 2, 3);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (4, 3, 2);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (5, 3, 3);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (6, 3, 4);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (7, 4, 4);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (8, 4, 5);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (9, 5, 6);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (10, 5, 9);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (11, 6, 7);
INSERT INTO uprawnienia_funkcji(id_uprawnienia_funkcji, funkcja_id_funkcja, uprawnienia_id_uprawnienia) VALUES (12, 6, 8);

-- PRACOWNIK
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (1, 'Kamil', 'Nowak', 'Próbobiorca',1);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (2, 'Tomasz', 'Szymański', 'Laborant',2);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (3, 'Piotr', 'Tarnowski', 'Analityk',3);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (4, 'Kamila', 'Kowalska', 'Kierownik pracowni materialow',4);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (5, 'Jolanta', 'Gierej', 'Kierownik Kontroli Jakości',5);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (6, 'Zosia', 'Samosia', 'Administrator systemu',6);
INSERT INTO pracownik(id_pracownika, imie, nazwisko, stanowisko, funkcja_id_funkcja) VALUES (7, 'Zenon', 'Niski', 'Technik',7);

-- KRAJ
INSERT INTO kraj(id_kraj, nazwa, jezyk) VALUES (1, 'Polska', 'polski');
INSERT INTO kraj(id_kraj, nazwa, jezyk) VALUES (2, 'Czechy', 'czeski');
INSERT INTO kraj(id_kraj, nazwa, jezyk) VALUES (3, 'Rosja', 'rosyjski');
INSERT INTO kraj(id_kraj, nazwa, jezyk) VALUES (4, 'Armenia', 'rosyjski');
INSERT INTO kraj(id_kraj, nazwa, jezyk) VALUES (5, 'Białoruś', 'rosyjski');

-- DOSTAWCA
INSERT INTO dostawca(id_dostawca , miasto , nazwa , nr_domu_lokalu , ulica) VALUES(1, 'Barcelona', 'Aesica', '5/14', 'Iksinskiego street');
INSERT INTO dostawca(id_dostawca , miasto , nazwa , nr_domu_lokalu , ulica) VALUES(2, 'Opava', 'Zentiva', '8/5b', 'J. Haska');
INSERT INTO dostawca(id_dostawca , miasto , nazwa , nr_domu_lokalu , ulica) VALUES(3, 'Krakow', 'Wydzial produkcji', '15', 'Mogilska');

-- ETAP_PROD
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(1, 'magazynowanie materialu');
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(2, 'naważanie');
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(3, 'wytwarzanie');
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(4, 'magazynowanie produktu luzem');
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(5, 'pakowanie');
INSERT INTO etap_prod(id_etap_prod , nazwa_etapu) VALUES(6, 'magazynowanie produktu');

-- OCENA
INSERT INTO ocena(id_ocena , nazwa_oceny) VALUES(1, 'odpowiada wymaganiam');
INSERT INTO ocena(id_ocena , nazwa_oceny) VALUES(2, 'odpowiada wymaganiam w badanych parametrach');
INSERT INTO ocena(id_ocena , nazwa_oceny) VALUES(3, 'nie odpowiada wymaganiam');
INSERT INTO ocena(id_ocena , nazwa_oceny) VALUES(4, 'informacyjnie');

-- TYP_PROBY
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(1, 'material wyjsciowy');
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(2, 'material opakowaniowy');
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(3, 'produkt posredni');
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(4, 'produkt luzem');
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(5, 'produkt gotowy');
INSERT INTO typ_proby(id_typ_proby , nazwa_typu) VALUES(6, 'produkt do sprzedaży');

-- SPECYFIKACJA
INSERT INTO specyfikacja(id_specyfikacji, nazwa_materialu, symbol_specyfikacji) VALUES(1, 'Witamina C', 'MW/0001/15C');
INSERT INTO specyfikacja(id_specyfikacji, nazwa_materialu, symbol_specyfikacji) VALUES(2, 'Tabletki witaminy C 10 0mg', 'PG/0002/15C');
INSERT INTO specyfikacja(id_specyfikacji, nazwa_materialu, symbol_specyfikacji) VALUES(3, 'Aspiryna', 'MW/0002/18A');
INSERT INTO specyfikacja(id_specyfikacji, nazwa_materialu, symbol_specyfikacji) VALUES(4, 'Kodeina', 'MW/0003/19A');
INSERT INTO specyfikacja(id_specyfikacji, nazwa_materialu, symbol_specyfikacji) VALUES(5, 'Tabletki kodeiny 25 mg', 'PG/0003/18C');

-- PARAMETR
-- INSERT INTO parametr(id_parametr , nazwa_badania , specyfikacja_id_specyfikacji , typ_badania , wymagania) VALUES (1, 'Średnia masa i jednolitość masy', 2, 'srednia i zakres', '100 +/- 10 mg');
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (11, 'Średnia masa i jednolitość masy', 'srednia i zakres', '100 +/- 10 mg', 2);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (12, 'Zawartość substancji czynnej', 'srednia i zakres', '50 +/- 5 mg', 2);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (13, 'Uwalnianie substancji czynnej', 'srednia i zakres', '>80 %', 2);

INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (21, 'Tożsamość', '1', 'odpowiada wymaganiom', 1);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (22, 'Zawartość substancji czynnej', 'srednia', '98 - 101%', 1);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (23, 'Zawartość wody', 'srednia', '2-5%', 1);

INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (31, 'Tożsamość', '1', 'odpowiada wymaganiom', 3);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (32, 'Zawartość substancji czynnej', 'srednia', '98 - 101%', 3);
INSERT INTO parametr(id_parametr, nazwa_badania, typ_badania, wymagania, specyfikacja_id_specyfikacji) VALUES (33, 'Zawartość wody', 'srednia', '2-5%', 3);

-- LABORATORIUM
INSERT INTO laboratorium(id_laboratorium, nazwa) VALUES (1, 'Pracownia materiałów wyjściowych');
INSERT INTO laboratorium(id_laboratorium, nazwa) VALUES (2, 'Pracownia produktów leczniczych');
INSERT INTO laboratorium(id_laboratorium, nazwa) VALUES (3, 'Pracownia chromatografii');
INSERT INTO laboratorium(id_laboratorium, nazwa) VALUES (4, 'Pracownia mikrobiologii i higieny');

-- PROBA
INSERT INTO proba (id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji, nr_serii_wytworcy, dostawca_id_dostawca, etap_prod_id_etap_prod, typ_proby_id_typ_proby, 
data_poboru, data_produkcji, data_waznosci, sprawdzona, data_sprawdzenia, ocena_id_ocena)
VALUES (1, 'P/000001/19', 'F145/18/02', 1, 'F145/18/02', 1, 1, 1, '2019-01-01', '2019-01-01', '2021-01-01', false, null, null);
INSERT INTO proba (id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji, nr_serii_wytworcy, dostawca_id_dostawca, etap_prod_id_etap_prod, typ_proby_id_typ_proby, 
data_poboru, data_produkcji, data_waznosci, sprawdzona, data_sprawdzenia, ocena_id_ocena)
VALUES (2, 'P/000002/19', 'F145/18/03', 1, 'F145/18/03', 1, 1, 1, '2019-01-02', '2019-01-02', '2021-01-02', false, null, null);


/*
INSERT INTO proba(id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji,  nr_serii_wytworcy,  dostawca_id_dostawca, 
etap_prod_id_etap_prod , typ_proby_id_typ_proby, data_poboru , data_produkcji,  data_waznosci, ocena_id_ocena, oceniona, 
data_oceny, sprawdzona, data_sprawdzenia) 
VALUES (1,'P/000001/19','F145/18/02',1, 'F145/18/02',1,1,1,'2019-01-01', '2019-01-01', '2019-01-01', 1, 1, '2019-01-01', 1, '2019-01-01');

INSERT INTO proba(id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji,  nr_serii_wytworcy,  dostawca_id_dostawca, 
etap_prod_id_etap_prod , typ_proby_id_typ_proby, data_poboru , data_produkcji,  data_waznosci, ocena_id_ocena, oceniona, 
data_oceny, sprawdzona, data_sprawdzenia) 
VALUES (2,'P/000002/19','F145/18/02',1, 'F145/18/03',1,1,1,'2019-01-01', '2019-01-01', '2019-01-01', 1, 1, '2019-01-01', 1, '2019-01-01');

INSERT INTO proba(id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji,  nr_serii_wytworcy,  dostawca_id_dostawca, 
etap_prod_id_etap_prod , typ_proby_id_typ_proby, data_poboru , data_produkcji,  data_waznosci, ocena_id_ocena, oceniona, 
data_oceny, sprawdzona, data_sprawdzenia) 
VALUES (3,'P/000003/19','AS45/18/02',3, 'AS45/18/03',1,1,1,'2019-01-01', '2019-01-01', '2019-01-01', 1, 1, '2019-01-01', 1, '2019-01-01');

INSERT INTO proba(id_proba, nr_proby, nr_serii, specyfikacja_id_specyfikacji,  nr_serii_wytworcy,  dostawca_id_dostawca, 
etap_prod_id_etap_prod , typ_proby_id_typ_proby, data_poboru , data_produkcji,  data_waznosci, ocena_id_ocena, oceniona, 
data_oceny, sprawdzona, data_sprawdzenia) 
VALUES (4,'P/000004/19','AS45/18/04',3, 'AS45/18/04',1,1,1,'2019-01-01', '2019-01-01', '2019-01-01', 1, 1, '2019-01-01', 1, '2019-01-01');
*/

-- WYNIK
INSERT INTO wynik (id_wynik, proba_id_proba, typ, nazwa, wymagania, uwagi, sprawdzony, data_sprawdzenia, pracownik_id_pracownika, jedn_miary_id_jedn_miary, urzadzenie_id_urzadzenia)
VALUES (1, 1, 'ASSAY', 'Zawartość witaminy A', '95 - 105 %', '', false, '2019-01-01', 1, 1, 1);

INSERT INTO wynik (id_wynik, proba_id_proba, typ, nazwa, wymagania, uwagi, sprawdzony, data_sprawdzenia, pracownik_id_pracownika, jedn_miary_id_jedn_miary, urzadzenie_id_urzadzenia)
VALUES (2, 1, 'ASSAY', 'Zawartość witaminy D3', '95 - 105 %', '', false, '2019-01-01', 1, 1, 1);

INSERT INTO wynik (id_wynik, proba_id_proba, typ, nazwa, wymagania, uwagi, sprawdzony, data_sprawdzenia, pracownik_id_pracownika, jedn_miary_id_jedn_miary, urzadzenie_id_urzadzenia)
VALUES (3, 2, 'ASSAY', 'Zawartość witaminy A', '95 - 105 %', '', false, '2019-01-01', 1, 1, 1);

INSERT INTO wynik (id_wynik, proba_id_proba, typ, nazwa, wymagania, uwagi, sprawdzony, data_sprawdzenia, pracownik_id_pracownika, jedn_miary_id_jedn_miary, urzadzenie_id_urzadzenia)
VALUES (4, 2, 'ASSAY', 'Zawartość witaminy D3', '95 - 105 %', '', false, '2019-01-01', 1, 1, 1);

/*
INSERT INTO wynik(id_wynik, proba_id_proba, nazwa_badania, wymagania, zakonczony, data_wykonania, sprawdzony, data_sprawdzenia, srednia, 
max_w, min_w, opis_wyniku, uwagi, typ_badania , pracownik_id_pracownika , jedn_miary_id_jedn_miary ,  urzadzenie_id_urzadzenia) 
VALUES (1,1, 'Tożsamość', 'odpowiada wymaganiom', 1, '2019-01-01', 1, '2019-01-01', 0,0,0, '-/-','-/-','-/-',2,1,2);

INSERT INTO wynik(id_wynik, proba_id_proba, nazwa_badania, wymagania, zakonczony, data_wykonania, sprawdzony, data_sprawdzenia, srednia, 
max_w, min_w, opis_wyniku, uwagi, typ_badania , pracownik_id_pracownika , jedn_miary_id_jedn_miary ,  urzadzenie_id_urzadzenia) 
VALUES (2,2, 'Tożsamość', 'odpowiada wymaganiom', 1, '2019-01-01', 1, '2019-01-01', 0,0,0,'-/-','-/-','-/-',2,1,2);

INSERT INTO wynik(id_wynik, proba_id_proba, nazwa_badania, wymagania, zakonczony, data_wykonania, sprawdzony, data_sprawdzenia, srednia, 
max_w, min_w, opis_wyniku, uwagi, typ_badania , pracownik_id_pracownika , jedn_miary_id_jedn_miary ,  urzadzenie_id_urzadzenia) 
VALUES (3,2, 'Zawartość substancji czynnej', '98 - 101%', 1, '2019-01-01', 1, '2019-01-01', 99,0,0,'-/-','-/-','-/-',3,1,2);

INSERT INTO wynik(id_wynik, proba_id_proba, nazwa_badania, wymagania, zakonczony, data_wykonania, sprawdzony, data_sprawdzenia, srednia, 
max_w, min_w, opis_wyniku, uwagi, typ_badania , pracownik_id_pracownika , jedn_miary_id_jedn_miary ,  urzadzenie_id_urzadzenia) 
VALUES (4,1, 'Zawartość substancji czynnej', '98 - 101%', 1, '2019-01-01', 1, '2019-01-01', 98.5,0,0,'-/-','-/-','-/-',3,1,2);
*/

--  POMIAR
INSERT INTO pomiar(id_pomiar, wynik_id_wynik, typ_pomiar, wartosc_num, wartosc_bool, wartosc_str, wartosc_enum) 
VALUES (1, 1, 'NUM', 99.8, null, null, null);
INSERT INTO pomiar(id_pomiar, wynik_id_wynik, typ_pomiar, wartosc_num, wartosc_bool, wartosc_str, wartosc_enum) 
VALUES (2, 1, 'NUM', 100.2, null, null, null);
INSERT INTO pomiar(id_pomiar, wynik_id_wynik, typ_pomiar, wartosc_num, wartosc_bool, wartosc_str, wartosc_enum) 
VALUES (3, 1, 'NUM', 98.1, null, null, null);

--  DYSTRYBUCJA_PROBY
INSERT INTO dystrybucja_proby(id_dystrybucja_proby , ilosc_proby , laboratorium_id_laboratorium , proba_id_proba) 
VALUES (1, 010.00, 1, 1);
INSERT INTO dystrybucja_proby(id_dystrybucja_proby , ilosc_proby , laboratorium_id_laboratorium , proba_id_proba) 
VALUES (2, 005.00, 1, 2);

--  CERTYFIKAT
INSERT INTO certyfikat(id_certyfikat , kraj_id_kraj , proba_id_proba) VALUES(1,1,1);
INSERT INTO certyfikat(id_certyfikat , kraj_id_kraj , proba_id_proba) VALUES(2,2,2);
