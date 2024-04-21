# Java: aplicado a la Orientacion a Objetos

## __1-Modelando ScreenMatch__

### Para saber más: Almacenando objetos en memoria

En Java, los objetos se almacenan en una región de memoria llamada "heap". Cada objeto tiene una dirección única en esta región de memoria. Cuando imprimimos un objeto en pantalla, como este:
```
MiClase objeto = new MiClase();
System.out.println(objeto);
```
La salida suele ser algo como: MiClase@123a45b, donde 123a45b es una dirección de memoria única del objeto.

La razón por la que vemos esta dirección de memoria es que Java utiliza esta representación para identificar de manera única cada objeto. Esto es útil para varias cosas, como:

Identificación: Cada objeto debe tener una manera única de ser identificado en la memoria para que se pueda acceder y manipular de manera efectiva.

Comparación: La dirección de memoria es una forma de comparar si dos variables hacen referencia al mismo objeto.

Depuración: Puede ser útil para rastrear y depurar problemas en su código, ya que le permite saber cuál objeto específico está siendo referenciado.

En resumen, la dirección de memoria es una forma eficiente y única de identificar y gestionar objetos en Java, y por eso la vemos cuando imprimimos un objeto en pantalla.

### Para saber más: clases y objetos

Una clase es una estructura que define un tipo de objeto. La clase es como un molde que define las características (atributos) y comportamientos (métodos) que los objetos de ese tipo tendrán. Por ejemplo, podemos definir una clase llamada "Persona" que tenga los atributos "nombre" y "edad", además del método "cumplirAnhos()".

La sintaxis para definir esta clase en Java es la siguiente:
```
public class Persona {

    String nombre;
    int edad;
    
    void cumplirAnhos() {
      edad++;
    }

}
```
Por otro lado, un objeto es una instancia de una clase, y a través de él podemos representar información en la aplicación. La clase solo sirve para estandarizar los objetos, pero no para representar un objeto en sí. Para crear un objeto en Java, debemos usar la palabra clave "new" seguida del nombre de la clase y paréntesis vacíos. Por ejemplo, para crear un objeto del tipo "Persona", podemos escribir el siguiente código:
```
Persona persona1 = new Persona();
```
En este ejemplo, creamos un objeto a partir de la clase "Persona" y lo almacenamos en la variable "persona1" como una referencia. Como este objeto se creó como un objeto del tipo "Persona", tiene los atributos "nombre" y "edad", además del método "cumplirAnhos()". Es a través del objeto que podemos representar realmente a una persona, es decir, llenar los atributos y llamar a los métodos. Por ejemplo:
```
Persona persona1 = new Persona();

persona1.nombre = "Ana";
persona1.edad = 20;

System.out.println(persona1.nombre + " tiene " + persona1.edad + " años");

persona1.cumplirAnhos();

System.out.println("La edad ahora es: " + persona1.edad);
```
Podemos crear varios objetos del tipo "Persona", y todos ellos tendrán los mismos atributos y métodos, ya que son de la misma clase, pero cada uno puede tener información diferente. Por ejemplo:
```
Persona persona1 = new Persona();

persona1.nombre = "Ana";
persona1.edad = 20;

System.out.println(persona1.nombre + " tiene " + persona1.edad + " años");

persona1.cumplirAnhos();

System.out.println("La edad ahora es: " + persona1.edad);

Persona persona2 = new Persona();

persona2.nombre = "Carlos";
persona2.edad = 20;

System.out.println(persona2.nombre + " tiene " + persona2.edad + " años");

persona2.cumplirAnhos();

System.out.println("La edad ahora es: " + persona2.edad);
```


### Lo que aprendimos

En esta aula, has aprendido sobre:

