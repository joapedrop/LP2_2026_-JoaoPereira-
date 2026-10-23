import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. Lê a primeira linha para saber a quantidade exata N de palavras
        String linhaN = ler.readLine();
        if (linhaN == null) return;
        int n = Integer.parseInt(linhaN.trim());
        
     
        String texto = ler.readLine();
        if (texto == null) return;
        
      
        StringTokenizer divisor = new StringTokenizer(texto);
        StringBuilder resultado = new StringBuilder();
        
      
        for (int i = 0; i < n; i++) {
            if (!divisor.hasMoreTokens()) break;
            
            String palavra = divisor.nextToken();
            
         
            if (palavra.length() == 3) {
                if (palavra.startsWith("OB")) {
                    resultado.append("OBI");
                } else if (palavra.startsWith("UR")) {
                    resultado.append("URI");
                } else {
                    resultado.append(palavra);
                }
            } else {
                resultado.append(palavra);
            }
            
           
            if (i < n - 1) {
                resultado.append(" ");
            }
        }
        
     
        System.out.println(resultado.toString());
    }
}
