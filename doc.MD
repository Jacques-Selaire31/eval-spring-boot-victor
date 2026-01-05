1/ Ajouter un produit avec la méthode HTTP correspondante, son url, son body (avec exemple de JSON en entrée, valide et non valide)

POST http://localhost:9000/produit

Produit valide : 

entrée : 

{
  "nom": "Souris",
  "prix": 29.99,
  "categorie": {
    "id": 1,
    "libele": "PC"
  }
}

response : 

{
    "categorie": {
        "id": 1,
        "libele": "PC"
    },
    "id": 1,
    "nom": "Souris",
    "prix": 29.99
}

Produit non valide

entrée :

{
  "nom": "Souris",
  "prix": 29.99,
  "categorie": {
    "id": 1,
    "libele": "PC"
  }
}

response :

{
    "Error": "Le produit avec le nom suivant : Souris existe déjà"
}


2/ Afficher tous les produits 
GET http://localhost:9000/produits

response : 

[
    {
        "categorie": {
            "id": 1,
            "libele": "PC"
        },
        "id": 1,
        "nom": "Souris",
        "prix": 29.99
    },
    {
        "categorie": {
            "id": 3,
            "libele": "Papeterie"
        },
        "id": 2,
        "nom": "Stylo",
        "prix": 1.99
    },
    {
        "categorie": {
            "id": 2,
            "libele": "Jardin"
        },
        "id": 3,
        "nom": "Pioche",
        "prix": 11.99
    }
]


3/ Afficher une categorie par son ID avec la méthode HTTP correspondante, son url.

GET http://localhost:9000/categorie/1

response : 

{
    "id": 1,
    "libele": "PC"
}