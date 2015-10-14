package classes.staticinnerclass;

public class Foo {

	   class Bar {
	      private final Foo $foo;

	      Bar(Foo foo) {
	          this.$foo = foo;
	      }    

	      public void someMethod() {
	          $foo.doSomething();
	          Foo.this.doSomething();
	      }	      
	      
	   }
	   
	   public void doSomething(){
		   System.out.println("Hello World");
	   }
	   
	}
