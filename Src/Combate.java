public class Combate{
    public static void main(String []args){
	Dittuu dittuu = new Dittuu(100, "Dittuu", true);
	MeganMan meganman = new MeganMan(100, "MeganMan", true);
	dittuu.ejecutarStrategy();
	meganman.ejecutarStrategy();
    }
}
