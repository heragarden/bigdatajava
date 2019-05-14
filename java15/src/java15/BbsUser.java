package java15;

import java.util.Scanner;

public class BbsUser {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.print("검색할 ID입력>> ");
		String inputId = sc.next();
		
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = dao.select(inputId);
		if(dto == null) {
			System.out.println("검색된 값이 없습니다.");
		}else {
			System.out.println("검색된 id: " + dto.getId());
			System.out.println("검색된 title: " + dto.getTitle());
			System.out.println("검색된 content: " + dto.getContent());
			System.out.println("검색된 etc: " + dto.getEtc());
		}
	}
}
