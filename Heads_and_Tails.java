package day5;

public class Heads_and_Tails {
	static int head=0;
	 static int tail=0;
	 static int noOfFlip = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < noOfFlip; i++) {
			if (Math.random() < 0.5){
	            System.out.println("Head");
	            head++;
	        	System.out.println("Number of Head:"+head);
	    }else{
	            System.out.println("Tail");
	            tail++;
	            System.out.println("Number of Tail:"+tail);
	    }
			int PerOfHead = (int) ((head * 100 / noOfFlip));
			int PerOfTail = (int) ((tail * 100 / noOfFlip));
			System.out.println("Percentage of Head :" + PerOfHead + " % ");
			System.out.println("Percentage of Tail :" + PerOfTail + " % ");
		
			
		}
	}

}
