//package cal;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class iterates through a LinkedList, adding linearly incrementing values
 * to each consecutive element, and then outputting the values onto a console.
 * 
 * This has been forked from guojinchen's helloworld repository by deandungo.
 * 
 * @author guojinchen
 *
 */
public class Lists {

	/**
	 * Default main class.
	 */
	public static void main(String[] args) {

		/**
		 * Stores the various values.
		 */
		LinkedList linkList = new LinkedList();

		for (int elementCounter = 0; elementCounter < 10; elementCounter++) {
			int elementValue = ((elementCounter + 1) / 2);
			System.out.println("Value for element " + elementCounter + ": " + elementValue);
			linkList.add(elementValue, elementCounter);
		}

        System.out.println(" - List iteration begins here - ");

		/**
		 * Allows iteration through the LinkedList elements.
		 */
		ListIterator listIterator = linkList.listIterator(0);

		/**
		 * Keeps track of the current element.
		 */
		int listCounter = 0;

		while (listIterator.hasNext()) {
			System.out.println("Value for element " + listCounter++ + ": " + listIterator.next());
		}

	}

}
