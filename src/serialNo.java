public class serialNo {

    public static void result(int n) {
        if(n > 0)
        {
            result(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
    public static void main(String[] args)
    {
        result(5);
    }
}
