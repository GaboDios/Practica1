/**
 * La interfaz {@code Observador} define el contrato para los objetos que desean
 * ser notificados de cambios o eventos. Es parte del patrón de diseño Observador
 * y debe ser implementada por cualquier clase que quiera recibir actualizaciones.
 */
public interface Observador {

    /**
     * Método que se invoca cuando ocurre un cambio o evento en el objeto observado.
     * Los implementadores de esta interfaz deben definir cómo manejarán la actualización
     * cuando se les notifique.
     *
     * @param mensaje El mensaje que contiene información sobre el cambio o evento.
     */
    public void actualizar(String mensaje);
}
