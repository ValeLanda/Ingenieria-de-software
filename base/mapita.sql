CREATE TABLE Usuario(
       idusuario serial NOT NULL,
       nombre text NOT NULL,
       correo text NOT NULL,
       contrasenia text NOT NULL,
       fechanacimiento date,
       PRIMARY KEY (idusuario));


CREATE TABLE Marcador(
       idmarcador serial NOT NULL,
       descripcion text NOT NULL,
       longitud double precision NOT NULL,
       latitud double precision NOT NULL,
       PRIMARY KEY (idmarcador),
       idusuario integer REFERENCES usuario(idusuario));
