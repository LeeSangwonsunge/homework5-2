package homework5;

import java.util.Scanner;

public class RectagleStars {
    public void RectangleStars(){

        Scanner s = new Scanner(System.in);
        System.out.print("���簢�� ũ�� : ");
        int size = s.nextInt();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}