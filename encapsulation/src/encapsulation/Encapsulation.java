package encapsulation;

public class Encapsulation {
	public static void main(String []args){
A monA=new A();
B monB=new B();
monA.puba=1;
monA.proa=2; // proa protected accessible que par le même packages ici c'est le cas mais sinon erreur
monA.setPria(3); // pria private, donc accessible que dans la classe A
monB.pubb=1;
monB.prob=2; // proa protected accessible que par le même packages ici c'est le cas mais sinon erreur
monB.setPrib(3); // pria private, donc accessible que dans la classe A
monA.Affiche();
 }
}
