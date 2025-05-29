// ESTE ARCHIVO VA A SER LA CLASE DE JUGADOR DONDE CREAREMOS LAS CLASES DE LOS HEROES


class player {String name;
    protected int vida;
    protected int mana;

    player (String name) {
        this.name=name;
        this.vida=100;
        this.mana=100;
    }
    protected void atacar(){
        System.out.println("Al ataqueeeee");
    }

    protected String getName(){
        return this.name;
    }

}



class guerrero extends player{

    private int fuerza;

    guerrero (String name){
        super(name);
        this.fuerza=200;
    }

    public void atacar() {
        System.out.println("AHHHHHHHHHH");
    }

}
class mago extends player {
    private int magia;

    mago(String name) {
        super(name);
        this.magia = 200;
    }

    public void atacar() {
        System.out.println("Avada Kedabra");
    }
}


    class rogue extends player {
        private int pericia;

        rogue(String name) {
            super(name);
            this.pericia = 200;
        }

        public void atacar() {
            System.out.println("Te asesine");
        }

    }

