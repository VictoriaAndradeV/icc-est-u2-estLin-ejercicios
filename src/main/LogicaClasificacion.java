package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
        // forma la pila normal
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }
        // empieza a invertir
        StringBuilder sb = new StringBuilder();
        while (!pila.isEmpty()) {
            sb.append(pila.pop());
        }
        return sb.toString();
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                pila.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (pila.isEmpty()) {//si ingresa simbolo cerrado y la pila esta vacia, entonces no esta ordenada
                    return false;
                }
                char cima = pila.pop(); 
                if ((c == '}' && cima != '{') || //verifica si en la cima de la pila, tiene un simbolo que cierre la expresion
                    (c == ']' && cima != '[') ||
                    (c == ')' && cima != '(')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> aux = new Stack<>();
        while (!pila.isEmpty()) {
            int tmp = pila.pop();
            while (!aux.isEmpty() && aux.peek() > tmp) {
                pila.push(aux.pop());
            }
            aux.push(tmp);
        }
        // Construir lista en orden ascendente
        List<Integer> resultado = new ArrayList<>();
        // Volver a pasar de aux a pila para luego extraer en orden
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
        while (!pila.isEmpty()) {
            resultado.add(pila.pop());
        }
        return resultado;
    }


    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        List<Integer> resultado = new ArrayList<>();
        // Agregar pares
        for (int n : original) {
            if (n % 2 == 0) {
                resultado.add(n);
            }
        }
        // Agregar impares
        for (int n : original) {
            if (n % 2 != 0) {
                resultado.add(n);
            }
        }
        return resultado;
    }
}
