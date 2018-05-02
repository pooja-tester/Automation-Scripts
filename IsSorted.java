package fdgfgd.fggvgfguf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.util.PropertySource.Comparator;

public class IsSorted {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(6);
		l.add(5);
		
		IsSorted s= new IsSorted();
		s.compareTo(l);
		
		
	}

	public void  compareTo(List<Integer> l) {
		List tmp = new ArrayList<Integer>(l);
		Collections.sort(tmp);
		boolean sorted= tmp.equals(l);
		System.out.println(sorted);
	}

}
