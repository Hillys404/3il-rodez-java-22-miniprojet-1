**Question : pourquoi l'attribut graine est-il en final ?**
La valeur de la graine ne doit pas changer durant l'exécution du code.

**Question : Réaliser l'architecture que prendrait la forme d'une telle modélisation sous forme d'un diagramme UML. 
Quelle serait la différence d'attributs et de méthodes entre ces classes ?**
Les attributs d'hydrométrie, d'altitude et de température vont changer de valeur selon le type de terrain.
Quant aux méthodes, il n'y a pas de changement dans leur comportement.

**Expliquer, en s'appuyant sur un exercice vu en cours, pourquoi c'est une mauvaise idée.
Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?**
Comme pour l'exercice des Pokemon (avec plusieurs types de Pokemon, feu, eau, plante, ...) on se retrouve avec
de nombreuses classes héritant de Terrain. La création de ces classes est redondante et si des changements sont
à faire sur du code hérité, il faudra effectuer les modifications dans toutes les classes.
Seuls les valeurs de trois attributs vont changer, de ce fait, il est préférable d'utiliser un enum pour lister tous les types de terrain. 

**Question : quel type utilisez-vous ?**
Pour les trois attributs, j'utilise le type double.