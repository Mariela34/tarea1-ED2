package bonilla.mariela.entidades.colas;

public class Colas {
    private NodoCola raiz;
    private NodoCola last;
    private int longitud = 0;

    public Colas() {
        this.raiz = null;
        this.last = null;
    }

    public  int pushNumero(int num){
        NodoCola nuevo = new NodoCola();
        nuevo.setNumero(num);
        nuevo.setNext(null);
        if (colaVacia()){
            raiz = nuevo;
            last = nuevo;
            longitud++;
        } else{
            last.setNext(nuevo);
            last = nuevo;
        }
        return -1;
    }

    public int popNumero(){
        if (!colaVacia()){
            int num = raiz.getNumero();
            if (raiz == last){
                raiz = null;
                last = null;
            } else {
                raiz = raiz.getNext();
                longitud--;
            }
            return num;
        }
        return -1;
    }

    public String imprimir(){
        String mensaje = "";
        NodoCola cab = raiz;
        if(!colaVacia()){
            mensaje = "Lista de elementos de la cola.\n\n";
            while (cab != null){
                mensaje += "- " + cab.getNumero() + "\n";
                cab = cab.getNext();
            }
        } else
            mensaje = "\nLa lista de colas se encuentra vacía\n";
        return mensaje;
    }

    public boolean colaVacia(){
        return raiz == null || longitud == 0;
    }
}
