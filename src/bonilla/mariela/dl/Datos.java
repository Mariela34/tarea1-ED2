package bonilla.mariela.dl;

import bonilla.mariela.entidades.colas.Colas;
import bonilla.mariela.entidades.listasOrdenadas.ListaOrdenada;
import bonilla.mariela.entidades.pilas.Pila;

public class Datos {
    private static Pila listaPila = new Pila();
    private static Colas listaCola = new Colas();
    private static ListaOrdenada listaOrdenada = new ListaOrdenada();

    public void insertar(int numEstructura, int num){
        switch (numEstructura){
            case 1:
                listaPila.pushNumero(num);
                break;
            case 2:
                listaCola.pushNumero(num);
                break;
            case 3:
                listaOrdenada.insertar(num);
                break;
        }
    }

    public String imprimir(int numEstructura){
        String respuesta = "";
        switch (numEstructura){
            case 1:
                respuesta = listaPila.imprimir();
                break;
            case 2:
                respuesta = listaCola.imprimir();
                break;
            case 3:
                respuesta = listaOrdenada.imprimir();
                break;
        }
        return respuesta;
    }

    public String transferir(int estructura, int num){
        String mensaje = "";
        switch (estructura){
            case 1:
                mensaje = transferirPilaACola();
                break;
            case 2:
                mensaje = transferirColaAPila();
                break;
            case 3:
                mensaje = transferirPilaALista();
                break;
            case 4:
                mensaje = transferirListaAPila(num);
                break;
            case 5:
                mensaje = transferirColaALista();
                break;
            case 6:
                mensaje = transferirListaACola(num);
                break;
        }
        return mensaje;
    }

    public String transferirPilaACola(){
        if (listaPila.pilaVacia())
            return "La lista de pilas está vacía";
        else {
            int num = listaPila.popNumero();
            listaCola.pushNumero(num);
            return "Transferencia realizada de pila a cola";
        }
    }

    public String transferirColaAPila(){
        if (listaCola.colaVacia())
            return "La lista de cola está vacía";
        else {
            int num = listaCola.popNumero();
            listaPila.pushNumero(num);
            return "Transferencia realizada de cola a pila";
        }
    }

    public String transferirPilaALista(){
        if (listaPila.pilaVacia())
            return "La lista de pilas está vacía";
        else {
            int num = listaPila.popNumero();
            listaOrdenada.insertar(num);
            return "Transferencia realizada de pila a lista ordenada";
        }
    }

    public String transferirListaAPila(int num){
        if(listaOrdenada.listaVacia()){
            return "La lista ordenada se encuentra vacía";
        } else {
            int numEncontrado = listaOrdenada.extraerBuscado(num);
            if(numEncontrado != -1){
                listaPila.pushNumero(numEncontrado);
                return "Transferencia realizada de la lista ordenada a la pila";
            } else {
                return "No se encontró el número que se deseaba transferir a la pila";
            }
        }
    }

    public String transferirColaALista(){
        if (listaCola.colaVacia())
            return "La lista de cola está vacía";
        else {
            int num = listaCola.popNumero();
            listaOrdenada.insertar(num);
            return "Transferencia realizada de cola a lista ordenada";
        }
    }

    public String transferirListaACola(int num){
        if(listaOrdenada.listaVacia()){
            return "La lista ordenada se encuentra vacía";
        } else {
            int numEncontrado = listaOrdenada.extraerBuscado(num);
            if(numEncontrado != -1){
                listaCola.pushNumero(numEncontrado);
                return "Transferencia realizada de la lista ordenada a la cola";
            } else {
                return "No se encontró el número que se deseaba transferir a la cola";
            }
        }
    }
}
