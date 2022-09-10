public class Pro2 {
	public static void main(String[] args){
		int sum = 0, t = 0;
		int [] a = {1, -2, 3, -2, 5, 1};
		for(int i = 0; i < a.length;i++){
			if(t > 0) t += a[i];
			else t = a[i];
			if(t > sum) sum = t; 
		}
		System.out.println(sum);
	}
}