package homework5;

import java.util.Scanner;

public class ExamForWhileStars {
    public static void main(String[] args) {
        new ExamForWhileStars().start();
    }

    public void start() {
        int menu;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("*************");
            System.out.println("반복문연습하기2");
            System.out.println("*************");
            System.out.println("1. 정사각형 별찍기");
            System.out.println("2. 직각삼각 별찍기");
            System.out.println("3. 이등변삼각형 별찍기");
            System.out.println("4. 다이아몬드 별찍기");
            System.out.println("5. 종료하기");
            System.out.println("원하는 메뉴는>>");
            menu = s.nextInt();
            System.out.println("*************");
            this.select(menu);
        } catch (Exception e) {
            System.out.println("1~5 사이의 숫자를 입력해주세요");
            this.start();
        }
    }

    public void select(int menu) {
        if(menu==1) { new RectagleStars().RectangleStars();}
        else if(menu==2) { new TriangleStars().TriangleStars();}
        else if(menu==3) { new IsoscelesTriangleStars().IsoscelesTrianglesStars();}
        else if(menu==4) { new DiamondStars().DiamondStars();}
        else if(menu==5) { System.exit(0); }
    }
}