import java.util.Scanner;

public class Calculatrice {
	static void Adition(int nb1,int nb2){
		System.out.print("la resultat de l'addition est: "+(nb1+nb2));
		}
	static void Soustraction(int nb1,int nb2){
		System.out.print("La resultat de la soustraction est: "+(nb1-nb2));
	}
	static void Multiplication(int nb1,int nb2){
		System.out.print("La resultat de la Multiplication est: "+(nb1*nb2));
		}
	static void Division(int nb1,int nb2){
		System.out.print("La resultat de la Division est: "+(nb1/nb2));
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nmb1;
		int nmb2;
		System.out.println("If you want addition click 1,\nIf you want soustraction click 2,\nIf you want multiplication click 3,\nIf you want division click 4:  ");
		int prg = sc.nextInt();
		switch(prg){
		
		case 1 : System.out.println(" Entrer les deux nombres svp!: ");
			     nmb1 = sc.nextInt();
		         nmb2 = sc.nextInt();
		         Adition(nmb1,nmb2);
		         break;
		
		case 2 : System.out.println(" Entrer les deux nombres svp!: ");
		         nmb1 = sc.nextInt();
                 nmb2 = sc.nextInt();
                 Soustraction(nmb1,nmb2);
        break;

		case 3 : System.out.println(" Entrer les deux nombres svp!: ");
	             nmb1 = sc.nextInt();
                 nmb2 = sc.nextInt();
                 Multiplication(nmb1,nmb2);
break;
		case 4 : System.out.println(" Entrer les deux nombres svp!: ");
	             nmb1 = sc.nextInt();
                 nmb2 = sc.nextInt();
                 if(nmb2 == 0){
                	 System.out.println("faux");
                 }
                 else{
                 Division(nmb1,nmb2);}
break;
		}
		
		if (prg == 0){
			System.out.print("Quiter!!");
		}
	}

}
