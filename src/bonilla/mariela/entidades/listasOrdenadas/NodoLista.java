package bonilla.mariela.entidades.listasOrdenadas;

public class NodoLista {
    private int numero;
    private NodoLista next;

    public NodoLista() {
    }

    public NodoLista(int numero, NodoLista next) {
        this.numero = numero;
        this.next = next;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public void destructorNodo(){
        this.next = null;
    }
}
