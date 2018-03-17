package ch.test;

public class Testing {

    public static long Test()
    {
        float counter=0.0f;
        long startTime = System.currentTimeMillis();
        while (counter <= 1_200_000.0f)
        {
            counter += 0.1f;
        }
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args){
        System.out.println(Test());
    }

}
