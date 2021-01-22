package mini1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SetMember {
	
	public void setMember() {
		
		System.out.println("====회원가입창입니다====");
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		String signupDate = date.format(new Date());
		
		String id = "" ;
		String pwd = "" ;
	

//		id = membermanager.idChack();
		
//		pwd = membermanager.pwdChack();
		

		
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();
		
		System.out.print("주소를 입력하세요 :");
		String  adrr = sc.nextLine();
		
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별을 입력하세요 :");
		char  gender = sc.next().charAt(0);
		sc.nextLine();
		
		Member user = new Member(id, pwd, name, adrr, age, gender, signupDate);
		
		
		
	}
		
	

}
