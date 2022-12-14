package l6iostreams;

public class FrodoChallenge {

    public static void main(String[] args) {

        String context = IOUtils.fileRead("yemeksepeti-takehome-solutions/resources/frodo.txt");
        String[] textLines = context.split("\n");

        int count = 0;
        int totalcount = 0;

        for (int i = 0; i < textLines.length; i++) {
            for (char c : textLines[i].toCharArray()) {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'u' ||  c == 'o'){
                    count++;
                }
            }
            System.out.println("Sentence " + (i+1) + " has " + count + " vowels");
            totalcount += count;
            count = 0;
        }

        IOUtils.fileWrite("The total number of vowels are " + totalcount, "yemeksepeti-takehome-solutions/resources/frodo-output.txt" );
        IOUtils.close();

        System.out.println("Finished");

    }


}
