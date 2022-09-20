// shreyans j. pranami 21CE110
public class TryCatch1 {
    public static void main(String[] args) {
      try
    {
        int arr[]= {1,3,5,7};
        System.out.println(arr[10]); //may throw exception
    }
    // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
        System.out.println("shreyans 21CE110");
}
  }