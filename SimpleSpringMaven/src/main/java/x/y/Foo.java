package x.y;

public class Foo {
	
	Bar bar;
	
	public Foo(Bar bar) {
		super();
		this.bar = bar;
	}
	
	public void doFoo(){
		bar.doBar();
	}
}
