package org.example;

public class Main {
    public static void main(String[] args) {
        Integer[] list = {9, 6, 12, 27, 39, 99, 3, 2, 4, 3, 11, 4, 4, 16, 10, 20, 2, 1, 9, 22, 2, 0, 1, 5, 7, 0};


        int r1 = 0, r2 = 0, i = 0, a = 0, x = 3;
       while (x < 5) {

            switch (a) {

                case 0:
                    r1 = 0;
                    r2 = 0;
                    i = 0;
                    a = list[i];
                    System.out.print("case 0 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 1:

                    r1 = list[i + 1];
                    i = i + 2;
                    a = list[i];
                    System.out.print("case 1 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 2:
                    r2 = list[i + 1];
                    i = i + 2;
                    a = list[i];
                    System.out.print("case 2 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 3:
                    r1 = list[list[i + 1]];
                    i = i + 2;
                    a = list[i];
                    System.out.print("case 3 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 4:
                    r2 = list[list[i + 1]];
                    i = i + 2;
                    a = list[i];
                    System.out.print("case 4 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 5:
                    r1 = r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 5 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 6:
                    r1 = list[r2];
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 6 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 7:
                    list[r1] = r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 7 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 8:
                    list[list[i + 1]] = r1;
                    i = i + 2;
                    a = list[i];
                    System.out.print("case 8 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 9:
                    i = list[i + 1];
                    a = list[i];
                    System.out.print("case 9 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 10:
                    if (r1 == 0) {
                        i = i + 2;
                    } else {
                        i = i + 1;// 9 a don denecek
                    }
                    a = list[i];
                    System.out.print("case 10 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 11:
                    r1 = r1 + r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 11 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 12:
                    r1 = r1 - r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 12 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 13:
                    r1 = r1 * r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 13 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 14:
                    r1 = r1 / r2;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 14 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;
                case 15:
                    r1 = (-1) * r1;
                    i = i + 1;
                    a = list[i];
                    System.out.print("case 15 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                case 16:
                    if (r1 == r2) {
                        r1 = 0;
                        i = i + 1;

                    } else if (r1 > r2) {
                        r1 = 1;
                        i = i + 1;

                    } else {
                        r1 = (-1);
                        i = i + 1;
                    }
                    a = list[i];
                    System.out.print("case 16 " + r1 + " " + r2 + " " + i);
                    System.out.println(" ");
                    break;

            }
           if(a==0){
               r1=0;
               r2=0;
               i=0;
               System.out.print("halt position " + r1 + " " + r2 + " " + i);
               System.out.println(" ");
               break;}

            }

        }
    }


