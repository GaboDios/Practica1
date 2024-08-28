/**
 *Clase abstracta para personajes
 *
 *Nos permite reescribir metodos y variables de tipos personaje
 *
*/

public abstract class Personaje{

    //Variables de clase
    Strategy ejecutarataque;
    private int vida;
    private String nombre;
    private boolean objetomagico;

    /** Constructor de la clase personaje 
     *@param vida la cantidad de vida con la que cuenta el personaje
     *@param nombre el nombre del personaje
     *@param objetomagico indica si el personaje posee un objeto magico
     */
    public Personaje(int vida, String nombre, boolean objetomagico){
	this.vida = vida;
	this.nombre = nombre;
	this.objetomagico = objetomagico;
    }
    
    /**
     * Regresa la cantidad de vida que le queda al personaje
     *
     * @return la cantidad de vida
     */
    public int getVida(){
	return vida;
    }
    
    /**
     * Establece la cantidad de vida que le queda al personaje
     *
     * @param establece la cantidad de vida
     */
    public void setVida(int vida){
	this.vida = vida;
    }

    /**
     * Regresa el nombre del personaje
     *
     * @return nombre del personaje
     */
    public String getNombre(){
	return nombre; 
    }

    /**
     * Regresa el estado del objeto del personaje
     *
     * @return si tiene o no objeto
     */
    public boolean getObjetoMagico(){
	return objetomagico;
    }

    /**
     * Reestablecer el estado del objeto
     *
     * @param establece el estado del objeto
     */
    public void setObjetoMagico(boolean objetomagico){
	this.objetomagico = objetomagico;
    }
    
    /**
     * Manda en la clase de Strategy el tipo de ataque a ejecutar
     * respecto las dos variables de referencia
     * para los tipos de interfaz de Strategy
     */
    public void ejecutarStrategy(){
	ejecutarataque.ejecutarAtaque();
	//ejecutarataque.ejecutarDefensa();
    }
    
    /**
     * Establece el tipo de ataque que ejecutara el personaje
     */
    public void setAtaque(){}

}
