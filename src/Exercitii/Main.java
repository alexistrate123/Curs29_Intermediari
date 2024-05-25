package Exercitii;

public class Main {
    public static void main(String[] args) {

        // 1. Cream un caine care sa aiba nume si rasa si sa manance si sa doarma. Apelam la consola
        // 2. Al doilea caine  care sa aiba nume si culoare si coada si sa alerge si sa pazeasca.

        Dog caine = new Dog();
        caine.nume = "Rex";
        caine.rasa = "DogGerman";
        System.out.println("Am acasa un caine pe nume:" + caine.nume +" si el este de rasa: " + caine.rasa +
                " si comportamenutul lui este urmatorul: ");
        caine.sta();
        caine.mananca();


        Dog caine1 = new Dog();
        caine1.nume = "Spanchi";
        caine1.culoare = "alb";
        caine1.cuCoada = true;
        System.out.println("Pe cainele meu il cheama: " + caine1.nume + " are culoarea  " + caine1.culoare +
                " si are coada " + caine1.cuCoada + " si are urmatorul comportament: ");
        caine1.alearga();
        caine1.pazeste();


    }
}
