public class Main {

    public static void main(String[] args) {
        Car masina = new Car();
        masina.nume = "Mercedes";
        masina.anFabricatie = 1995;


        Car masina1 = new Car();
        masina1.nume = "Audi";
        masina1.anFabricatie = 1990;

        System.out.println("Am declarat un obiect de tip masina care are numele: " + masina.nume + " si " +
                "anul fabricatiei: " + masina.anFabricatie);
        System.out.println("Am declarat un obiect de tip masina care are numele: " + masina1.nume + " si " +
                "anul fabricatiei: " + masina1.anFabricatie);

        masina1.startEngine();
        masina.stopEngine();

    }

}
