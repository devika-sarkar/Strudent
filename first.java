    class FibonacciExample1{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i,count=10;    
     System.out.print(n1+" "+n2);
        
     for(i=2;i<count;++i)   
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }}
class Armstrong {
public static void main(String[] args) {

	int num,digit;
	double cubeSum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	num=n;
	while(n!=0) {
		digit=n%10;
		cubeSum=cubeSum+Math.pow(digit, 3);
		n/=10;
	}
	if(cubeSum==num) {
		System.out.println("Armstrong: "+ num);
	}
	else {
		System.out.println("not a armstrong");
	}
}
}
