public class DataShadowingEx
{
    int Sonu = 50;
    void show()
    {
        int Sonu = 20;
        System.out.println("local = "+ Sonu);
        System.out.println("instance var = "+this.Sonu);
    }

    public static void main(String[] args) {
        DataShadowingEx obj = new DataShadowingEx();
        obj.show();
    }
}
