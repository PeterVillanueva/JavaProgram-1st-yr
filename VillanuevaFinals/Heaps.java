package VillanuevaFinals;

import java.util.Scanner;

// create class MinHeap to construct Min heap in Java  
class Heaps {
	// declare array and variables
	private int[] heapData;
	private int sizeOfHeap;
	private int heapMaxSize;

	// use constructor to initialize heapData array
	public Heaps(int heapMaxSize) {
		this.heapMaxSize = heapMaxSize;
		this.sizeOfHeap = 0;
		heapData = new int[this.heapMaxSize + 1];
		heapData[0] = Integer.MIN_VALUE;
	}

	// create getParentPos() method that returns parent position for the node
	private int getParentPosition(int position) {
		return position / 2;
	}

	// create getLeftChildPosition() method that returns the position of left child
	private int getLeftChildPosition(int position) {
		return (2 * position);
	}

	// create getRightChildPosition() method that returns the position of right
	// child
	private int getRightChildPosition(int position) {
		return (2 * position) + 1;
	}

	// checks whether the given node is leaf or not
	private boolean checkLeaf(int position) {
		if (position >= (sizeOfHeap / 2) && position <= sizeOfHeap) {
			return true;
		}
		return false;
	}

	// create swapNodes() method that perform swapping of the given nodes of the
	// heap
	// firstNode and secondNode are the positions of the nodes
	private void swap(int firstNode, int secondNode) {
		int temp;
		temp = heapData[firstNode];
		heapData[firstNode] = heapData[secondNode];
		heapData[secondNode] = temp;
	}

	// create minHeapify() method to heapify the node for maintaining the heap
	// property
	private void minHeapify(int position) {

		// check whether the given node is non-leaf and greater than its right and left
		// child
		if (!checkLeaf(position)) {
			if (heapData[position] > heapData[getLeftChildPosition(position)]
					|| heapData[position] > heapData[getRightChildPosition(position)]) {

				// swap with left child and then heapify the left child
				if (heapData[getLeftChildPosition(position)] < heapData[getRightChildPosition(position)]) {
					swap(position, getLeftChildPosition(position));
					minHeapify(getLeftChildPosition(position));
				}

				// Swap with the right child and heapify the right child
				else {
					swap(position, getRightChildPosition(position));
					minHeapify(getRightChildPosition(position));
				}
			}
		}
	}

	// create insertNode() method to insert element in the heap
	public void insertNode(int data) {
		if (sizeOfHeap >= heapMaxSize) {
			return;
		}
		heapData[++sizeOfHeap] = data;
		int current = sizeOfHeap;

		while (heapData[current] < heapData[getParentPosition(current)]) {
			swap(current, getParentPosition(current));
			current = getParentPosition(current);
		}
	}

	// createdisplayHeap() method to print the data of the heap
	public void displayHeap() {
		System.out.println("PARENT NODE" + "\t" + "LEFT CHILD NODE" + "\t" + "RIGHT CHILD NODE");
		for (int k = 1; k <= sizeOfHeap; k++) {
			System.out.print(" " + heapData[k] + "\t\t\t\t");
			if (getLeftChildPosition(k) <= sizeOfHeap) {
				System.out.print(heapData[getLeftChildPosition(k)] + "\t\t\t\t");
			} else {
				System.out.print("-\t\t\t\t");
			}
			if (getRightChildPosition(k) <= sizeOfHeap) {
				System.out.print(heapData[getRightChildPosition(k)]);
			} else {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	// create designMinHeap() method to construct min heap
	public void designMinHeap() {
		for (int position = (sizeOfHeap / 2); position >= 1; position--) {
			minHeapify(position);
		}
	}



// create MinHeapJavaImplementation class to create heap in Java  

	// main() method start
	public static void main(String[] args) {
		// declare variable
		int heapSize;

		// create scanner class object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Min Heap");
		heapSize = sc.nextInt();

		Heaps heapObj = new Heaps(heapSize);

		for (int i = 1; i <= heapSize; i++) {
			System.out.print("Enter " + i + " element: ");
			int data = sc.nextInt();
			heapObj.insertNode(data);
		}

		// close scanner class obj
		sc.close();

		// construct a min heap from given data
		heapObj.designMinHeap();

		// display the min heap data
		System.out.println("The Min Heap is ");
		heapObj.displayHeap();

	}
}