package bonilla.mariela.entidades.listasOrdenadas;


public class ListaOrdenada {
    private NodoLista raiz;
    private int longitud;

    public ListaOrdenada() {
        this.raiz =null;
        this.longitud = 0;
    }

    public void insertar(int num){
        NodoLista nuevo = new NodoLista();
        nuevo.setNumero(num);
        if (listaVacia()){
            raiz = nuevo;
        } else {
            if(num < raiz.getNumero() ){
                nuevo.setNext(raiz);
                raiz = nuevo;
            } else {
                NodoLista cab = raiz;
                NodoLista before = raiz;
                while (num >= cab.getNumero() && cab.getNext() !=null){
                    before = cab;
                    cab = cab.getNext();
                }
                if (num >= cab.getNumero()){
                    cab.setNext(nuevo);
                } else {
                    nuevo.setNext(cab);
                    before.setNext(nuevo);
                }
            }
        }
        longitud ++;
    }

    public int extraerBuscado(int num){
        int numExtraído = 0;
        NodoLista cab = raiz.getNext();
        NodoLista before = raiz;
        if(!listaVacia()){
            if(before.getNumero() == num){
                raiz = before.getNext();
                numExtraído = before.getNumero();
                longitud--;
            }else {
                while (cab.getNumero() != num && cab.getNext()!=null){
                   cab = cab.getNext();
                   before = cab;
                }
                if (cab.getNumero() == num){
                    numExtraído = cab.getNumero();
                    before.setNext(cab.getNext());
                    cab = cab.getNext();
                    longitud--;
                }
                else if(cab.getNext()==null && cab.getNumero() != num){
                    return -1;
                }
            }
        }
        return numExtraído;
    }


    public String imprimir(){
        String mensaje = "";
        NodoLista cab = raiz;
        if(!listaVacia()){
            mensaje = "Lista de elementos de la lista ordenada.\n\n";
            while (cab != null){
                mensaje += "- " + cab.getNumero() + "\n";
                cab = cab.getNext();
            }
        } else
            mensaje = "\nLa lista ordenada se encuentra vacía\n";
        return mensaje;
    }


    public boolean listaVacia(){
        return raiz == null || longitud == 0;
    }

    public void destruirLista(){
        raiz = null;
    }
}
