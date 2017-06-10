
public class car2 {
	public static void main(String[] args){
		Automobile2 C = new Automobile2("Cabbie", "Yellow", 4, 2 , " Bebop");
		Automobile2 S = new Automobile2("Sporty","Red", 2,1," Beep");
		Automobile2 V = new Automobile2("Vanny","Green",5,3, " Beep");
		
		//System.out.println(" "+ C.description());
		System.out.println(" "+ C.toString());
		//System.out.println(" "+ S.description());
		System.out.println(" "+ S.toString());//using the tostring
		//System.out.println(" "+ V.description());
		System.out.println(" "+ V.toString());
		System.out.println(Automobile2.Honk());
		System.out.println(Automobile2.Honks("BEIIEIEP"));
		System.out.println(Automobile2.Honks("BOUOUOP"));
		System.out.println(Automobile2.Honks("weeew"));
		
	}

}
