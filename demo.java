public class demo{
    public static void main(String []args ){
        int Age = 20;
        boolean isJavaFun = true;
        double price = 20.0;
        char grade = 'A';

        String name ="Farouq Okeniyi";
        int[] numbers = {1,2,3,4,5};
        String[] alphabets = {"A", "B", "C", "D", "E"}; 
        int nammelength = name.length();
        int addithion = 4;
        int sum = addNumbers(nammelength, addithion);
        int likes = 100;
        int dislikes = 100;  
        String variable = (likes > dislikes) ? "likes are more" : "dislikes are more";
        double likeRatio = mathUtils.ratio(likes, dislikes);
        for (int i= 0; i< nammelength; i++){
            // System.out.print(name.charAt(i));//prints farouq okeniyi on a single line
            // System.out.println(name.charAt(i)); //prints each character on a new line
            System.out.println(name.charAt(i));
        }
//heloooooo
        //objects
        
        System.out.println(Age + " " + isJavaFun + " " + price + " " + grade + " " + sum+ " "+ likeRatio+ " " + variable);
    }

    // methods to add two numbers
    public static int addNumbers(int a, int b){
        return a + b;
    }
    public static double ratio(int likes , int dislikes){
        if(likes + dislikes == 0){
            return 0.0; 
        }
        return (double) likes / (likes + dislikes) * 100;
    }
}