# Programacion de Servicios y Procesos

## Filosofos Comensales
### Descripci贸n 馃摑 :
Cl谩sico problema de los Filosofos Comensales hecho en Java 11.<br />
### Enunciado:<br />

Cinco fil贸sofos se sientan alrededor de una mesa y pasan su vida cenando y <br />
pensando. Cada fil贸sofo tiene un plato de fideos y un tenedor a la izquierda de <br />
su plato. <br />
* Para comer los fideos son necesarios dos tenedores y cada fil贸sofo s贸lo puede <br />
tomar los que est谩n a su izquierda y derecha. Si cualquier fil贸sofo toma un <br />
tenedor y el otro est谩 ocupado, se quedar谩 esperando, con el tenedor en la <br />
mano, hasta que pueda tomar el otro tenedor, para luego empezar a comer.<br /><br />
* Si dos fil贸sofos adyacentes intentan tomar el mismo tenedor a una vez, se <br />
produce una condici贸n de carrera: ambos compiten por tomar el mismo tenedor, <br />
y uno de ellos se queda sin comer.<br /><br />
* Si todos los fil贸sofos toman el tenedor que est谩 a su derecha al mismo tiempo, <br />
entonces todos se quedar谩n esperando eternamente, porque alguien debe <br />
liberar el tenedor que les falta. Nadie lo har谩 porque todos se encuentran en la <br />
misma situaci贸n (esperando que alguno deje sus tenedores). Entonces los <br />
fil贸sofos se morir谩n de hambre. Este bloqueo mutuo se denomina <br />
interbloqueo o deadlock.<br /><br />
* El problema consiste en encontrar un algoritmo que permita que los fil贸sofos <br />
nunca se mueran de hambre.<br />



### Mas info :<br />
https://es.wikipedia.org/wiki/Problema_de_la_cena_de_los_fil%C3%B3sofos

## Autor 鉁嶐煆? :

* Dylan Hurtado L贸pez hecho en IntelliJ IDE
