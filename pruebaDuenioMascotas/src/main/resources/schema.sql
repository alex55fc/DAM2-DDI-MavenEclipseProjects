create table duenio(
	dni int NOT NULL ,
	nombre varchar(100) not null,
	PRIMARY KEY(dni)
);
-- Creación de la tabla mascota sin la restricción de clave foránea inicialmente
CREATE TABLE mascota (
    numChip INT NOT NULL,
    nombreMascota VARCHAR(100) NOT NULL,
    duenio_dni INT,
    tieneChip BOOLEAN,
    PRIMARY KEY (numChip)
);

-- Agregar la restricción de clave foránea después de haber creado la tabla duenio
ALTER TABLE mascota
ADD CONSTRAINT fk_duenio
FOREIGN KEY (duenio_dni) REFERENCES duenio(dni) ON DELETE CASCADE;
