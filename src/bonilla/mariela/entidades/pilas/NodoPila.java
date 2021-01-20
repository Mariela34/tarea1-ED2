package bonilla.mariela.entidades.pilas;

public class NodoPila {
    private NodoPila next;
    private int num;

    public NodoPila() {
    }

    public NodoPila(NodoPila next, int num) {
        this.next = next;
        this.num = num;
    }

    public NodoPila getNext() {
        return next;
    }

    public void setNext(NodoPila next) {
        this.next = next;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
