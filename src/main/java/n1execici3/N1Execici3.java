package n1execici3;

import java.util.ArrayList;
import java.util.List;

public class N1Execici3 {

	public static void main(String[] args) {
		List<String> mesos = new ArrayList<String>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		
		
		mesos.forEach(m -> System.out.println(m));

	}

}
