/**
 * The <code>HoorayListDemo</code> class simulates and tests the methods of the <code>HoorayList</code> data structure, including
 * adds (both implementations), removes (both implementations), set and toString.  Implicit in these methods are
 * calls to ensureCapacity, indexOf and contains.
 * 
 * @author Michael Paulding
 * @version 1.0
 */
public class HoorayListDemo {

	/**
	 * Main method is the entry point to the HoorayListDemo.
	 * 
	 * @param args Command line arguments (not used in this application)
	 */
	public static void main(String[] args) {
		HoorayList<String> ourNames = new HoorayList<>();
		ourNames.add("Jorge");
		ourNames.add("Haylee");
		ourNames.add("Zynthia");
		ourNames.add("Paulding");
		ourNames.add("Tressa");
		ourNames.add("JC");
		ourNames.add("Cory");

		ourNames.remove(3);

		System.out.println(ourNames);

	}

}
