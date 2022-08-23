import java.util.*;
import java.io.*;

public class MaquinaPilha {
    Stack<String> pilha = new Stack();

    public MaquinaPilha (String programa) {
        String[] partes = programa.split("\n");
        pilha = setPilha(partes);
    }

    public Stack<String> setPilha (String[] partes) {
        int i;
        Stack<String> aux = new Stack();
        for(i = 0; i < partes.length; i++) {
            if(partes[i].indexOf("PUSH") != -1) aux.push(partes[i].split("PUSH ")[1]);
            else if(partes[i].indexOf("PRINT") != -1);
            else aux.push(partes[i]);
        }
        return aux;
    }

    public int execute () {
        String atual = pilha.pop();
        int val1 = 0, val2 = 0;
        switch (atual){
                case "MULT":
                    val1 = execute();
                    val2 = execute();
                    return val2*val1;
                case "SUM":
                    val1 = execute();
                    val2 = execute();
                    return val2+val1;
                case "SUB":
                    val1 = execute();
                    val2 = execute();
                    return val2-val1;
                case "DIV":
                    val1 = execute();
                    val2 = execute();
                    return val2/val1;
                default:
                    return Integer.parseInt(atual);
            }
    } 
}