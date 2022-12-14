import java.io.*;

class MaquinaPilha {
    public static void main(String[]args) throws Exception
	{
        BufferedReader arquivo = new BufferedReader(new FileReader(args[0]));
        String programString = "";
        char currchar;
        int currchar1 = 0;
        int resultado = 0;

        while (currchar1 != -1) {
            currchar1 =  arquivo.read();
			currchar = (char) currchar1;
            if(currchar1 != -1) programString += currchar;
        }
        MaquinaPilhaExec instrucoes = new MaquinaPilhaExec(programString);
        resultado = instrucoes.execute();

        System.out.println("Valor Pilha: " + resultado);
    }
}