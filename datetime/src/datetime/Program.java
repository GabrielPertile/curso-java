package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		LocalDate d04 = LocalDate.parse("2023-03-27");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2023-03-27T01:30:26");
		System.out.println(d05);
		
		LocalDate d06 = LocalDate.parse("27/05/2023", fmt1);
		System.out.println(d06);
//		
//		Instant d03 = Instant.now();
//		System.out.println(d03);
	}

}
