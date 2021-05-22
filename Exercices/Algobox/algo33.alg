<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER i" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" epaisseurPoint="2" maxBoucle="500000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Note EST_DU_TYPE LISTE" code="1#LISTE#Note"/>
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
        <item algoitem="vp EST_DU_TYPE NOMBRE" code="1#NOMBRE#vp"/>
        <item algoitem="vn EST_DU_TYPE NOMBRE" code="1#NOMBRE#vn"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="vals EST_DU_TYPE NOMBRE" code="1#NOMBRE#vals"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Entrez le nombre de valeurs à saisir&quot;" code="4#Entrez le nombre de valeurs à saisir#0"/>
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="vp PREND_LA_VALEUR 0" code="5#vp#0#pasliste"/>
        <item algoitem="vn PREND_LA_VALEUR 0" code="5#vn#0#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 0 A nb-1" code="12#i#0#nb-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER &quot;Entrez le nombre n°:&quot;" code="4#Entrez le nombre n°:#0"/>
            <item algoitem="AFFICHER i" code="3#i#0#pasliste"/>
            <item algoitem="LIRE vals" code="2#vals#pasliste"/>
            <item algoitem="Note[i] PREND_LA_VALEUR vals" code="5#Note#vals#i"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="POUR i ALLANT_DE 0 A nb-1" code="12#i#0#nb-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="SI (Note[i]>0) ALORS" code="6#Note[i]>0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="vp PREND_LA_VALEUR vp+1" code="5#vp#vp+1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="vn PREND_LA_VALEUR vn+1" code="5#vn#vn+1#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Nombre de valeurs positives:&quot;" code="4#Nombre de valeurs positives:#0"/>
        <item algoitem="AFFICHER vp" code="3#vp#1#pasliste"/>
        <item algoitem="AFFICHER &quot;Nombre de valeurs négatives:&quot;" code="4#Nombre de valeurs négatives:#0"/>
        <item algoitem="AFFICHER vn" code="3#vn#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
