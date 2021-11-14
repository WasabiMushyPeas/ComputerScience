import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

// Not very efficient but gets the job done

public class ArrayMixerAndSorter{

	//method that sorts the array
	static ArrayList<Integer> BFsort(ArrayList<Integer> scrambledArray, Integer length){
		
		ArrayList<Integer> idealArray = scrambledArray;
		Collections.sort(idealArray);
		
		while(scrambledArray != idealArray){
			
			int n = 0;
			
			while(n < length){
				
				if(scrambledArray.get(n) > scrambledArray.get(n+1)){
					
					int n1 = scrambledArray.get(n);
					int n2 = scrambledArray.get(n+1);
					scrambledArray.set(n, n2);
					scrambledArray.set(n+1, n1);

				}
				n++;

			}
			System.out.println(scrambledArray);
			
		}
		
		return scrambledArray;

}
	
	public static void main(String[] args){
		
		
		int arraySize = 100000;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// randomizes the array		
		while (numbers.size() < arraySize){
			int randomNum = new Random().nextInt(arraySize) + 1;
			
			if(!numbers.contains(randomNum)){
				numbers.add(randomNum);
			}
		
		}

		
		System.out.println(numbers);
		System.out.println("Starting...");
		System.out.println(BFsort(numbers, arraySize));
		System.out.println("Did it work?");
	}


}
