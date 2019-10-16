public class AllEqual {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
       		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean equals = false;

		if(a == b && a == c && b == c) {
			equals = true;
		}

		if (equals) {
			System.out.println("Equals");
		}else{
			System.out.println("Not equals");
		}

	}

}
