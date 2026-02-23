CREATE TABLE Categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);
SELECT * FROM categoria;
-- DROP TABLE categoria;

-- PARA AGREGAR COLUMNA
ALTER TABLE categoria ADD descripcion varchar(200) NOT NULL;

-- MODIFICAR CAPACIDAD DE CARACTERES A NOMBRE. PUEDE AFECTAR LOS DATOS GUARDADOS EN LA TABLA
ALTER TABLE categoria modify nombre varchar(100);
insert into categoria values (null,'12345678901234567890', 'fasdfasdfasdfasdfasdf');

-- VER RESTRICCIONES
SHOW INDEX FROM categoria;
-- eliminar restriccion unica
alter table categoria drop index nombre;
--  agregar restriccion unica con nombre personalizado
alter table categoria add constraint nombreUnico  unique(nombre);


-- creacion de vista
delete from marca;
INSERT INTO Categoria VALUES (1,'Bebidas',''), (2,'Snacks',''),(3,'Lácteos',''),(4,'Limpieza',''),(5,'Abarrotes','');
INSERT INTO Marca VALUES (1,'Coca-Cola',''), (2,'Pepsi',''), (3,'Bimbo',''), (4,'Lala',''),(5,'La Costeña',''),(6,'Cloralex','');

INSERT INTO Producto (nombre, descripcion, precio, stock, id_categoria, id_marca) VALUES
('Coca-Cola 600ml', 'Refresco 600ml', 18, 150, 1, 1),
('Pepsi 600ml', 'Refresco 600ml', 17, 120, 1, 2),
('Jugo de Naranja 1L', 'Jugo natural', 22, 80, 1, 2),
('Pan Blanco Bimbo', 'Pan grande', 42, 60, 2, 3),
('Pan Integral Bimbo', 'Pan integral', 45, 50, 2, 3),
('Sabritas Original', 'Papas fritas', 16, 200, 2, 2),
('Leche Entera 1L', 'Leche entera', 25, 100, 3, 4),
('Yogurt Fresa', 'Yogurt 500g', 18, 90, 3, 4),
('Queso Panela', 'Queso fresco', 55, 40, 3, 4),
('Cloro 1L', 'Desinfectante', 20, 70, 4, 6),
('Detergente 1kg', 'Detergente en polvo', 35, 65, 4, 6),
('Frijoles Enlatados', 'Frijoles 400g', 14, 150, 5, 5),
('Atún Enlatado', 'Atún 140g', 19.00, 130, 5, 5),
('Arroz 1kg', 'Arroz blanco', 28.00, 110, 5, 5),
('Azúcar 1kg', 'Azúcar refinada', 24, 95, 5, 5);


create view v_productos AS
select c.nombre Categoria, m.nombre Marca,p.id_producto, p.nombre, p.descripcion, p.stock, p.precio
from producto p
inner join categoria c on c.id_categoria = p.id_categoria
inner join marca m on m.id_marca= p.id_marca;

select * from v_productos;