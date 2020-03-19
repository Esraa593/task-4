import java.util.Arrays;

public class p1 {

	public static void main(String[] args) {
		int [] A={1, 2, 3, 5, 6, 7, 9, 11};
		int [] B={0, 1, 4, 6, 8};
		int [] C=new int [A.length+B.length];
		int i=0;
		int j=0;
		int k=0;
		while((i<A.length)&&(j<B.length)&&(k<C.length)){
			if(A[i]<=B[j]){
				C[k]=A[i];
				i++;
			}else{
				C[k]=B[j];
				j++;
			}
			k++;
		}
		while(i<A.length){
			C[k]=A[i];
			i++;
			k++;
		}
		while(j<B.length){
			C[k]=B[j];
			j++;
			k++;
		}
		System.out.println("the merged array = "+Arrays.toString(C));
	}
}
