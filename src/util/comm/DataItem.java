package util.comm;

class DataItem {
	private Thread TID; // The consumer thread
	private Object q[]; // Queued values for thread
	private int nQueue; // Number of items in the Queue
	private int dataStatus; // Status of the queue

	// legal Queue status values
	final static int NONE = 0; // No data available
	final static int NEW = 1; // New data available
	final static int OVERRUN = 2; // Data overrun (queue overflow)

	DataItem(Thread t, int Q) {
		q = new Object[Q];
		nQueue = 0;
		TID = t;
		dataStatus = NONE;
	}

	/** shorter version for a queue size of two (2) */
	DataItem(Thread t) {
		this(t, 2);
	}
}