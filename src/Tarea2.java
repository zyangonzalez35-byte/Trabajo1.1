public class Tarea2 {

    // Clase de los nodos

    static class Nodo {
        int valor;
        Nodo[] enlaces = new Nodo[3];

        Nodo(int valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {

        // Se crean los nodos que usamos.

        Nodo nodo20 = new Nodo(20);
        Nodo nodo23 = new Nodo(23);
        Nodo nodo19 = new Nodo(19);
        Nodo nodo57 = new Nodo(57);
        Nodo nodo67 = new Nodo(67);
        Nodo nodo99 = new Nodo(99);

        // La cabeza.

        Nodo head = nodo20;

        // Creamos las uniones de los nodos.

        nodo20.enlaces[0] = nodo23;
        nodo20.enlaces[1] = nodo19;
        nodo20.enlaces[2] = null;

        nodo23.enlaces[0] = null;
        nodo23.enlaces[1] = nodo57;
        nodo23.enlaces[2] = null;

        nodo19.enlaces[0] = null;
        nodo19.enlaces[1] = null;
        nodo19.enlaces[2] = nodo67;

        nodo57.enlaces[0] = null;
        nodo57.enlaces[1] = null;
        nodo57.enlaces[2] = null;

        nodo67.enlaces[0] = null;
        nodo67.enlaces[1] = nodo99;
        nodo67.enlaces[2] = null;

        nodo99.enlaces[0] = null;
        nodo99.enlaces[1] = null;
        nodo99.enlaces[2] = null;


        // Imprimimos el nodo 99 iniciando desde head

        Nodo nodo = head;
        nodo = nodo.enlaces[1];
        nodo = nodo.enlaces[2];
        nodo = nodo.enlaces[1];

        System.out.println( + nodo.valor);


        // Imprimimos el nodo 57 iniciando desde head

        nodo = head;
        nodo = nodo.enlaces[0];
        nodo = nodo.enlaces[1];

        System.out.println( + nodo.valor);


    }
}