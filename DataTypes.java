// Java is a STRONGLY TYPED language; you have to DEFINE/DECLARE a variable by declaring its DATA TYPE
class DataTypeExamples{
    int myInt = 42;
    double myDouble = 189.75; //double the amount of bytes (compared to the int) that are used to store the data to allow for more precision
    char myChar = 'Q';
    boolean myBool = false;
}

public class DataTypes {
    public static void main(String[] args){
        DataTypeExamples dt = new DataTypeExamples();
        System.out.println("myInt: " + dt.myInt);
    }
}