* Qué es una clase, su estructura, cómo crearla y por qué es un concepto fundamental en la programación orientada a objetos.
* Qué son los atributos, es decir, las "características" de un objeto, y cómo definir y visualizar sus valores.
* Cómo instanciar objetos.
* Acerca de los métodos (o comportamientos) de un objeto.
* Cómo pensar en entidades del mundo real en forma de objetos, que poseen características (atributos) y comportamientos o acciones (métodos).


## __2-Controlando el acceso a la escritura de datos__

### Para saber más: modificadores de acceso

En Java, los modificadores de acceso son palabras clave que definen el nivel de visibilidad de las clases, atributos y métodos, y ayudan a garantizar la seguridad y el encapsulamiento del código.

Existen cuatro tipos de modificadores de acceso en Java: public, protected, private y default (también conocido como package-private).

__Public__

El modificador de acceso "public" es el más permisivo de todos. Una clase, atributo o método declarado como "public" puede ser accedido por cualquier clase en cualquier paquete. Es decir, tiene visibilidad pública y puede ser utilizado libremente. Por ejemplo:
```
public class Cuenta {

  public double saldo;

  public void retira(double valor) {
    // lógica del retiro...
  }
}
```
```
public class Principal {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.saldo = 300;
        c1.retirar(100);
    }

}
```
__Default (Paquete-privado)__

El modificador de acceso "default" es aquel que no especifica ningún modificador de acceso. Cuando no se especifica ningún modificador de acceso, la clase, atributo o método solo puede ser accedido por las clases que están en el mismo paquete. Por ejemplo:
```
package com.aluracursos.cuenta;

public class Cuenta {

  double saldo;

  retira(double valor) {
    // lógica del retiro...
  }
}
```
```
package com.aluracursos.tests;
public class Principal {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.saldo = 300;
        c1.retirar(100);
    }

}
```
En el código anterior, la clase "Cuenta" está en un paquete y la clase "Principal" en otro paquete diferente. La clase "Cuenta" puede ser instanciada dentro de la clase "Principal" porque tiene el modificador de acceso "public". Sin embargo, el atributo "saldo" y el método "retirar" tienen el modificador "default" y, por lo tanto, no pueden ser accedidos desde la clase "Principal", lo que causaría un error de compilación en el código anterior.

__Private__

El modificador de acceso "private" es el más restrictivo de todos. Una clase, atributo o método declarado como "private" solo puede ser accedido dentro de la propia clase. Es decir, tiene visibilidad restringida y no puede ser utilizado por otras clases. Por ejemplo:
```
public class Cuenta {

  private double saldo;

  private void retira(double valor) {
    // lógica del retiro...
  }
}
```
```
public class Principal {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.saldo = 300;
        c1.retirar(100);
    }

}
```
En el código anterior, se producirá un error de compilación en la clase Principal porque el atributo "saldo" y el método "retirar" se declararon como "private", lo que significa que no se puede acceder desde fuera de la propia clase Conta.

También existe otro modificador de acceso, que es "protected", pero hablaremos de él más adelante en el curso, después de presentar el concepto de herencia de clases.

### Para saber más: patrón de nombre de paquetes
PRÓXIMA ACTIVIDAD

En Java, los paquetes se utilizan para agrupar clases relacionadas a una funcionalidad específica. Ayudan a organizar el código, facilitando su gestión y evitando que cientos de clases diferentes se mezclen en un solo directorio.

La organización de clases dentro de un paquete puede hacerse mediante subpaquetes o colocando las clases directamente en el paquete, dependiendo de la complejidad del proyecto. Además, es importante seguir la convención de nomenclatura de paquetes para asegurarse de que los paquetes sean fácilmente identificables.

En cuanto a la nomenclatura de paquetes, otro aspecto importante es el uso del nombre de dominio inverso de la empresa u organización como parte del nombre del paquete. Por ejemplo, si el nombre de dominio de la empresa fuera "miempresa.com" y el proyecto Java se llamara "miproyecto", el nombre del paquete de dominio inverso sería "com.miempresa.miproyecto". Dentro de este paquete principal, podemos tener varios subpaquetes para una mejor organización del código del proyecto.

