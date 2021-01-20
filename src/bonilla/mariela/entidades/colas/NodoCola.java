package bonilla.mariela.entidades.colas;

public class NodoCola {
    private int numero;
    private NodoCola next;

    public NodoCola() {
    }

    public NodoCola(int numero, NodoCola next) {
        this.numero = numero;
        this.next = next;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoCola getNext() {
        return next;
    }

    public void setNext(NodoCola next) {
        this.next = next;
    }

    public void destructorNodo(){
        this.next = null;
    }

}
