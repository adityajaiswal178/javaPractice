package corejava;

public class ForStatement {
	public static boolean isPrime(int number){
		
		if(number==1||number==0){
			return false;
		}
		for(int i=2; i<=number/2;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
		
		
	}
	public static void main(String[] args) {
/*		int no =100;
		int prime=0;
		for(int i =10; i<no; i++){
			if(isPrime(i)){
				System.out.println("prime number found is "+i);
				prime++;
			}
		
			if(prime==20){
				break;
			}
		}*/
		int sum = 0;
		int count =0;
		for(int i=1; i<1000;i++){
			if((i%3==0)&&(i%5==0)){
				System.out.println("Number is divisble by 3 and 5 both is "+i);
				sum += i;
				count++;
			}
			if(count==5){
				break;
			}
		}
		System.out.println("Sum of all numbers that met condition "+sum);
	}

}
