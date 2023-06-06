## JPA - Java Persistence API
JPA es un ORM (Object Relational Mapping) que tiene como objetivo lograr la persistencia de datos entre una aplicación desarrollada en java y una Base De Datos.

JPA busca traducir el modelado de las clases Java a un modelado relacional en una base de datos, posibilitando al programador elegir que clases u objetos quiere persistir.

JPA se vale de una serie de mapeos que se deben realizar sobre cada uno de los elementos de una clase, los mismos, se representan mediante annotations(@).

## Flujo de JPA
JPA cuenta con provedores de JPA, entre ellos: Eclipselink, Hibernate, Toplink, entre otros.
Aplicación Java -> JPA + Provedor de JPA -> DB

Dato: Hibernate es un provedor de JPA.

Resumen:
Es un intermediario que nos permite comunicar nuestra aplicación java con nuestra base de datos haciendo mapeos mediante annotations para determinar que partes de nuestras clases que tengamos armadas en nuestro modelo de datos puedan traducirse a lo que es el modelo de una base de datos.
Nuestras clases se transformaran en entidades en la base de datos.

Unidades de persistencia: Representan una configuración de la capa de persistencia. Una unidad de persistencia se define en un archivo persistence.xml y especifica la conexión a la base de datos, las entidades gestionadas y otras configuraciones.

## ¿QUE ES ORM?
Es una tecnica utilizada para convertir clases de un sistema que utiliza un lenguaje de programación orientado a objetos a el modelado de una base de datos relacional.
Esto se logra mediante una serie de indicaciones que se realizando utilizando "@annotations".

Algunas de las anotaciones mas usadas son:

* @Entity: Especifica la creación de una entidad, se coloca al inicio de una clase.
* @ld: Primary key de la entidad
* @GeneratedValue(strategy = GenerationType.SEQUENCE): Establece que la ID se va a generar de forma automática y secuencial.
    + @Basic: Para hacer referencia atributos comunes.
* @Temporal: Se usa normalmente en fechas. 
    + Si se quiere tener en cuenta la hora se utiliza: @Temporal(TemporalType.TIMESTAMP)
    + Si solo se tiene en cuenta la fecha (DATE): @Temporal(TemporalType.DATE)
* @OneToMany: Indicar una relación unidireccional de 1 a n.
* @OneToOne: Indicar una relación de 1 a 1.
* @ManyToMany: Indicar una relación n a n.

## JPA controller
Es el encargado de leer todos los mapeos que hacemos en cada una de nuestras clases y reflejarlos en la base de datos.
Toma las clases en java y las convierte a una entidad (tabla) en BD

