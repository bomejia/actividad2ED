public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE PILA Y COLA ===\n");

        Pila<String> pila = new Pila<>();
        Cola<String> cola = new Cola<>();

        // --- Operaciones con PILA ---
        System.out.println(">>> PILA <<<");
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.mostrar();

        System.out.println("Elemento desapilado: " + pila.pop());
        System.out.println("Tope actual: " + pila.peek());
        pila.mostrar();

        // --- Operaciones con COLA ---
        System.out.println("\n>>> COLA <<<");
        cola.enqueue("1");
        cola.enqueue("2");
        cola.enqueue("3");
        cola.mostrar();

        System.out.println("Elemento desencolado: " + cola.dequeue());
        System.out.println("Frente actual: " + cola.peek());
        cola.mostrar();

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
