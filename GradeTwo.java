public class GradeTwo {
    public static void main(String[] args){
        int grade = 70;
        if(grade == 100){
            System.out.println("A+");
        }
        if(grade >= 85){
            System.out.println("A");
        }
        if(grade >= 80){
            System.out.println("A-");
        }
        if(grade >= 75){
            System.out.println("B+");
        }
        if(grade >= 70){
            System.out.println("B");
        }
        if(grade >= 65){
            System.out.println("B-");
        }
        if(grade >= 60){
            System.out.println("C+");
        }
        if(grade >= 55){
            System.out.println("C");
        }
        if(grade >= 50){
            System.out.println("D");
        }
        if(grade > 0){ // under 50
            System.out.println("F");
        }
    }
}
