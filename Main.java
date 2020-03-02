package HW;

import java.util.Random;
import java.util.Scanner;

public class Main {
	

	
		
		//Soru 3 için---->
		public static int avarageFunction(int[] array ){
			
			int total=0;
			for(int i=0;i<array.length;i++){
				total= total+array[i];
			}
			
			return total/array.length;
			
		}
		
		
		public static void main(String[] args){
			
			
			//Soru1
			String password="2323";
			System.out.println("Lütfen þifrenizi giriniz: ");
			
			Scanner scanner = new Scanner(System.in);
			String userPassword=scanner.next();
			
			if(!userPassword.equals(password)){
				System.out.println("Giriþ Baþarýsýz!");
			}else{
				System.out.println("Giriþ Baþarýlý!");
			}
			
			System.out.println("----------------------------------------------1");
			
			//Soru2
			
			
			 System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz");
			 System.out.println("1- Toplama");
	         System.out.println("2- Çýkarma");
			 System.out.println("3- Bölme");
			 System.out.println("4- Çarpma");
		
			int operationChoice=scanner.nextInt();
			

			 
			 System.out.println("lütfen iþlem yapacaðýnýz iki sayýyý belirtiniz:");
			 System.out.print("Ýlk sayýnýz: ");
			 int firstNumber = scanner.nextInt();
			 
			 System.out.print("Ýkinci sayýnýz: ");
			 int secondNumber = scanner.nextInt();
			 
			 int result;
			 
			 switch(operationChoice){
			
			
			 case 1:
				 result=firstNumber+secondNumber;
				 System.out.println("Toplama iþlemi için sonucunuz: "+result);
				 
				 break;
			 
			 case 2:
				 result=firstNumber-secondNumber;
				 System.out.println("Çýkarma iþlemi için sonucunuz: "+result);
				 break;
			 
			 case 3:
				 result=firstNumber*secondNumber;
				 System.out.println("Çarpma iþlemi için sonucunuz: "+result);
				 break;
			 
			 case 4:
				 result=firstNumber/secondNumber;
				 System.out.println("Bölme iþlemi için sonucunuz: "+result);
				 break;
				 
				 default:
					 System.out.println("Lütfen geçerli bir iþlem tipi seçiniz");
					 break;
			 
			 }
			 System.out.println("----------------------------------------------2");
			
			 //Soru3
			
			int[] array = new int[100];
			for(int i=0; i<100; i++) {
				Random random = new Random();
				int number = random.nextInt(100)+1;
				array[i] = number;
			}
			System.out.println(avarageFunction(array));
			
			System.out.println("------------------------------------------------3");
			//Soru4
			 
			 for(int i =0;i<10;i++){
				
				 for(int j=0;j<10;j++){
					 if(i>=j){
						 System.out.print("*"); 
					 }
					 
				 }
				 System.out.println(""); 
			 }
			 System.out.println("--------------------------------------------------4");

			 
			 //Soru5
			
				int[] array2 = new int[100];
				for(int i=0; i<100; i++) {
					Random random = new Random();
					int number2 = random.nextInt(100)+1;
					array2[i] = number2;
				}
				
				for(int i=0;i<array2.length;i++){
					if(array[i]%2==0){
						System.out.println("Dizinin "+ i +". elemaný "+array[i]+" sayýsýdýr ve bir çift sayýdýr");
					}
					else{
						System.out.println("Dizinin "+ i  +". elemaný "+array[i]+" sayýsýdýr ve bir tek sayýdýr");
					}
				}
				
				 System.out.println("--------------------------------------------------5");

				
				//Soru 6
				
				PDFDocument javaDoc = new PDFDocument("java document");
				WordDocument pythonDoc = new WordDocument("python document");
				Printer print = new Printer();
				
				print.printPDFDocument(javaDoc);
				print.printWordDocument(pythonDoc);
				
			 // static kullandýk çünkü main method bir statictir ve static olmayan metodlarý main metodun içinde kullanamayýz.
			
		}

}



