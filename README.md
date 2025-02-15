# Proyecto de Acceso a Datos usando Java, Hibernate y Maven.
Este proyecto es una aplicación Java que utiliza Hibernate ORM para la interacción con bases de datos. <br>
El proyecto está estructurado siguiendo los patrones de diseño DAO y Repositorio, los cuales han sido elegidos de manera que la aplicacion siga las mejores practicas para permitir una mayor legibilidad, escalabilidad y abstracción.
Ademas, tambien se ha buscado el uso de codigo limpio, usando librerias como Lombok.
<br><br>
## Estructura:

### 1. Interfaz del repositorio (IRepositorio.java):
Una interfaz genérica que define operaciones CRUD comunes ( count, deleteById, deleteAll, existsById, getById, findAll, save).
Esta interfaz es implementada por las clases del repositorio para administrar Cliente y Pedidos. <br>

### 2. Interfaces del repositorio (IRepositorioPedido.java y RepositorioHibernateCliente.java):
Estas 2 interfaces heredan las operaciones CRUD anteriores pero a su vez, sirven para definir otras operaciones especificas de Pedidos y de Clientes.


### 3. Implementación del repositorio Hibernate (RepositorioHibernateClienteImpl y RepositorioHibernatePedidosImpl):
Estas clases implementan la RepositorioHibernateCliente e IRepositorioPedido interfaz respectivamente, proporcionando implementaciones específicas para entidades Cliente y Pedidos
Utilizan sesiones de Hibernate para ejecutar consultas SQL, manejar transacciones y administrar las entidades en la base de datos.

### 4. Entidades (Cliente.java, Pedidos.java):
Las clases Cliente y Pedidos representan la estructura de datos de los clientes y pedidos en el sistema.
Estas entidades se asignan a las tablas de la base de datos mediante anotaciones de Hibernate.

### 5. Clase de configuracion (HibernateUtil.java):
Esta clase sirve como archivo de configuracion, en ella configuramos y manejamos todo lo relacionado con Hibernate y la conexion con la base de datos.

### 6. Clase Main (Main.java):
La clase main es utilizada para probar el correcto funcionamiento de la aplicación. En ella probaremos las diferentes operaciones CRUD tanto de clientes como pedidos y comprobaremos que funcionen correctamente.
