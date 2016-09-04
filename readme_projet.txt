************************** Affichage du jeu de tennis entre Djokovic et MacEnroe *****************

Cette application permet d'afficher les résultats du jeu opposé entre les deux joueurs. 
Elle permet à l'utilisateur d'échange avec la console. Le résultat est écrit dans un fichier text.

Pour l'affichage du jeu nous allons  écrire dans l'un des 4 fichiers dont les noms sont les suivants : 
- Jeu gagne par Djokovic
- Avantage MacEnroe.txt
- Egalite
- Quarante-Zero

1- Comment lancer l'application?
Pour lancer l'application il faut d'abord importer le projet dans un environnement de developpement comme par exemple eclipse.
- Ouvrez le package lanceur
	- Cliquez sur la classe ClassePrincipale
		1. Si voulez avoir un résultat "Jeu gagne par Djokovic" alors changer le nom de l'argument de l'instanciation File("Egalite.txt") 
		par " Jeu gagne par Djokovic.txt" pour avoir File("Jeu Gagné par Djokovic.txt");
		2. Cliquez sur run pour lancer l'application
		3. Saississez le nom du joueur gagnant jusqu'à la fin du jeu
		4. Ouvrez le projet JeuxTennis--->puis Jeu Gagné Djokovic.txt et vous verrez le résultat final
- Faites le même raisonnement si on veut avoir le résultat "Avantage MacEnroe" ou "Egalite" ou encore "Quarante-Zero".

2-Documentation
-Cliquez sur le projet -->doc-->index1-->lancer l'un des fichier en faisaint un clique droit -->Open With puis web browser et
 vous aurez "file:///C:/Users/TOBORI/WorkspacePrimeFaces/JeuxTennis/doc/index-files/index-1.html"
