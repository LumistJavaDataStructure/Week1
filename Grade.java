public class Grade {
    public static void main(String[] args){
        int grade = 83;
        if(grade == 100){
            System.out.println("A+");
        }
        else if(grade >= 85){
            System.out.println("A");
        }
        else if(grade >= 80){
            System.out.println("A-");
        }
        else if(grade >= 75){
            System.out.println("B+");
        }
        else if(grade >= 70){
            System.out.println("B");
        }
        else if(grade >= 65){
            System.out.println("B-");
        }
        else if(grade >= 60){
            System.out.println("C+");
        }
        else if(grade >= 55){
            System.out.println("C");
        }
        else if(grade >= 50){
            System.out.println("D");
        }
        else{ // under 50
            System.out.println("F");
        }
    }
}
