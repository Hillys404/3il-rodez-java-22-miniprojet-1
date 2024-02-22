**Ce que j'ai réalisé du projet :**
- VisualisateurBruitPerlin
- VisualisateurCarteTerrain (Générateur Perlin & Générateur Aléatoire) à l'exception près que le chargement de la carte ne fonctionne pas
De plus, lors du passage de la souris des exceptions se lancent
- Peu de tests 

**Questions :**
**Pourquoi l'attribut graine est-il en final ?**
La valeur de la graine ne doit pas changer durant l'exécution du code.


**Quelle serait la différence d'attributs et de méthodes entre ces classes ?**
*cf Diagramme de classe Terrain.png à la racine du projet*
Les attributs d'hydrométrie, d'altitude et de température vont changer de valeur selon le type de terrain.
Quant aux méthodes, il n'y a pas de changement dans leur comportement.

**Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?**
Comme pour l'exercice des Pokemon (avec plusieurs types de Pokemon, feu, eau, plante, ...) on se retrouve avec
de nombreuses classes héritant de Terrain. La création de ces classes est redondante et si des changements sont
à faire sur du code hérité, il faudra effectuer les modifications dans toutes les classes.
Seuls les valeurs de trois attributs vont changer, de ce fait, il est préférable d'utiliser un enum pour lister tous les types de terrain. 

**Question : quel type utilisez-vous ?**
Pour les trois attributs, j'utilise le type double.

**Retour personnel : **
La mise en place des patrons de conception n'était pas simple
J'ai eu du mal à comprendre comment fonctionne l'algorithme du bruit de Perlin, même en ayant regardé le short youtube explicatif 30 fois...
Je n'ai écris que très peu de tests vu que je ne voyais pas comment tester les méthodes plus complexes