Nombre del Equipo: 
                      Los hijos de Korhal

Integrantes del Equipo:                                    Numero de cuenta

                      Pedro Yamil Salazar Gonzalez            306037445
                      Gabriel Diaz Payne                      317097560
                      Isaac Rivera Jimenez                    321225087

Practica: Practica1

Sistema operativo utilizado:

Se ha ocupado Linux para realizar la práctica, con la versión de Java "21.0.4"

Patrones de diseño a utilizar:

Se utiliza el patrón de diseño Strategy en los poderes que ejecutan los personajes de cada empresa.
Respecto a su implementación, se hace uso una interfaz, la cual aplica a cada poder de cada personaje. De esta manera 
una superclase utiliza de referencia la interfaz y utilizamos un método que delega esa referencia para que, al momento de instanciar el combate, utilicemos el poder de cada uno sin modificar clases en dado caso que se requieran actualizaciones posteriores.

Hacemos uso del patrón de diseño Observer, ocupamos una clase Observador, y una clase Espectador de la cual reescribe el método "actualizar" en Espectador y son los que fungirán como los usuarios que observaran el combate, nos apoyamos de una clase MediadorCombate en donde se implementa la lista de Observadores que se les registrara, notificara y se le indicara si su personaje ha ganado dependiendo de a quien haya apoyado el espectador. Personaje utilizará el método notificar de MediadorCombate para registrar las peleas en un .txt a cada uno de los espectadores registrados. 

Hacemos uso de clases de cada empresa, heredadas de Personaje, para especificar la pertenencia única de cada personaje hacia su empresa
