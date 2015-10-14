package Threads.Random;

public class TestUnsynchronized {
	  int taskID;

	  public void doAction(int val) {
	    print("entering doAction()");
	    taskID = val;
	    print("doAction() taskID " + taskID);
	    try {
	      Thread.sleep(4000);
	    } catch (InterruptedException x) {
	    }
	    print("doAction() sleep after taskID " + taskID);
	    print("leaving performATask()");
	  }
	  
	  // Output?
	  
	  //entering doAction()
	  //doAction() taskID 3// 0 ms
	  //entering doAction()//after 2000 ms
	  //doAction() taskID 7 
	  //doAction() sleep after taskID 7 //after 4000 ms - thread is of task 3 but the value of taskid has been changed.
	  //leaving performATask()
	  //doAction() sleep after taskID 7 //after 6000 ms
	  //leaving performATask()

	  public static void print(String msg) {
	    String threadName = Thread.currentThread().getName();
	    System.out.println(threadName + ": " + msg);
	  }

	  public static void main(String[] args) throws Exception {
	    final TestUnsynchronized tus = new TestUnsynchronized();

	    Runnable runA = new Runnable() {
	      public void run() {
	        tus.doAction(3);
	      }
	    };

	    Thread ta = new Thread(runA, "threadA");
	    ta.start();

	    Thread.sleep(2000);

	    Runnable runB = new Runnable() {
	      public void run() {
	        tus.doAction(7);
	      }
	    };

	    Thread tb = new Thread(runB, "threadB");
	    tb.start();
	  }
	}