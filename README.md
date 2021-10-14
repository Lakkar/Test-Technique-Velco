# Test-Technique-Velco
Test technique en java pour Velco

L'API réalisée pour cet test technique lit un fichier enregistré en ressource et renvoie un JSON contenant les objets et erreurs de format
lus dans ce fichier.
Elle comporte différents packages de classes: les classes de Model, de Repository, de Service, et de Controller.

Les classes Model (AbstractReference, Reference, et ErrorReference) servent de modèles pour les objets de données à manipuler. Ils implémentents
l'interface Comparable afin de pouvoir être comparés entre eux.

La classe de Repository a pour tâche dans sa méthode readAll() de lire le fichier et d'en ressortir une list de références et d'erreurs.
À chaque ligne lue, la méthode appelle la fonction createReference afin de vérifier le format de la ligne et créer une référence ou une erreur à
ajouter à la liste.

La classe Service récupère dans sa méthode getReferences() la liste de références obtenue dans le repository et la trie.

La classe Controller récupère la liste triée dans sa méthode getReferences() et la rend accessible au format JSON par le biais d'un endpoint /references