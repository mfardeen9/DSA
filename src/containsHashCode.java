public class containsHashCode {
    static String[] myHashSet = {null, "Jones", null, "Lisa", null, "Bob", null, "Siri", "Pete", null};
    public static void main(String[] args) {
        System.out.println("'Pete' is in the hash set: "+ contains("Pete"));
    }
    public static int hashfunction(String value){
        int sum =0;
        for(int i=0; i<value.length(); i++){
            sum+= value.charAt(i);
        }
        return sum%10;
    }
    public static boolean contains( String name){
        int index = hashfunction(name);
        return myHashSet[index] != null && myHashSet[index].equals(name);
    }
}
