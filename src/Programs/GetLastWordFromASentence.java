package Programs;
    public class GetLastWordFromASentence {

        public static void main(String[] args) {

            String givenstring = "I am a Test Engineer";
            String[] partition = givenstring.split(" ");
            String lastword = partition[partition.length - 1];
            System.out.println(lastword);

        }
    }

