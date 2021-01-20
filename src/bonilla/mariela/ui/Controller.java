package bonilla.mariela.ui;

import bonilla.mariela.gestor.Gestor;

import java.io.IOException;

public class Controller {
    private Principal ui = new Principal();

    public  void runSystem() throws IOException {
        int option = 0;
        do{
            ui.mostrarMenu();
            option = ui.leerOpcion();
            execAction(option);
        }while (option != 4);
    }

    public void execAction(int opt) throws IOException {
        switch (opt){
            case 1:
                insertarDato();
                break;
            case 2:
                imprimirLista();
                break;
            case 3:
                transferirElemento();
                break;
            default:
                ui.imprimirMensaje("Opción inválida");
                break;
        }
    }

    public void insertarDato() throws IOException {
        Gestor gestor = new Gestor();
        int estructura = 0;
        int num = 0;
        boolean seguir = false;
        ui.imprimirMensaje("Ingrese el número a insertar:");
        num = ui.leerNum();
        ui.imprimirMensaje("Ingrese el tipo de estructura:");
        ui.imprimirMensaje("1. pila");
        ui.imprimirMensaje("2. cola");
        ui.imprimirMensaje("3. lista");
        do {
            ui.imprimirMensaje("Ingrese una estructura válida");
            estructura = ui.leerNum();
            if (estructura == 1 || estructura == 2 ||
                    estructura == 3)
                seguir = true;
        } while (!seguir);
        gestor.insertarDato(estructura, num);
    }

    public void imprimirLista() throws IOException {
        Gestor gestor = new Gestor();
        int estructura = 0;
        boolean seguir = false;
        ui.imprimirMensaje("Ingrese el tipo de estructura a imprimir:");
        ui.imprimirMensaje("1. pila");
        ui.imprimirMensaje("2. cola");
        ui.imprimirMensaje("3. lista");
        do {
            ui.imprimirMensaje("Ingrese una estructura válida");
            estructura = ui.leerNum();
            if (estructura == 1 || estructura == 2 ||
                    estructura == 3)
                seguir = true;
        } while (!seguir);
        ui.imprimirMensaje(gestor.imprimirLista(estructura));
    }

    public void transferirElemento() throws IOException {
        Gestor gestor = new Gestor();
        int estructura = 0;
        boolean seguir = true;
        String datos;
        int num = 0;
        do{
            ui.mostrarMenu2();
            estructura = ui.leerNum();
            if (estructura == 1 || estructura == 2 ||
                    estructura == 3 || estructura == 4
                    || estructura == 5 || estructura == 6)
                seguir = true;

        }while (!seguir);
        if (estructura == 4 || estructura == 6){
            ui.imprimirMensaje("ingrese el número que desea transferir");
            num = ui.leerNum();
        }
        ui.imprimirMensaje(gestor.transferirElemento(estructura, num));
    }
}
