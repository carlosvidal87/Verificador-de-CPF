import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] cpf = new int[11];
        int i;
        int b1;
        int b2;
        String line = "";
        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11;
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque seu CPF: ");

        while(input.hasNextLine() && !((line = input.nextLine()).equals(""))){
            s1 = line.substring(0, 1); cpf[0] = Integer.parseInt(s1);
            s2 = line.substring(1, 2); cpf[1] = Integer.parseInt(s2);
            s3 = line.substring(2, 3); cpf[2] = Integer.parseInt(s3);
            s4 = line.substring(4, 5); cpf[3] = Integer.parseInt(s4);
            s5 = line.substring(5, 6); cpf[4] = Integer.parseInt(s5);
            s6 = line.substring(6, 7); cpf[5] = Integer.parseInt(s6);
            s7 = line.substring(8, 9); cpf[6] = Integer.parseInt(s7);
            s8 = line.substring(9, 10); cpf[7] = Integer.parseInt(s8);
            s9 = line.substring(10, 11); cpf[8] = Integer.parseInt(s9);
            s10 = line.substring(12, 13); cpf[9] = Integer.parseInt(s10);
            s11 = line.substring(13, 14); cpf[10] = Integer.parseInt(s11);

            b1 = 0;
            b2 = 0;
            for (i = 0; i < 9; i++){
                b1 += (i + 1) * cpf[i];
                b2 += (9 - i) * cpf[i];
            }

            b1 = (b1 % 11) % 10;
            b2 = (b2 % 11) % 10;

            if (b1 == cpf[9] && b2 == cpf[10]){
                System.out.print("CPF valido");
                System.out.print("\n");
            }else{
                System.out.print("CPF invalido");
                System.out.print("\n");
            }
        }
    }
}
