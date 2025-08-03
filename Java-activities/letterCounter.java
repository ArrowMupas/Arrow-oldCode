public class LetterCounter {

    public static void main(String[] args) {
      String sentence ="The quick brown fox jumps over the lazy dog.";
       int x=0;
       int y=0;
       
      while(x < sentence.length())
		{
			if(sentence.charAt(x) == 'o') {
			    y++;
			}
			x++; 
    }
    System.out.println(y);
}
}