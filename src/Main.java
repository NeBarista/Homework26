public class Main {
    public static void main(String[] args) {
        student(4, 4, 2, 3, 5);
        student(5, 5, 5, 4, 3);
        student(1, 1, 1, 1, 2);
        student(3, 3, 4, 4, 3);
        student(2, 5, 5, 4, 3);
        student(5, 5, 5, 4, 5);
        student(2, 2, 2, 3, 2);
    }
    public static void student(int estimation1, int estimation2, int estimation3, int estimation4, int estimation5 ) {
        if(((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) > 4 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) <5 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) >0) {
             System.out.println("excellent student");
        }
        if (((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) > 3 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) <5 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5)/ 5) >0) {
            System.out.println("the student studying for 4");
        }
        if (((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) > 2 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) < 4 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) >0) {
            System.out.println("the student is studying for 3");
        }
        if (((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) > 1 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) < 3 &&
                ((estimation1 + estimation2 + estimation3 + estimation4 + estimation5) / 5) >0) {
            System.out.println("bad student");
        }
        else {
            System.out.println("HOW DO YOU STUDY?");
        }
    }
}