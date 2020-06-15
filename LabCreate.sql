-- Table: PROBA
CREATE TABLE PROBA (
    ID_PROBA bigint NOT NULL,
    NR_PROBY varchar(20) NOT NULL,
    NR_SERII varchar(10) NOT NULL,
    SPECYFIKACJA_ID_SPECYFIKACJI bigint NOT NULL,
    NR_SERII_WYTWORCY varchar(20) NOT NULL,
    DOSTAWCA_ID_DOSTAWCA bigint NOT NULL,
    ETAP_PROD_ID_ETAP_PROD bigint NOT NULL,
    TYP_PROBY_ID_TYP_PROBY bigint NOT NULL,
    DATA_POBORU date NOT NULL,
    DATA_PRODUKCJI date NOT NULL,
    DATA_WAZNOSCI date NOT NULL,
    OCENA_ID_OCENA bigint NULL,
    OCENIONA bool NULL,
    DATA_OCENY timestamp NULL,
    SPRAWDZONA bool NULL,
    DATA_SPRAWDZENIA timestamp NULL,
    CONSTRAINT PROBA_pk PRIMARY KEY (ID_PROBA)
);