CREATE TABLE Usuario (
user_id 			INT AUTO_INCREMENT PRIMARY KEY,
nombre 				VARCHAR(100) NOT NULL,
correo_electronico 	VARCHAR(150) UNIQUE,
contraseña 			VARCHAR(150) NOT NULL,
saldo 				INT DEFAULT 0,
fecha_de_creacion 	DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE transactions (
transactionId 		INT AUTO_INCREMENT PRIMARY KEY,
sender_userId 		INT NOT NULL,
receiver_userId 	INT NOT NULL, 
transactionMonto 	INT,
transactionDate 	DATETIME DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (sender_userID) REFERENCES Usuario(user_id),
FOREIGN KEY (receiver_userId) REFERENCES Usuario(user_id)
);

CREATE TABLE moneda (
currency_id			INT AUTO_INCREMENT PRIMARY KEY,
currency_name		VARCHAR(100) NOT NULL,
currency_symbol		VARCHAR(10) NOT NULL
);


INSERT INTO Moneda (currency_name, currency_symbol) values 
('Peso Argentino','ARS'),
('Peso Chileno', 'CLP'),
('Dólar Estadounidense','USD');


INSERT INTO usuario (nombre, correo_electronico,contraseña) values
('Francisco','jaime.panes64@todo.cl','Hola156'),
('Martina','martina.panes64@todo.cl','Hola156'),
('Julián Terzariol','juliterz@gmial.com','123123123'),
('Maria Edith Vega','maruvega_78@uol.es','secretosecreto'),
('Ricardo Díaz Krapawicz','el_polaco_krapa@ministeriosalud.gob','apomfeaei2123!...ASDFASD');

select * from usuario;

INSERT INTO transactions (sender_userId,receiver_userId,transactionMonto) values (1,3,1500);
INSERT INTO transactions (sender_userId,receiver_userId,transactionMonto) values (2,3,1500);
INSERT INTO transactions (sender_userId,receiver_userId,transactionMonto) values (3,1,1500);
INSERT INTO transactions (sender_userId,receiver_userId,transactionMonto) values
(1,3,250),
(1,3,250),
(2,3,250),
(3,2,300),
(3,1,250);


select * from transactions

-- mostrar los usuarios que enviaron  y recepcionaron dineros, mostrar fecha en formato nacional