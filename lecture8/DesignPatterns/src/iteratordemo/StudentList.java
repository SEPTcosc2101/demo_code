package iteratordemo;

import java.util.ArrayList;
import java.util.List;

public class StudentList implements MyIterator {
	List<String> students = new ArrayList<>();
	int currentItem = 0;
	
	@Override
	public boolean hasNext() {
		if(currentItem >= students.size()){
			currentItem = 0;
			return false;
		}
		return true;
	}
	
	@Override
	public Object next() {
		return students.get(currentItem++);
	}
}