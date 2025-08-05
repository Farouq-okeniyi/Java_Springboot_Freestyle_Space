public class mathUtils{
    public static double ratio(int likes, int dislikes){
        if(likes + dislikes == 0){
            return 0.0;
        }
        return (double) likes / (dislikes + likes) * 100;
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }
}