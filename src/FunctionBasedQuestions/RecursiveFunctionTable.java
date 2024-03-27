package FunctionBasedQuestions;

public class RecursiveFunctionTable 
{
	
	 void table(int n,int i)
	 {
		 if(i == 11)
			 return;
		 
		 System.out.println(n*i);
		 i++;
		 table(n,i);
		 		 		
	 }
		
	
	public static void main(String[] args) {
	
		int num = 5;
		RecursiveFunctionTable obj = new RecursiveFunctionTable();
		obj.table(num, 1);
		
	}
	

}


