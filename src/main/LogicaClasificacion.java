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
        String textoInvertido = "";

        for(int i = texto.length() - 1; i >= 0; i--){
            pila.push(texto.charAt(i));
        }

        while(!pila.isEmpty()){
            textoInvertido = textoInvertido + pila.pop();
        }

        return textoInvertido;
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
        for (int i = 0; i <= expresion.length(); i++){
            char c = expresion.charAt(i); //vamos tomando caracter por caracter de la cadena ingresada

            if((c == '{')|| (c == '[') || (c == '(')){
                pila.push(c);
            } else if ((c == '}')|| (c == ']') || (c == ')')){
                
                if(pila.isEmpty()){ //si la pila esta vacia e ingresa un simbolo de cierre
                    return false; // retorna falso
                }
                
                
            }
        }
        return false;
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
        return new ArrayList<>();
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

        return new ArrayList<>();
    }
}
