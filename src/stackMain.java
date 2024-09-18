import java.util.Scanner;

/*class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}*/	

/*class SelectionSort {
	void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}*/

/*class LinearSearch {
	public static int search(int arr[], int x) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}*/

public class stackMain {

	public static void main(String[] args) {
		boolean quit = false;
		String input;
		
		CarStack cs = new CarStack();
		
		CarHistory ch = new CarHistory();
		
		RoundsResults rr = new RoundsResults();
		
		//BubbleSort bs = new BubbleSort ();
		//SelectionSort ss = new SelectionSort ();
		//LinearSearch ls = new LinearSearch();
		
		Scanner scan = new Scanner(System.in);
		
		//coded by Dhashen Musafer COL00078824
		
		while(!quit) {
			System.out.println("Press E to enter car details, H to go to car history, R to enter the rounds results, or Q to quit");
			input = scan.next();
				
			if (input.equalsIgnoreCase("H")) {
				System.out.println("The history of registered car numbers from oldest to newest are as follows: ");
				ch.display();
				System.out.println();
				
				/*int arr[] = ch.stack;
				bs.bubbleSort(arr);
				System.out.println("With the use of Bubble Sort, the sorted array is as follows: ");
				bs.printArray(arr);*/
				
				/*int arr[] = ch.stack;
				ss.selectionSort(arr);
				System.out.println("With the use of Selection Sort, the sorted array is as follows: ");
				ss.printArray(arr);*/
				
				/*int arr[] = ch.stack;
				int x = 333;
				int result = ls.search(arr, x);
				if(result == -1) {
					System.out.println("Element is not present in array");
				}
				else {
					System.out.println("Element is present at index " + result);
				}*/
				
			}
			else if (input.equalsIgnoreCase("E")) {
				
				boolean repeat = true;
				while(repeat) {
					try {
						System.out.println("Please enter the car's number");
						int carNo = scan.nextInt();
						cs.push(Integer.toString(carNo));
						ch.push(carNo);
						repeat = false;
					} 
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Array Index is out of bounds!");
					}
					catch (Exception e) {
						System.out.println("Please enter an integer value for the car number!");
						scan.next();
					}
				}
				
				System.out.println("Please enter the car's brand");
				String brand = scan.next();
				cs.push(brand);
						
				System.out.println("Please enter the car's sponsor");
				String sponsor = scan.next();
				cs.push(sponsor);
						
				System.out.println("Please enter the car driver's name");
				String driverName = scan.next();
				cs.push(driverName);
						
				System.out.println("The car details you have entered are as follows (Car's number, brand, sponsor, driver's name): ");
				cs.display();
			}
			else if (input.equalsIgnoreCase("R")) {
				int carNo = 0;
				for (int k = 1; k <= 3; k ++) {
					System.out.println("Input the results for round " + k);
					int l = 0;
					l = k;
					while (l <= 6) {
						carNo = scan.nextInt();
						rr.push(carNo);
						l++;	
					}
					rr.pop();
					System.out.println("Car number " + carNo + " has been eliminated in round " + k);
					System.out.println();
				}
				System.out.println("The winners for the race are");
				rr.displayWinners();
			}
			else if (input.equalsIgnoreCase("Q")) {
				quit = true;
			}
		}	
		scan.close();
		System.out.println("Thank you! Good bye!");	
	}
}
