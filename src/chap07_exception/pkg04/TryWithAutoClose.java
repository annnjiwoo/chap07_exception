package chap07_exception.pkg04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithAutoClose {// 리소스란 데이터를 제공하는 객체
	public static void main(String[] args) {

		try (FileReader reader = new FileReader("c:/filetest/input.txt")) {
			// try에서 바로 자원 오픈(open)
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (FileNotFoundException f) {
			System.out.println("파일이 존재하지 않거나 경로가 잘못되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
