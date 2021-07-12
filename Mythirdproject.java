public class Mythirdproject {
    int engMarks;
    int mathsMarks;
    int phyMarks;
}
class  instancevariable{
    public static void main(String[] args) {
        Mythirdproject obj1= new Mythirdproject();
        obj1.engMarks=70;
        obj1.mathsMarks=100;
        obj1.phyMarks=70;
        System.out.println("marks for object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);
    }
}
