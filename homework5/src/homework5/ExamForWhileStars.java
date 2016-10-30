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
            System.out.println("�ݺ��������ϱ�2");
            System.out.println("*************");
            System.out.println("1. ���簢�� �����");
            System.out.println("2. �����ﰢ �����");
            System.out.println("3. �̵�ﰢ�� �����");
            System.out.println("4. ���̾Ƹ�� �����");
            System.out.println("5. �����ϱ�");
            System.out.println("���ϴ� �޴���>>");
            menu = s.nextInt();
            System.out.println("*************");
            this.select(menu);
        } catch (Exception e) {
            System.out.println("1~5 ������ ���ڸ� �Է����ּ���");
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