-- Insertar duenio
INSERT INTO duenio (dni, nombre) VALUES (1, 'NombreDuenio1');

-- Insertar mascota asociada al duenio
INSERT INTO mascota (numChip, nombreMascota, duenio_dni, tieneChip) 
VALUES (1, 'NombreMascota1', 1, true);
