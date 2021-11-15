# Programacion de Servicios y Procesos

## Filosofos Comensales
### Descripción 📝 :
Clásico problema de los Filosofos Comensales hecho en Java 11.<br />
### Enunciado:<br />

Cinco filósofos se sientan alrededor de una mesa y pasan su vida cenando y <br />
pensando. Cada filósofo tiene un plato de fideos y un tenedor a la izquierda de <br />
su plato. <br />
* Para comer los fideos son necesarios dos tenedores y cada filósofo sólo puede <br />
tomar los que están a su izquierda y derecha. Si cualquier filósofo toma un <br />
tenedor y el otro está ocupado, se quedará esperando, con el tenedor en la <br />
mano, hasta que pueda tomar el otro tenedor, para luego empezar a comer.<br /><br />
* Si dos filósofos adyacentes intentan tomar el mismo tenedor a una vez, se <br />
produce una condición de carrera: ambos compiten por tomar el mismo tenedor, <br />
y uno de ellos se queda sin comer.<br /><br />
* Si todos los filósofos toman el tenedor que está a su derecha al mismo tiempo, <br />
entonces todos se quedarán esperando eternamente, porque alguien debe <br />
liberar el tenedor que les falta. Nadie lo hará porque todos se encuentran en la <br />
misma situación (esperando que alguno deje sus tenedores). Entonces los <br />
filósofos se morirán de hambre. Este bloqueo mutuo se denomina <br />
interbloqueo o deadlock.<br /><br />
* El problema consiste en encontrar un algoritmo que permita que los filósofos <br />
nunca se mueran de hambre.<br />



### Mas info :<br />
https://es.wikipedia.org/wiki/Problema_de_la_cena_de_los_fil%C3%B3sofos

## Autor ✍🏻 :

* Dylan Hurtado López hecho en IntelliJ IDE
