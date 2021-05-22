<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER montableau[5]"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" maxBoucle="500000" totalBoucles="5000000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#montableau" algoitem="montableau EST_DU_TYPE LISTE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#montableau#&quot;a&quot;#0" algoitem="montableau[0] PREND_LA_VALEUR &quot;a&quot;"/>
        <item code="5#montableau#&quot;e&quot;#1" algoitem="montableau[1] PREND_LA_VALEUR &quot;e&quot;"/>
        <item code="5#montableau#&quot;i&quot;#2" algoitem="montableau[2] PREND_LA_VALEUR &quot;i&quot;"/>
        <item code="5#montableau#&quot;o&quot;#3" algoitem="montableau[3] PREND_LA_VALEUR &quot;o&quot;"/>
        <item code="5#montableau#&quot;u&quot;#4" algoitem="montableau[4] PREND_LA_VALEUR &quot;u&quot;"/>
        <item code="5#montableau#&quot;y&quot;#5" algoitem="montableau[5] PREND_LA_VALEUR &quot;y&quot;"/>
        <item code="3#montableau#1#0" algoitem="AFFICHER montableau[0]"/>
        <item code="3#montableau#1#1" algoitem="AFFICHER montableau[1]"/>
        <item code="3#montableau#1#2" algoitem="AFFICHER montableau[2]"/>
        <item code="3#montableau#1#3" algoitem="AFFICHER montableau[3]"/>
        <item code="3#montableau#1#4" algoitem="AFFICHER montableau[4]"/>
        <item code="3#montableau#1#5" algoitem="AFFICHER montableau[5]"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