Esto ayuda a garantizar que el nombre del paquete sea único y evita conflictos de nombres con otros paquetes en otros proyectos. Además, el uso del nombre de dominio inverso como parte del nombre del paquete también ayuda a identificar fácilmente al propietario del proyecto Java.

### Para saber más: la palabra clave “this”

"this", traducido al español como "esto/este/esta", se utiliza para hacer referencia a los atributos de la clase, especialmente en métodos que tienen parámetros con el mismo nombre que el atributo de la clase en la que estamos trabajando.

Para comprender esta idea en la práctica, veamos un ejemplo:
```
public class Cuenta{ 
    private double saldo;
    private int numero;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}
```
Observa que en este primer ejemplo, dentro de la clase "Cuenta", tenemos los atributos "saldo" y "numero", y luego el método "deposita", que recibe como parámetro un "double valor". En este caso, no tenemos ningún atributo con el mismo nombre que el parámetro y estamos dentro de la clase, lo que nos permite usar el atributo "saldo" a voluntad, sin necesidad de usar "this".

Algo diferente ocurre cuando tenemos un atributo de la clase con el mismo nombre que un parámetro de algún método de esa misma clase:
```
public class Lampara{
    private boolean encendida;
    private String modelo;

    public void enciendeLaLampara(boolean encendida) {
       encendida= encendida;
    }
}
```
Observa que en este ejemplo, tenemos un atributo de la clase llamado "encendida", y el método "enciendeLaLampara" que establece un nuevo valor para este atributo.

El método recibe como parámetro un booleano que tiene el mismo nombre que el atributo de la clase. Ahí es donde surge el problema. ¿Cómo sabríamos cuál es el atributo de la clase y cuál es el parámetro del método?

En esta situación, usamos la palabra clave "this":
```
public class Lampara{
    private boolean encendida;
    private String modelo;

    public void enciendeLaLampara(boolean encendida) {
       this.encendida= encendida;
    }
}
```
Entonces, podemos concluir que "this" se refiere al objeto actual y no al parámetro del método. Es común usar "this" para eliminar la confusión entre los atributos y los parámetros, y este concepto no es exclusivo de Java, ya que otros lenguajes de programación orientados a objetos también tienen esta característica.

### Lo que aprendimos

En esta aula, has aprendido sobre:

* Encapsulación: controlar el acceso a los atributos y métodos de una clase.
* Qué son los modificadores de acceso public y private.
* Métodos de lectura de atributos, que son los métodos getters.
* Métodos de modificación de los atributos, que son los métodos setters.
* El uso de la palabra clave "import" para importar clases de otros paquetes.
* El uso de la palabra clave "this".
* Buenas prácticas para dividir el código en paquetes, siguiendo la convención de dominio de la empresa al revés, por ejemplo, "com.aluracursos.screenmatch".

## __3-Reaprobechando caracteristicas y compottamientos__

### Herencia

Al agregar un nuevo producto que utilizara los mismos comportamientos y mismos atributos y/o adicionales. Para no repetir codigo creamos una clase que contenga dichas caracteristicas, de la cual hereden sus caracteristicas las demas clases como pelicula, serie. class Titulo dicha clase la creamos dentro del paquete que creamos `com.aluracursos.screenmatch.modelos`. extendiento de la clase Titulo las demas clases:``` plublic class Pelicula extends Titulo```

### Mismo nombre diferente comportamiento

Al tretar de ver la duracion en minutos de una serie retorna 0 ya que el metodo retorna lo ingresado por el usuario, por lo que debemos definir un nuevo comportamiento para ese metodo dentro de la clase Serie donde mutiplicaremos las temporadas, los episodios y la duracion por episodio. Sobreescribiendo el metodo.

