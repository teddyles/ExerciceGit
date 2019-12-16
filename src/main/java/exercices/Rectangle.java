package exercices;
// Calcul de la surface d'un rectangle
public class Rectangle {
    public Double Longueur;
    public Double Largeur;

    public Rectangle(Double L, Double l){
        this.Longueur=L;
        this.Largeur=l;
    }

    public Rectangle(double v, int i, int i1) {
    }

    public Double surface(){
        return this.Longueur*this.Largeur;
    }
    public void afficher(){
        System.out.println("La surface du rectangle est : " + this.surface());
    }
}
