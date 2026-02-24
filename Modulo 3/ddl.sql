

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
INSERT INTO Categoria VALUES (1,'Bebidas'), (2,'Snacks'),(3,'Lácteos'),(4,'Limpieza'),(5,'Abarrotes');
INSERT INTO Marca VALUES (1,'Coca-Cola'), (2,'Pepsi'), (3,'Bimbo'), (4,'Lala'),(5,'La Costeña'),(6,'Cloralex');

INSERT INTO Producto (nombre, descripcion, precio, stock, id_categoria, id_marca) VALUES
('Coca-Cola 600ml', 'Refresco 600ml', 18, 150, 1, 1),
('Pepsi 600ml', 'Refresco 600ml', 17, 120, 1, 2),
('Jugo de Naranja 1L', 'Jugo natural', 22, 80, 1, 2),
('Pan Blanco Bimbo', 'Pan grande', 42, 60, 2, 3);