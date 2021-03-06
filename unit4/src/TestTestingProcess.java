import java.util.ArrayList;

import com.pj.unit4.Iphone5;
import com.pj.unit4.Lumia1020;
import com.pj.unit4.Phone;
import com.pj.unit4.SamsungNote3;
import com.pj.unit4.TestLead;
import com.pj.unit4.TestTasks;
import com.pj.unit4.Tester;


public class TestTestingProcess {
	/**
	 * Simulation of mobile software testing process
	 */
	public static void main(String[] args) {
		ArrayList<Tester> testers = new ArrayList<Tester>();
		TestTasks tasks = new TestTasks();
		Tester t1 = new Tester("max","Automation Tests");
		Tester t2 = new Tester("pasha","Manual Tests");
		Tester t3 = new Tester("masha","regression tester");
		testers.add(t1);
		testers.add(t2);
		testers.add(t3);
		TestLead dasha = new TestLead(tasks,testers);
		ArrayList<Phone> phones = new ArrayList<Phone>();
		Phone p1 = new Lumia1020("yellow", "172.16.10.1");
		Phone p2 = new SamsungNote3("blue", "172.16.10.2");
		Phone p3 = new Iphone5("red", "172.16.10.3");
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		dasha.organizeTestProcess(phones);
		
		

	}

}
