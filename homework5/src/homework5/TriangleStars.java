package homework5;

import java.util.Scanner;

public class TriangleStars {
    public void TriangleStars(){
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("�����ﰢ���� ���ʿ���� �����Է� : ");
            int blank=s.nextInt();
            int height=s.nextInt();
            for(int i=0; i<height; i++){
                for(int j=blank-i; j>0; j--) {
                    System.out.print(" ");
                }
                for(int k=0; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (Exception e){
            System.out.println("���鰪�����̸����޾��Է����ּ���");
        }
    }
}