package mini1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class MemberDB {
	
	
	public void saveDBMethod() {
		
		Member user = new Member("rlatngud", "rlatngud", "김수형", "강남구", 20, '남', "2021-01-21");
		
		 FileOutputStream fos = null;
	     ObjectOutputStream oos = null;
	     
	     try {
	         
	         if(new File("C:/miniDB/miniDB.txt").exists()) // 저장할 파일 위치 임닌다 마지막 텍스트 
	         {
	          
	          fos = new FileOutputStream("C:/miniDB/miniDB.txt", true);    
	          oos = new MyOutputStream(fos);
	         }else
	         {
	        
	          fos = new FileOutputStream("C:/miniDB/miniDB.txt", true);    
	          oos = new ObjectOutputStream(fos);
	         }
	      
	         oos.writeObject(user);
	         oos.flush();
	         

	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{	// 때려죽어도 무조건 실행됨
				try {
				if(oos != null) {
					oos.close();
					} 
				if(fos != null) {
					fos.close();
					} 
				}catch (IOException e) {
					e.printStackTrace();
				}
		
			}
			
	}
	
//	ArrayList<Member>
	public ArrayList<Member> loadingDBMethod() {
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		FileInputStream fis =  null;
		ObjectInputStream ois = null;
		Object ojt = null;
		
		
		try {
			fis = new FileInputStream(new File("C:/miniDB/miniDB.txt")); 
			ois = new ObjectInputStream(fis);
			ojt = ois;
			while((ojt = ois.readObject()) != null){
//				System.out.println((Member) ojt);
				list.add((Member) ojt) ;
			}
			
		
			
			
			
		}catch (EOFException e){ // 반본문 쓸떄 오류방지
	         System.out.println("파일을 다 읽었습니다.");
	    }catch (Exception e) {
			e.printStackTrace();
		}finally{	
			try {
			if(ois != null) {
				ois.close();
				} 
			if(fis != null) {
				fis.close();
				} 
			}catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	

}
