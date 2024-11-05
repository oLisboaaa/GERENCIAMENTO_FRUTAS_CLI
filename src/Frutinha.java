import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frutinha {
    public static void main(String[] args) {
        // Exemplo de Hashtable
        // Hashtable não permite chaves ou valores nulos e a ordem dos elementos não é garantida.
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Maçã");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Laranja");

        // Exibe os elementos do Hashtable
        System.out.println("Hashtable:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Exemplo de HashMap
        // HashMap permite chaves e valores nulos, mas não garante a ordem dos elementos.
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Maçã");
        hashmap.put(2, "Banana");
        hashmap.put(3, "Laranja");
        hashmap.put(null, "Uva"); // Exemplo de chave nula
        hashmap.put(4, null);     // Exemplo de valor nulo

        // Exibe os elementos do HashMap
        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Exemplo de TreeMap
        // TreeMap organiza os elementos de forma ordenada com base na chave (ordem crescente)
        TreeMap<Integer, String> treemap = new TreeMap<>();
        treemap.put(3, "Laranja");
        treemap.put(1, "Maçã");
        treemap.put(2, "Banana");
        treemap.put(4, "Uva");

        // Exibe os elementos do TreeMap, que estão ordenados por chave
        System.out.println("\nTreeMap (ordenado por chave):");
        for (Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
