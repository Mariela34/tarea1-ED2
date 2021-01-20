package bonilla.mariela.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Principal {
    static PrintStream output = new PrintStream(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void mostrarMenu() {
        output.println("Menú de inicio:");
        output.println("1.Insertar dato");
        output.println("2.Imprimir lista");
        output.println("3.Pasar elemento de una estructura a otra");
        output.println("4.Salir");
    }

    public void mostrarMenu2(){
        output.println("Seleccione cuál transferencia desea realizar:");
        output.println("1.Pasar elemento de pila a cola");
        output.println("2.Pasar elemento de cola a pila");
        output.println("3.Pasar elemento de pila a lista ordenada");
        output.println("4.Pasar elemento de lista ordenada a pila");
        output.println("5.Pasar elemento de cola a lista ordenada");
        output.println("6.Pasar elemento de lista ordenada a cola");
    }

    public int leerOpcion() throws IOException {
        output.println("Ingrese una opción:");
        return Integer.parseInt(in.readLine());
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() throws IOException {
        return in.readLine();
    }

    public int leerNum() throws IOException {
        return Integer.parseInt(in.readLine());
    }
}