Pasando lo mismo con el metodo fichaTecnica de la clase madre, donde imprime dorectamente el atributo duracionEnMinutos, por lo que lo modificaremos para que utilice el metodo getDuracionEnMinutos el cual se utiliza en la clase Serie.

### Para saber más: entiendo mejor la herencia

La herencia es un concepto fundamental en la programación orientada a objetos y se implementa en Java a través de la relación "es un" entre clases. Esto significa que una clase puede heredar atributos y métodos de otra clase, lo que hace que el código sea más reutilizable.

En Java, la herencia se realiza utilizando la palabra clave "extends". La clase que se hereda se llama subclase y la clase que es heredada se llama superclase. La subclase puede acceder a todos los atributos y métodos públicos y protegidos de la superclase, además de poder sobrescribir los métodos de la superclase para crear comportamientos específicos.

Por ejemplo:
```
public class Cuenta {

  private String titular;
  private double saldo;

  public void retirar(double valor) {
    if (valor <= 0) {
      System.out.println("El valor debe ser mayor que cero");
    } else if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Retiro realizado com éxito. Saldo actual: " +saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito realizado com éxito. Saldo actual: " +saldo);
    } else {
      System.out.println("El valor debe ser mayor que cero");
    }
  }

  //getters y setters
}
```
```
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.getSaldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  public void retirar(double valor) {
    double tasaDeRetiro= 0.01;
    super.retirar(valor + tasaDeRetiro);
  }

  //getters y setters
}
```
En el código anterior, la clase Cuenta es la superclase y la clase CuentaAhorro es la subclase. La clase CuentaAhorro hereda los atributos y métodos de la clase Cuenta, y agrega un nuevo atributo tasaDeIntereses y un nuevo método calcularIntereses. Aunque los atributos son heredados, como se declararon como private en la superclase, no pueden ser accedidos directamente en la subclase, por lo que se deben utilizar los métodos getters/setters, que son públicos.

También observe en el código anterior que la subclase sobrescribe el método sacar para descontar la tarifa de retiro, además de usar la palabra clave super para llamar al método de la superclase, evitando duplicar un código ya existente. Esta es la gran ventaja de la herencia: la reutilización de código con la flexibilidad para sobrescribir comportamientos.

Herencia múltiple

En Java, es importante destacar que no se permite la herencia múltiple. La herencia múltiple ocurre cuando una subclase hereda de dos o más superclases.

Por ejemplo:
```
public class CuentaAhorro extends Cuenta, Pago{
  //codigo de la clase omitido
}
```
El código anterior no compila, ya que extends solo acepta una única clase, es decir, una clase puede tener solo una superclase.

Sin embargo, es posible crear una jerarquía de clases utilizando la herencia, simulando así la herencia múltiple.

Por ejemplo:
```
public class Cuenta{
  //codigo de la clase omitido
}
```
```
public class CuentaCorriente extends Cuenta{
 //codigo de la clase omitido
}
```
```
public class CuentaCorrientePersonaFisica extends  CuentaCorriente {
  //codigo de la clase omitido
}
```
En el código anterior, la clase CuentaCorrientePersonaFisica hereda de CuentaCorriente , que a su vez hereda de la clase Cuenta, es decir, indirectamente la clase CuentaCorrientePersonaFisica heredará de Cuenta, ya que su superclase hereda de ella.

### Para saber más: anotaciones en Java

Las anotaciones, también conocidas como "annotations" en inglés, son una forma de agregar configuraciones al código Java de manera muy sencilla. Se utilizan para proporcionar información adicional sobre el código, como el significado de una clase, un método o un atributo.

En Java, las anotaciones se definen utilizando el símbolo "@" seguido del nombre de la anotación. Por ejemplo, la anotación @Deprecated se utiliza para indicar que un método o clase está obsoleto y no debe utilizarse más. Otra anotación muy útil es @Override, como se mostró en el último video, que indica que un método está sobrescribiendo el mismo método definido en su clase padre.

