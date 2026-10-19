# Examen básico de la unidad 1

## Instrucciones

- Crea un proyecto Java llamado `examen_ud1_nombreapellido` con un paquete `frigorificos`.
- Sigue la nomenclatura vista en el aula para las clases, objetos, métodos, etcétera. No hacerlo penalizará.
- Cada operación debe imprimir por pantalla lo que ocurre, como en los ejercicios de clase.
- Entrega el proyecto comprimido en .zip en la tarea de Moodle.
- No se corregirá ningún ejercicio que no llegue a ejecutarse.

## Parte 1: Frigorífico y compresor

Un Frigorifico tiene una marca, una temperatura en grados y un Compresor. Todo frigorífico nuevo empieza a 5 grados.

Un Compresor tiene una potencia en vatios y un número de horas de funcionamiento, que empieza siempre en cero. Por defecto, un compresor tiene 150 W de potencia, pero también puede crearse con una potencia distinta.

El frigorífico crea su propio compresor. Se puede crear un frigorífico indicando solo la marca (tendrá un compresor de 150 W) o indicando la marca y la potencia del compresor.

El frigorífico puede:

- **Enfriar**: baja la temperatura 1 grado y el compresor funciona 1 hora. También puede enfriar un número de grados "de golpe": por cada grado, la temperatura baja 1 y el compresor funciona 1 hora.
- **Abrir la puerta** un número de minutos: la temperatura sube 1 grado por cada minuto.
- **Recalibrarse**: la temperatura vuelve a 5 grados.
- **Devolver su consumo** en kWh, con decimales: potencia × horas de funcionamiento / 1000.

El resultado de imprimir un frigorífico es algo así como: `Balay - 4 grados - compresor de 200 W - consumo 0.8 kWh`.

Tú, como usuario, solo te comunicas con el frigorífico: es el frigorífico el que se comunica con el compresor.

## Parte 2: Clase principal

La clase Aplicacion pide al usuario, con Scanner, la marca de su frigorífico y la potencia del compresor. Después:

1. Crea un frigorífico con esa marca y potencia, y un segundo frigorífico Bosch con el compresor por defecto.
2. El primer frigorífico enfría 3 grados, se le abre la puerta 3 minutos y enfría 1 grado más.
3. Al frigorífico Bosch se le deja la puerta abierta 10 minutos y después enfría 4 grados.
4. Imprime los dos frigoríficos.
5. El frigorífico Bosch se recalibra y se vuelve a imprimir.

Si el usuario introduce `Balay` y `200`, la salida debe incluir, en este orden y entre los mensajes de cada operación, estas líneas:

```
Balay - 4 grados - compresor de 200 W - consumo 0.8 kWh
Bosch - 11 grados - compresor de 150 W - consumo 0.6 kWh
Bosch - 5 grados - compresor de 150 W - consumo 0.6 kWh
```

# Examen básico de la unidad 1 (modelo B)
 
## Instrucciones
 
* Crea un proyecto Java llamado `examen_ud1_nombreapellido` con un paquete `hornos`.
* Sigue la nomenclatura vista en el aula para las clases, objetos, métodos, etcétera. No hacerlo penalizará.
* Cada operación debe imprimir por pantalla lo que ocurre, como en los ejercicios de clase.
* Entrega el proyecto comprimido en .zip en la tarea de Moodle.
* No se corregirá ningún ejercicio que no llegue a ejecutarse.
## Parte 1: Horno y resistencia
 
Un `Horno` tiene una marca, una temperatura en grados y una `Resistencia`. Todo horno nuevo empieza a 20 grados.
 
Una `Resistencia` tiene una potencia en vatios y un número de minutos de funcionamiento, que empieza siempre en cero. Por defecto, una resistencia tiene 1200 W de potencia, pero también puede crearse con una potencia distinta.
 
El horno crea su propia resistencia. Se puede crear un horno indicando solo la marca (tendrá una resistencia de 1200 W) o indicando la marca y la potencia de la resistencia.
 
El horno puede:
 
* **Calentar:** sube la temperatura 10 grados y la resistencia funciona 5 minutos. También puede calentar varias veces "de golpe", indicando cuántas: cada vez sube 10 grados y la resistencia funciona 5 minutos.
* **Abrir la puerta** un número de minutos: la temperatura baja 15 grados por cada minuto.
* **Reiniciarse:** la temperatura vuelve a 20 grados.
* **Devolver su consumo** en kWh, con decimales: potencia × minutos de funcionamiento / 60000.
El resultado de imprimir un horno es algo así como: `Teka - 40 grados - resistencia de 1800 W - consumo 0.75 kWh`.
 
Tú, como usuario, solo te comunicas con el horno: es el horno el que se comunica con la resistencia.
 
## Parte 2: Clase principal
 
La clase `Aplicacion` pide al usuario, con `Scanner`, la marca de su horno y la potencia de la resistencia. Después:
 
1. Crea un horno con esa marca y potencia, y un segundo horno Siemens con la resistencia por defecto.
2. El primer horno calienta 4 veces, se le abre la puerta 2 minutos y calienta 1 vez más.
3. El horno Siemens calienta 6 veces y después se le abre la puerta 2 minutos.
4. Imprime los dos hornos.
5. El horno Siemens se reinicia y se vuelve a imprimir.
Si el usuario introduce `Teka` y `1800`, la salida debe incluir, en este orden y entre los mensajes de cada operación, estas líneas:
 
```
Teka - 40 grados - resistencia de 1800 W - consumo 0.75 kWh
Siemens - 50 grados - resistencia de 1200 W - consumo 0.6 kWh
Siemens - 20 grados - resistencia de 1200 W - consumo 0.6 kWh
```
 
