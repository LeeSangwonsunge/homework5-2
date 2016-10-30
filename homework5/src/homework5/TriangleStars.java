package homework5;

import java.util.Scanner;

public class TriangleStars {
    public void TriangleStars(){
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");
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
            System.out.println("공백값과높이를연달아입력해주세요");
        }
    }
}