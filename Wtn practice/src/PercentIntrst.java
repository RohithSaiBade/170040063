
public class PercentIntrst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gen="female";
		int age=98,p=1000;
		float Intrest;
		if(gen.equals("female") && age>=1 && age<=58)
		  {
			System.out.println("intrest percent is 8.2%");
		  }
		  else if(gen.equals("female") && age>=59 && age<=100)
		  {
			  System.out.println("intrest percent is 9.2%");
		  }
		  else if(gen.equals("male") && age>=1 && age<=58)
		  {
			  System.out.println("intrest percent is 8.4% ");
		  }
		  else if(gen.equals("male") && age>=59 && age<=100)
		  {
			  System.out.println("intrest percent is 10.5% ");
		  }
		  else
		  {
			  System.out.println("invalid input");
		  }
			  
	}

}
