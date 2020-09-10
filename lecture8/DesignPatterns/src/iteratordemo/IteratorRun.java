package iteratordemo;

import java.util.ArrayList;
import java.util.List;

public class IteratorRun {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("David");
		students.add("Wastor");
		students.add("Mily");
		students.add("Cheery");
		StudentList studentList = new StudentList();
		studentList.students = students;
		while(studentList.hasNext()){
			System.out.println(studentList.next());
		}
	}
}
