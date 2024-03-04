package Programs;

public class FindDuplicateCharacterInAString {
    public static void main(String[] args) {
        String givenstring="Bimmalll Pattarra";
        String removespace=givenstring.replace(" ","");
        int count=0;
        char arr[]=removespace.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate character in given string are : "+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate Character count :"+count);
    }
}
