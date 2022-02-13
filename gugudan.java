import java.util.*;
public class gugudan {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dan = 0; 
		
		System.out.print("원하시는 단을 입력해주세요(구구단 전부출력을 원하시면0)>");
		
		String dump = in.nextLine();
//		if (!(dump=String)) {
//			System.out.println("숫자를 입력해주세요");
//		}
		dan = Integer.parseInt(dump);
		
		in.close();
		
		if (dan==0) {
			for (int i = 2; i<10; i++) {
				for (int j = 1; j <10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		}else if (!(dan==0)) {
			for (int i = 1; i<10; i++)
		{
			System.out.println(dan + "*" + i +"="+ i * dan);	
		}
	}

}
}