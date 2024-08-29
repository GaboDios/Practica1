/**
 * La interfaz {@code Strategy} define un contrato para las estrategias de ataque y defensa
 * que pueden ser implementadas por diferentes tipos de poderes o habilidades en los personajes.
 * Cada clase que implemente esta interfaz deberá proporcionar las implementaciones concretas
 * para los métodos de ataque y defensa.
 */
public interface Strategy {

   /**
    * Ejecuta la acción de ataque utilizando la estrategia específica.
    *
    * @param atacante El personaje que realiza el ataque.
    * @param objetivo El personaje que recibe el ataque.
    */
   public void ejecutarAtaque(Personaje atacante, Personaje objetivo);

   /**
    * Ejecuta la acción de defensa utilizando la estrategia específica.
    *
    * @param atacante El personaje que realiza el ataque.
    * @param defendido El personaje que defiende el ataque.
    */
   public void ejecutarDefensa(Personaje atacante, Personaje defendido);
}