Varias especificaciones y frameworks de Java, como Hibernate, Bean Validation y Spring, utilizan anotaciones. Por ejemplo, en Bean Validation, la anotación @NotNull se utiliza para validar que un atributo no sea nulo.

Las anotaciones son muy útiles y comunes en aplicaciones Java, por lo que es importante que estés familiarizado con este recurso, ya que seguramente lo utilizarás mucho en tus proyectos.

Si quieres conocer más sobre anotaciones en java consulta el siguiente artículo -> https://www.aluracursos.com/blog/crear-anotaciones-en-java


### Evitando codigo

Creamos un nuevo paquete en la carpeta `src` con el nombre: `com.aluracursos.screenmatch.calculos`, este paquete al igual que el creado para las clases Titulo,Pelicula,Serie,  `com.aluracursos.screenmatch.modelos` se acomodaron dentro de un paquete con el nombre `com.aluracursos.screenmatch`.

el paquete `calculos` contendra la clase `CalculadoraDeTiempo` el cual sumara el tiempo de todas las peliculas agregadas, mediante el metodo `incluye(Pelicula pelicula)`, pero esto no nos permitiria incluir series por lo que es mucho mejor que el metdodo acepte como parametro un objeto de la clase Titulo `incluye(Titulo titulo)` lo que permitiria agregar tanto peliculas como series o futuras clases que hereden de la superClase Titulo.

Esto es llmado polimorfismo lo que permite que objetos distintos de manera similar, siempre que compartan una caracteritica, en este caso ambas son clases que heredan de Titulo

### Para saber más: Polimorfismo en Java
PRÓXIMA ACTIVIDAD

El polimorfismo es un concepto fundamental de la programación orientada a objetos en Java que permite que objetos de diferentes clases se comporten de manera uniforme. Esto se logra a través de la capacidad de una clase para tomar varias formas o comportarse de diferentes maneras según el contexto. En Java, el polimorfismo se implementa principalmente mediante dos mecanismos: el polimorfismo de clases (herencia) y el polimorfismo de interfaces.

Polimorfismo de Clases (Herencia):

En el polimorfismo de clases, las subclases heredan comportamientos de su superclase. Cada subclase puede proporcionar su propia implementación de métodos heredados. Aquí tienes un ejemplo:
```
class Animal {
    void hacerSonido() {
        System.out.println("Hace un sonido genérico");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miMascota = new Perro();
        miMascota.hacerSonido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerSonido(); // Salida: El gato maulla
    }
}
```
Polimorfismo de Interfaces:

En el polimorfismo de interfaces, múltiples clases implementan la misma interfaz y proporcionan su propia implementación de los métodos definidos en la interfaz. Esto permite tratar objetos de diferentes clases de manera intercambiable. Aquí tienes un ejemplo:
```
interface Figura {
    double calcularArea();
}

class Circulo implements Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo implements Figura {
    double longitud, ancho;

    Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + figura1.calcularArea()); // Salida: Área del círculo: 78.54
        System.out.println("Área del rectángulo: " + figura2.calcularArea()); // Salida: Área del rectángulo: 12.0
    }
}
```
En estos ejemplos, el polimorfismo permite que objetos de diferentes clases sean tratados de manera uniforme, lo que promueve la flexibilidad y la reutilización del código.

