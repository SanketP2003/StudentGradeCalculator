import java.util.*;
/*
 * Grading System percentage wise
 * 96-100 A+
 * 91-95  A
 * 81-90  B+
 * 71-80  B
 * 61-70  C+
 * 51-60  C
 * 41-50  D
 * <40	  Fail
 * */
public class task2  {
	static int subCou;
	static float [] marks;
	static Scanner sc = new Scanner(System.in);
	
	//Using recursion for getting correct marks 
	static void forInput (int index, float value) {
		if (value >= 101 || value <=-1) {
			System.out.println("incorrect input enter correct marks!!!");
			System.out.print("Subject "+index+" :- ");
			marks[index-1]=sc.nextFloat();
			forInput(index, marks[index-1]);
		}
	}
	
	static String gradeAssign (float total ) {
		if(total>=96 && total<=100) {
			return "A+";
		}
		else if(total>=91 && total<=95) {
			return "A";
		}
		else if(total>=81 && total<=90) {
			return "B+";
		}
		else if(total>=71 && total<=80) {
			return "B";
		}
		else if(total>=61 && total<=70) {
			return "C+";
		}
		else if(total>=51 && total<=60) {
			return "C";
		}
		else if(total>=41 && total<=50) {
			return "D";
		}
		else {
			return "F (FAIL)";
		}
	}
	
	public static void main(String[] args) {
		float total=0;
		System.out.println("******* GRADE CALCULATOR *******");
		System.out.print("\nEnter Number of Subjects :- ");
		
		subCou = sc.nextInt();
		System.out.println();
		System.out.println("******* ENTER MARKS *******\n");
		
		marks =  new float[subCou];
		for (int i = 1; i <= subCou; i++) {
			System.out.print("Subject "+i+" :- ");
			marks[i-1]=sc.nextFloat();
			task2.forInput(i, marks[i-1]);
		}
		
		System.out.println("\n******* RUSULT *******\n");
		for (int i = 0; i < marks.length; i++) {
			total+=(marks[i]);
		}
		System.out.println("Total marks = "+total+"\n");
		float ans =(total/(subCou*100))*100;
		System.out.printf("Percentage = %.2f",ans);
		System.out.print(" %\n\n");
		System.out.println("Grade = "+task2.gradeAssign(ans));
	}
}