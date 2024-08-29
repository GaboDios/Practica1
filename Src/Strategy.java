public interface Strategy {
   public void ejecutarAtaque(Personaje atacante, Personaje objetivo);
   public void ejecutarDefensa(Personaje atacante, Personaje objetivo);
}
