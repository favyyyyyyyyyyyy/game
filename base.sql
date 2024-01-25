create table utilisateur(
    id_utilisateur serial primary key,
    nom_utilisateur varchar(100),
    mdp varchar(100),
    privilege INT
);
insert into utilisateur(nom_utilisateur,mdp,privilege) values('admin','admin',1);

create table culture(
    id_culture serial primary key,
    nom_culture varchar(100),
    prix_culture float
);
insert into culture(nom_culture,unite,prix_culture) values('Mais',2000);
insert into culture(nom_culture,unite,prix_culture) values('Riz',3000);
insert into culture(nom_culture,unite,prix_culture) values('Patate douce',1500);


create table parcelle(
    id_parcelle serial primary key,
    nom_parcelle varchar(100),
    surface_parcelle float,
    id_culture int,
    foreign key (id_culture) references culture(id_culture)
);

create table terrain(
    id_terrain serial primary key,
    nom_terrain varchar(100),
    surface_terrain float,
    prix_terrain float,
    id_parcelle int,
    id_utilisateur int ,
    etat_terrain int,
    foreign key (id_utilisateur) references utilisateur(id_utilisateur),
    foreign key (id_parcelle) references parcelle(id_parcelle)
);
-- 1 CREE PAR UTILISATEUR
-- 10 VALIDER PAR ADMIN

-- create table proprietaire(
--     id_proprietaire serial primary key,
--     id_utilisateur int,
--     id_terrain int,
--     foreign key (id_utilisateur) references utilisateur(id_utilisateur),
--     foreign key (id_terrain) references terrain(id_terrain)
-- );

CREATE OR REPLACE VIEW terrainNonValider AS 
SELECT terrain.id_terrain AS ID,
terrain.nom_terrain AS Nom,
terrain.surface_terrain AS Surface,
utilisateur.nom_utilisateur AS Proprietaire
FROM terrain
JOIN utilisateur ON utilisateur.id_utilisateur = terrain.id_utilisateur 
WHERE terrain.etat_terrain > 9 ;


create or replace view vparcelle as
select id_parcelle, nom_parcelle, surface_parcelle, culture.id_culture, nom_culture, unite, prix_culture from parcelle
join culture on culture.id_culture=parcelle.id_culture;

-- create or replace view vproprietaire as
-- select id_proprietaire,utilisateur.id_utilisateur,nom_utilisateur,terrain.id_terrain,nom_terrain,prix_terrain,id_parcelle,etat_terrain
-- from proprietaire
-- join utilisateur on proprietaire.id_utilisateur=utilisateur.id_utilisateur
-- join terrain on proprietaire.id_terrain=terrain.id_terrain;

create or replace view vproprietaire as
select id_utilisateur,nom_utilisateur,id_terrain,nom_terrain,surface_terrain,prix_terrain,etat_terrain from terrain
join utilisateur on terrain.id_utilisateur=utilisateur.id_utilisateur
join parcelle on terrain.id_parcelle=parcelle.id_parcelle;

select * from vparcelle where nom_culture='Mais';