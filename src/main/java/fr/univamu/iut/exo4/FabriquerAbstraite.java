package fr.univamu.iut.exo4;

public abstract class FabriquerAbstraite {
     Connectable fabriquer(String type) {
         Connectable object = null;
        try {

            switch (type) {
                case "CoffeeMaker":
                    object = new CoffeeMaker();
                    this.equiper("coffee",object);
                    break;
                case "Radio":
                    object = new Radio();
                    this.equiper("nimbus 2000",object);
                    break;
                default:
                    throw (new ClassNotFoundException());
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        return object;
    }

    abstract void equiper(String gadget, Connectable connectable);
}
