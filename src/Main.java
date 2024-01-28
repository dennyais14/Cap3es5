//Scrivere un programma che contenga una interfaccia Forma
// ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo
// che implementano Forma ed implementano il metodo per il calcolo dell'area.
public class Main {
    public static void main(String[] args) {
        Triangolo triangle1 = new Triangolo(15,4);
        System.out.println("Dati i seguenti dati di un triangolo: ");
        System.out.println("Base " + triangle1.base);
        System.out.println("Altezza " + triangle1.altezza);
        System.out.print("l'area del triangolo e' pari a: ");
        System.out.println(triangle1.calcoloArea(triangle1.base, triangle1.altezza));

        Rettangolo rectangle1 = new Rettangolo(10, 3);
        System.out.println("Dati i seguenti dati di un rettangolo: ");
        System.out.println("Base " + rectangle1.base);
        System.out.println("Altezza " + rectangle1.altezza);
        System.out.print("l'area del rettangolo e' pari a: ");
        System.out.println(rectangle1.calcoloArea(rectangle1.base, rectangle1.altezza));
    }
}