import java.io.*;
import java.util.*;

public class p14 {

    public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String al = scan.nextLine();
		String b = scan.nextLine();
		
		String[] lineA = al.split(" ");

		List<String> listA = new ArrayList<>();
		Set<String> out = new TreeSet<>();
		for (int s = 0; s < lineA.length; s++) {
			listA.add(lineA[s]);
		}
		for (int i = 0; i < Integer.parseInt(b); i++){
			String k = scan.next();
			
			if(listA.contains(k)){
				listA.remove(listA.indexOf(k));
			} else {
				out.add(k);
			}
		}
		for(String z : out){
			System.out.printf("%s ",z);
		}

	}
    double companyBotStrategy(int[][] trainingData) {
        for(int i = 0; i< )
    }

}
