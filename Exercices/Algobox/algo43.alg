<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="valls PREND_LA_VALEUR 1" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#Tableau" algoitem="Tableau EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#n_occurence" algoitem="n_occurence EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#valls" algoitem="valls EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#entrée" algoitem="entrée EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#n_occurence#0#pasliste" algoitem="n_occurence PREND_LA_VALEUR 0"/>
        <item code="5#valls#1#pasliste" algoitem="valls PREND_LA_VALEUR 1"/>
        <item code="12#i#0#5" algoitem="POUR i ALLANT_DE 0 A 5">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#Entrez le nombre n°:#0" algoitem="AFFICHER &quot;Entrez le nombre n°:&quot;"/>
            <item code="20#i+1#0" algoitem="AFFICHERCALCUL i+1"/>
            <item code="2#entrée#pasliste" algoitem="LIRE entrée"/>
            <item code="5#Tableau#entrée#i" algoitem="Tableau[i] PREND_LA_VALEUR entrée"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="2#valls#pasliste" algoitem="LIRE valls"/>
        <item code="12#i#0#5" algoitem="POUR i ALLANT_DE 0 A 5">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#Tableau[i]==valls" algoitem="SI (Tableau[i]==valls) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#n_occurence#n_occurence+1#pasliste" algoitem="n_occurence PREND_LA_VALEUR n_occurence+1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#n_occurence#0#pasliste" algoitem="AFFICHER n_occurence"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
