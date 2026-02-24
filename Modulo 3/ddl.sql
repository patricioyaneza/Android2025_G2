

CREATE TABLE Categoria2 (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);
-- ELIMINAR OBJETOS DE UNA BASE DE DATOS
DROP TABLE categoria2;

-- Permite modificar una tabla
ALTER TABLE categoria2 modify nombre varchar(200);
ALTER TABLE categoria2 ADD descripcion varchar(1000) not null;

-- ver restricciones
show index From categoria2;
-- eliminar la restriccion unique (tiene como nombre "nombre")
ALTER TABLE categoria2 DROP index nombre;
-- agregar restriccion
ALTER TABLE categoria2 ADD constraint nombreUnico unique(nombre); 


select * from categoria, marca;

INSERT INTO Producto (nombre, descripcion, precio, stock, id_categoria, id_marca) VALUES
('Coca-Cola 600ml', 'Refresco 600ml', 18, 150, 3, 7),
('Pepsi 600ml', 'Refresco 600ml', 17, 120, 4, 7)