#Comienzo con la creacion de un nuevo SCHEMA, en el cual voy a desarrollar el correspodiente TP
CREATE SCHEMA Sistema_contable;
#Accedo al SCHEMA creado:
USE Sistema_contable;

#Creacion de tablas y defino claves primarias(PK):
CREATE TABLE CLIENTES (
    cuit INT PRIMARY KEY NOT NULL,
    razon_social VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    direccion VARCHAR(255),
    contribuyente VARCHAR(50) NOT NULL,
    inicio_actividad DATE NOT NULL
);

CREATE TABLE OBLIGACIONTRIBUTARIA (
    id_obligacion INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    cuit INT
);

CREATE TABLE USUARIOS (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    rol VARCHAR(50) NOT NULL
);

CREATE TABLE ACTIVIDADES (
    id_actividad INT PRIMARY KEY AUTO_INCREMENT,
    codigo int NOT NULL, 
    descripcion VARCHAR(255),
    cuit INT
);

CREATE TABLE PERIODOS (
    id_periodo INT PRIMARY KEY AUTO_INCREMENT,
    #Verifico que los periodos sean de enero a diciembre
    mes INT NOT NULL CHECK (mes BETWEEN 1 AND 12),
    anio INT NOT NULL,
    fecha_vencimiento DATE NOT NULL,
    fecha_vencimiento_anual BOOLEAN DEFAULT TRUE,
    ID_obligacion INT
);

CREATE TABLE CONTROLDENOTIFICACIONES (
    id_notificacion INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
    cuit INT NOT NULL,
    obligacion VARCHAR(50),
    fecha_envio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado VARCHAR(255),
    mensaje VARCHAR(255)
);
#Continuo añadiendo las claves foraneas(FK):
#OBLIGACIONTRIBUTARIA
ALTER TABLE OBLIGACIONTRIBUTARIA ADD CONSTRAINT FK_OBLIGACIONTRIBUTARIA_CLIENTES FOREIGN KEY (cuit) REFERENCES CLIENTES(cuit);
#CONTROLDENOTIFICACIONES
ALTER TABLE CONTROLDENOTIFICACIONES ADD CONSTRAINT FK_CONTROLDENOTIFICACIONES_CLIENTES FOREIGN KEY (cuit) REFERENCES CLIENTES(cuit);
#ACTIVIDADES
ALTER TABLE ACTIVIDADES ADD CONSTRAINT FK_ACTIVIDADES_CLIENTES FOREIGN KEY (cuit) REFERENCES CLIENTES(cuit);
#PERIODOS
ALTER TABLE PERIODOS ADD CONSTRAINT FK_PERIODOS_OBLIGACIONTRIBUTARIA FOREIGN KEY (id_obligacion) REFERENCES OBLIGACIONTRIBUTARIA(id_obligacion);

#Inserción, consulta y borrado de registros:
#INSERCION:
#CLIENTES:
INSERT INTO CLIENTES (cuit, razon_social, email, direccion, contribuyente, inicio_actividad) VALUES
(1,'Juan Carlos SRL', 'JC@gmail.com', 'Las flores', 'Responsable Inscripto','2001-10-05'),
(2,'Ramon Dominguez SA', 'RD@gmail.com', '9 de Julio', 'Responsable Inscripto','1990-01-05'),
(3,'Marcos Sanchez SRL', 'MS@gmail.com', '3 de Febrero', 'Monotributo','1980-08-25');
#SELECT * FROM CLIENTES;
#Fuerzo error para verificar la correcta funcionalidad
INSERT INTO CLIENTES (cuit, razon_social, email, direccion, contribuyente, inicio_actividad) VALUES
(1,'Test', 'Test@gmail.com', 'Test', 'Test','2001-10-05');

#ACTIVIDADES:
INSERT INTO ACTIVIDADES (codigo, descripcion, cuit) VALUES
(464112, 'Venta al por mayor de artículos de mercería', 1),
(464121, 'Venta al por mayor de prendas de vestir de cuero',2),
(464211,'Venta al por mayor de libros y publicaciones',3);
#SELECT * FROM ACTIVIDADES;

#OBLIGACIONTRIBUTARIA:
INSERT INTO OBLIGACIONTRIBUTARIA (nombre, descripcion, cuit) VALUES
('IIBB', 'Ingresos Brutos', 1),
('IVA', 'Impuesto al Valor Agregado',2),
('SEH', 'Seguridad e Higiene',3);
#SELECT * FROM OBLIGACIONTRIBUTARIA;

#PERIODOS
INSERT INTO PERIODOS (mes, anio, fecha_vencimiento, ID_obligacion) VALUES
(1,2025, '2025-02-17',1),
(2,2025, '2025-03-17',1),
(1,2025, '2025-04-17',2),
(2,2025, '2025-02-20',2),
(1,2025, '2025-03-20',3),
(2,2025, '2025-04-20',3);
#SELECT * FROM PERIODOS;

#CONSULTA
#CASO 1: Se desean visualizar la cuit, razon social y la descripcion de obligaciones de todos los clientes:
SELECT 
c.cuit, 
c.razon_social,
ob.descripcion
FROM CLIENTES AS c INNER JOIN OBLIGACIONTRIBUTARIA AS ob;

#CASO 2: Se desea visualizar los vencimientos de los periodos de la obligacion tributaria "IIBB":
SELECT 
ob.nombre,
p.mes,
p.anio,
p.fecha_vencimiento
FROM OBLIGACIONTRIBUTARIA AS ob INNER JOIN PERIODOS AS p WHERE ob.id_obligacion=p.id_obligacion AND ob.nombre='IIBB';

#CASO 3: Se desean vusualizar todos los vencimientos futuros del cliente 'Juan Carlos SRL'
SELECT 
c.razon_social, 
ob.nombre,
p.mes AS 'Periodo',
p.fecha_vencimiento
FROM CLIENTES AS c, OBLIGACIONTRIBUTARIA AS ob, PERIODOS AS p 
WHERE c.razon_social='Juan Carlos SRL';

#BORRADO
DELETE FROM CONTROLDENOTIFICACIONES;
DELETE FROM OBLIGACIONTRIBUTARIA;
DELETE FROM PERIODOS;
DELETE FROM CLIENTES;
DELETE FROM ACTIVIDADES;