-- create table etudiant(
--     id_etudiant int,
--     nom_etudiant varchar(40)
-- );
psql -U postgres -d culture

create table utilisateur(
    id_utilisateur serial primary key,
    nom_utilisateur varchar(100),
    mdp varchar(100),
    privilege INT
);

create table culture(
    id_culture serial primary key,
    nom_culture varchar(100),
    unite float,
    prix_culture float
);
insert into culture(nom_culture,unite,prix_culture) values('Mais',1,2000);
insert into culture(nom_culture,unite,prix_culture) values('Riz',1,3000);
insert into culture(nom_culture,unite,prix_culture) values('Patate douce',1,1500);


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
    foreign key (id_parcelle) references parcelle(id_parcelle)
);

create table proprietaire(
    id_proprietaire serial primary key,
    id_utilisateur int,
    id_terrain int,
    foreign key (id_utilisateur) references utilisateur(id_utilisateur),
    foreign key (id_terrain) references terrain(id_terrain)
);

create or replace view vparcelle as
select id_parcelle, nom_parcelle, surface_parcelle, culture.id_culture, nom_culture, unite, prix_culture from parcelle
join culture on culture.id_culture=parcelle.id_culture;

