package HW;

import java.util.Random;
import java.util.Scanner;

public class Main {
	

	
		
		//Soru 3 i�in---->
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
			System.out.println("L�tfen �ifrenizi giriniz: ");
			
			Scanner scanner = new Scanner(System.in);
			String userPassword=scanner.next();
			
			if(!userPassword.equals(password)){
				System.out.println("Giri� Ba�ar�s�z!");
			}else{
				System.out.println("Giri� Ba�ar�l�!");
			}
			
			System.out.println("----------------------------------------------1");
			
			//Soru2
			
			
			 System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz");
			 System.out.println("1- Toplama");
	         System.out.println("2- ��karma");
			 System.out.println("3- B�lme");
			 System.out.println("4- �arpma");
		
			int operationChoice=scanner.nextInt();
			

			 
			 System.out.println("l�tfen i�lem yapaca��n�z iki say�y� belirtiniz:");
			 System.out.print("�lk say�n�z: ");
			 int firstNumber = scanner.nextInt();
			 
			 System.out.print("�kinci say�n�z: ");
			 int secondNumber = scanner.nextInt();
			 
			 int result;
			 
			 switch(operationChoice){
			
			
			 case 1:
				 result=firstNumber+secondNumber;
				 System.out.println("Toplama i�lemi i�in sonucunuz: "+result);
				 
				 break;
			 
			 case 2:
				 result=firstNumber-secondNumber;
				 System.out.println("��karma i�lemi i�in sonucunuz: "+result);
				 break;
			 
			 case 3:
				 result=firstNumber*secondNumber;
				 System.out.println("�arpma i�lemi i�in sonucunuz: "+result);
				 break;
			 
			 case 4:
				 result=firstNumber/secondNumber;
				 System.out.println("B�lme i�lemi i�in sonucunuz: "+result);
				 break;
				 
				 default:
					 System.out.println("L�tfen ge�erli bir i�lem tipi se�iniz");
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
						System.out.println("Dizinin "+ i +". eleman� "+array[i]+" say�s�d�r ve bir �ift say�d�r");
					}
					else{
						System.out.println("Dizinin "+ i  +". eleman� "+array[i]+" say�s�d�r ve bir tek say�d�r");
					}
				}
				
				 System.out.println("--------------------------------------------------5");

				
				//Soru 6
				
				PDFDocument javaDoc = new PDFDocument("java document");
				WordDocument pythonDoc = new WordDocument("python document");
				Printer print = new Printer();
				
				print.printPDFDocument(javaDoc);
				print.printWordDocument(pythonDoc);
				
			 // static kulland�k ��nk� main method bir statictir ve static olmayan metodlar� main metodun i�inde kullanamay�z.
			
		}

}



