-- create table etudiant(
--     id_etudiant int,
--     nom_etudiant varchar(40)
-- );
psql -U postgres -d culture

create table user(
    id_user int primary key,
    nom_user varchar(100),
    mdp varchar(100)
);

create table culture(
    id_culture int primary key,
    nom_culture varchar(100),
    unite float,
    prix_culture float
);
insert into culture(id_culture,nom_culture,unite,prix_culture) values(1,'Mais',1,2000);
insert into culture(id_culture,nom_culture,unite,prix_culture) values(2,'Riz',1,3000);
insert into culture(id_culture,nom_culture,unite,prix_culture) values(3,'Patate douce',1,1500);


create table parcelle(
    id_parcelle int primary key,
    nom_parcelle varchar(100),
    surface_parcelle float,
    id_culture int,
    foreign key (id_culture) references culture(id_culture)
);

create table terrain(
    id_terrain int primary key,
    nom_terrain varchar(100),
    surface_terrain float,
    prix_terrain float,
    id_parcelle int,
    foreign key (id_parcelle) references parcelle(id_parcelle)
);