Si quieres conocer más sobre Polimorfismo y orientación a objetos consulta el siguiente artículo: [POO: ¿Qué es la programación orientada a objetos?](https://www.aluracursos.com/blog/poo-que-es-la-programacion-orientada-a-objetos)

### Para saber más: el modificador protected

Al usar herencia en Java, tenemos la posibilidad de utilizar el modificador de acceso protected, que permite que los atributos de una clase sean accesibles por otras clases del mismo paquete y también por sus subclases, independientemente del paquete en el que se encuentren.

El modificador protected es útil en situaciones en las que una clase necesita permitir que sus subclases accedan directamente a sus atributos, sin la necesidad de restringir el acceso solo a través de los métodos getters y setters. Por ejemplo, supongamos que tenemos las siguientes clases en un proyecto:
```
public class Cuenta {

  private String titular;
  private double saldo;

  public void retirar(double valor) {
    //codigo omitido
    }

  public void depositar(double valor) {
//codigo omitido
     }

  //getters y setters
}
```
```
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.getSaldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  //getters y setters
}
```
En el código anterior, observe que en el método calcularIntereses de la clase CuentaAhorro, el atributo saldo no se accede directamente, ya que se declaró como private en la clase Cuenta, por lo que su acceso debe realizarse mediante el método getSaldo().

Podemos declarar el atributo saldo como protected para evitar esta situación y permitir el acceso directo a él desde las clases que heredan de la clase Cuenta:
```
public class Cuenta {

  private String titular;
  protected double saldo;

  public void retirar(double valor) {
    //codigo omitido
    }

  public void depositar(double valor) {
//codigo omitido
     }

  //getters y setters
}
```
```
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.saldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  //getters y setters
}
```
Observe que ahora el atributo saldo se accede directamente desde la clase CuentaAhorro.

### Lo que aprendimos

En esta aula, has aprendido sobre:

* El problema de tener código duplicado en varias clases y cómo utilizar la herencia como solución.
* La palabra clave extends, que se utiliza para indicar que una clase hereda de otra.
* Cómo sobrescribir un método heredado, con la opción de usar la anotación @Override.
* Cómo aplicar el concepto de polimorfismo en el código para evitar duplicación de métodos.


## __4-Aplicando comportamientos en comun__

### Incluyendo comportamientos adicionales

crearemos una nueva clase Episodio con con propiedades: nombre, numero, serie; en el paquete modelos. Luego una interface Clasificable con un metodo getClasificacion(), para poder implementar es varias de las instancias de los modelos. Esto nos permite implementar un mismo metodo modificando el comportamiento a nuestras necesidades, en distintas clases sin necesidad de heredar de la misma.

```
public interface Clasificable {

    int getClasificacion();
}
```
```
public class Pelicula extends Titulo implements Clasificable{
  .....
  @Override
    public int getClasificacion() {
        return (int) calculaMedia();
    }
}
```

### Clasificando Episodios y Peliculas

Implementamos el metodo getClasificacion en Episodio
```
public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalDeVisualizaciones;
....
@Override
    public int getClasificacion() {
        if (totalDeVisualizaciones > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
```
y creamos una nueva clase FiltroRecomendacion dentro del paquete calculos para filtrar los titulos por casificacion:
```
public class FiltroRecomendacion {

    public void filtra (Clasificable clasificacion) {
        if (clasificacion.getClasificacion()>=4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >=2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlos despues");
        }
    }
}
```
Al pasar como parametro un objeto Clasificable, hace referencia a cualquier objeto que este implementando dicha interface.

```
FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
filtroRecomendacion.filtra(miPelicula);
filtroRecomendacion.filtra(episodio);

```

### Para saber más: entendiendo mejor las interfaces

En Java, las interfaces son una forma de definir un contrato que las clases deben seguir, especificando qué métodos deben ser implementados por las clases que las utilicen. Las interfaces permiten que diferentes clases se puedan tratar de manera estandarizada mediante el polimorfismo, lo que hace que el código sea fácil de extender con nuevos comportamientos.

En Java, una interfaz se define utilizando la palabra clave "interface". Por ejemplo:
```
public interface Tributable {

    double getValorImpuesto();

}
```
En el ejemplo de código anterior, estamos definiendo una interfaz llamada "Tributable" que contiene un único método llamado "getValorImpuesto()" que devuelve un valor de tipo "double". Cualquier clase que quiera ser tributable en el proyecto puede implementar esta interfaz.

Para implementar una interfaz, se utiliza la palabra clave "implements" después de la definición de la clase. La clase que implementa la interfaz debe proporcionar implementaciones para todos los métodos definidos en la interfaz.

Por ejemplo:
```
public class Producto implements Tributable{

    private String nombre;
    private double valor;

    @Override
    public double getValorImpuesto() {
        return this.valor * 0.1;
    }

    //getters y setters
}
```
En el ejemplo anterior, estamos creando una clase llamada "Producto" que implementa la interfaz "Tributable". Esta clase proporciona una implementación del método "getValorImpuesto()" que está definido en la interfaz "Tributable". La implementación calcula el impuesto como el 10% del valor del producto.

También podríamos tener una clase de servicio, como se muestra a continuación:
```
public class Servicio implements Tributable{

    private String descripcion;
    private double valor;
    private double cuotaJubilacion;

    @Override
    public double getValorImpuesto() {
        return this.valor * this.cuotaJubilacion / 100;
    }

    //getters y setters
}
```
En el ejemplo anterior, estamos creando una clase llamada "Servicio" que también implementa la interfaz "Tributable". Esta clase proporciona una implementación del método "getValorImpuesto()" que calcula el impuesto como el valor multiplicado por la cuota de Jubilacion dividido por 100.

Uso de interfaces:

Las interfaces se pueden utilizar para definir comportamientos que se pueden aplicar a diferentes clases, lo que hace que el código sea más modular y fácil de mantener. Por ejemplo, supongamos que tenemos un sistema de ventas que necesita calcular el impuesto de diferentes tipos de productos. Podemos crear la interfaz "Tributable" para definir el comportamiento de cálculo de impuestos y luego crear varias clases diferentes que implementen esta interfaz para calcular el impuesto de diferentes productos.

Por ejemplo:
```
public class CalculadoraImpuestos {

    private double totalImpuesto = 0;

    public void calcularImpuesto(Tributable item) {
        this.totalImpuesto += item.getValorImpuesto();
    }

    public double getTotalImpuesto() {
      return this.totalImpuesto;
    }

}
```
En este ejemplo, estamos creando una clase llamada "CalculadoraImpuesto" que tiene un atributo privado llamado "totalImpuesto" para almacenar el valor total de los impuestos. El método "calcularImpuesto" recibe un parámetro de tipo "Tributable". Al declarar una variable con el tipo de una interfaz, como se hace en este método, podemos asignarle cualquier objeto que implemente esa interfaz, ya sea un objeto de tipo "Servicio" o "Producto". En ambos casos, la "CalculadoraImpuesto" llamará al método implementado en la clase específica. Esto es muy útil cuando queremos tratar varios objetos de clases diferentes de manera similar, lo que facilita el mantenimiento y la extensión del código. Este es otro ejemplo de la aplicación del polimorfismo en Java, pero ahora con el uso de interfaces.

### Lo que aprendimos

En esta aula, has aprendido:

* Que en Java, una clase puede heredar de solo una clase.
* El concepto de interfaces en Java.
* Que en una interfaz, todos los métodos son públicos, por lo que no es necesario usar la palabra reservada "public" en sus declaraciones.
* Que también es posible aplicar el polimorfismo mediante el uso de interfaces, de manera similar a lo que se demostró con la herencia en lecciones anteriores.

## __5-Consolidando conocimientos__

### Desafío: construyendo una nueva aplicación

Hola, ¿cómo estás? ¿Te gustó el contenido presentado en el curso?

En esta lección, me gustaría proponer un nuevo desafío para que puedas consolidar tus conocimientos y utilizar la mayoría de los conceptos y recursos vistos a lo largo del curso. Comprender profundamente la programación orientada a objetos te permitirá construir aplicaciones más robustas que también sean más fáciles de mantener y modificar con el tiempo.

La propuesta es crear una nueva aplicación diferente a ScreenMatch, para que tengas la oportunidad de practicar y profundizar tus comprensiones de los conceptos de abstracción, herencia, encapsulamiento y polimorfismo.
