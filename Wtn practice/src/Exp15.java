
public class Exp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		int n=346;
		for(i=0;n!=0;n=n/10)
		{
			sum=sum+(n%10);
		}
		System.out.println(sum);

	}

}
