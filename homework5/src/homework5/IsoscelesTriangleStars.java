package homework5;

import java.util.Scanner;

public class IsoscelesTriangleStars {
    public void IsoscelesTrianglesStars(){
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("�̵�ﰢ�� �����Է� : ");
            int height = s.nextInt();
            String strData = "*";
            for(int i=0; i<height; i++){
                for(int j=height-i; j>0; j--){
                    System.out.print(" ");
                }
                System.out.println(strData);
                strData+="**";
            }
        }catch (Exception e ){
            System.out.println("��Ȯ�� �Է��ϼ���.");
        }
    }
}