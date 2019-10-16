public class DistinctValues {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
       		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int count = 0;
		
		if(a != b) {
			count++;
		}
		if(a != c){
			count++;
		}
		if(b != c){
			count++;
		}
		
		if(count <=1) {
		System.out.println("There is " + count + " distinct values.");
		}else{
			System.out.println("There are " + count + " distinct values.");
			}

	}
	
}
