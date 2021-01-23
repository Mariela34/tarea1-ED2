package bonilla.mariela.cl;

import bonilla.mariela.dl.Datos;

public class Gestor {
    private Datos datos = new Datos();

    public void insertarDato(int numEstructura, int num){
        datos.insertar(numEstructura, num);
    }
    public String imprimirLista(int numEstructura){
        return datos.imprimir(numEstructura);
    }
    public String transferirElemento(int estructura, int num){
        return datos.transferir(estructura,num);
    }
}
