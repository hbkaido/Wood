<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (i==1 OU n>pg) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="n EST_DU_TYPE NOMBRE" code="1#NOMBRE#n"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="pg EST_DU_TYPE NOMBRE" code="1#NOMBRE#pg"/>
        <item algoitem="ppg EST_DU_TYPE NOMBRE" code="1#NOMBRE#ppg"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="n PREND_LA_VALEUR 1" code="5#n#1#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 0" code="5#i#0#pasliste"/>
        <item algoitem="pg PREND_LA_VALEUR 0" code="5#pg#0#pasliste"/>
        <item algoitem="TANT_QUE (n!=0) FAIRE" code="15#n!=0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Entrez un nombre&quot;" code="4#Entrez un nombre#1"/>
            <item algoitem="LIRE n" code="2#n#pasliste"/>
            <item algoitem="i PREND_LA_VALEUR i+1" code="5#i#i+1#pasliste"/>
            <item algoitem="SI (i==1 OU n>pg) ALORS" code="6#i==1 OU n>pg">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="pg PREND_LA_VALEUR n" code="5#pg#n#pasliste"/>
                <item algoitem="ppg PREND_LA_VALEUR i" code="5#ppg#i#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER &quot;Le nombre le plus grand est:&quot;" code="4#Le nombre le plus grand est:#0"/>
        <item algoitem="AFFICHER pg" code="3#pg#1#pasliste"/>
        <item algoitem="AFFICHER &quot;Position numéro:&quot;" code="4#Position numéro:#0"/>
        <item algoitem="AFFICHER ppg" code="3#ppg#1#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
