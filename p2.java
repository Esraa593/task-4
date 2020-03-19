
public class p2 {

	public static void main(String[] args) {
		int [] A = {1, 2, 5, 7, 11, 15};
		int target=22;
		int t;
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				t=A[i]+A[j];
			    if(t==target){
				    System.out.println("target="+t);
				    System.out.println("the numbers is " +A[i]+","+A[j]+"and their position is "+i+","+j);		   
			} 
		 }
	  }		
   }
}