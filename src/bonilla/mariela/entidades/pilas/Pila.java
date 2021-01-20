package bonilla.mariela.entidades.pilas;

public class Pila {
    private NodoPila raiz;
    private int longitud;

    public Pila() {
        this.longitud = 0;
        this.raiz = null;
    }

    public  String pushNumero(int num){
        NodoPila nuevo = new NodoPila();
        nuevo.setNum(num);
        if(pilaVacia()) {
            nuevo.setNext(null);
            raiz = nuevo;
            longitud++;
        } else {
           nuevo.setNext(raiz);
           raiz = nuevo;
           longitud++;
        }
        return null;
    }

    public int popNumero(){
        if (!pilaVacia()){
            int num = raiz.getNum();
            raiz = raiz.getNext();
            longitud--;
            return num;
        }
        return -1;
    }

    public String imprimir(){
        String mensaje = "";
        NodoPila cab = raiz;
        if(!pilaVacia()){
            mensaje = "Lista de elementos de la pila.\n\n";
            while (cab != null){
                mensaje += "- " + cab.getNum() + "\n";
                cab = cab.getNext();
            }
        } else
            mensaje = "\nLa lista de pilas se encuentra vacía\n";
        return mensaje;
    }



    public boolean pilaVacia(){
     return raiz == null || longitud == 0;
    }


}
