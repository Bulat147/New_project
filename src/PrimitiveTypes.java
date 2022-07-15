public class PrimitiveTypes {

    public static void main(String[] args){
        boolean myBool = true;
        int newInt = 300;
        double myDob = 45.6;
        float difDob = 45.6f;
        long moreInt = 54654;
        short lessInt = 34;
        for (int i = 0; i < 10; i++){
            System.out.println("Hello, int!");
        }


        byte myByte = 127; // Это тоже int, но от -128 до 127 (т.к. 2^8)
        char myChar = 'a'; // А, так вот почему JAVA ругается на одинарные кавычки для String - потому
                                                                    // что они используются для типа char!

    }
}
