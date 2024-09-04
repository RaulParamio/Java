Este proyecto es una aplicación Java que utiliza Hibernate ORM para la interacción con bases de datos. El proyecto está organizado en varias clases e interfaces que administran datos de clientes y pedidos
Estructura:
1. Interfaz del repositorio (IRepositorio.java)
Una interfaz genérica que define operaciones CRUD comunes ( count, deleteById, deleteAll, existsById, getById, findAll, save).
Esta interfaz es implementada por las clases del repositorio para administrar Cliente y Pedidos.

2. Implementación del repositorio Hibernate (RepositorioHibernateClienteImpl y RepositorioHibernatePedidosImpl)
Estas clases implementan la IRepositorio interfaz, proporcionando implementaciones específicas para entidades Cliente y Pedidos
Utilizan sesiones de Hibernate para ejecutar consultas SQL, manejar transacciones y administrar las entidades en la base de datos.

3. Entidades (Cliente.java, Pedidos.java)
Las clases Cliente y Pedidos representan la estructura de datos de los clientes y pedidos en el sistema.
Estas entidades se asignan a las tablas de la base de datos mediante anotaciones de Hibernate.
