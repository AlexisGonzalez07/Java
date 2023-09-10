
public class Arrays {
	public static String[] words = {"Mike", "Alex", "Daisy"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		array[0] = 10;
		array[5] = 77;
		PrintValue printer = new PrintValue();
		for(int number: array) {
			printer.printValue(number);
		}
		for(String word: words) {
			printer.printValue(word);
		}
		int newLength = words.length + 1;
		printer.printValue(newLength);
		String[] newWords = new String[newLength];
		printer.printValue(newWords);
		for(int i = 0; i < newWords.length; i++) {
			newWords[i] = words[i];
			printer.printValue(newWords[i]);
			if(i == words.length) {
				newWords[i] = "Jeremy";
			}
		}
		for(String word: newWords) {
			printer.printValue(word);
		}
	}

}
