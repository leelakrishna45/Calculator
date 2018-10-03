package calculatorApp;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.cg.demo.Calculator;

public class TestCalci {

	@Test
	public void testAdd() {
		Calculator c1=new Calculator();
		int res=c1.add(3, 6);
		Assert.assertEquals(9, res);
	}
	
	@Test
	public void testSubract() {
		Calculator c1=new Calculator();
		int res=c1.subract(6, 3);
		Assert.assertEquals(3, res);
	}
	
	@Test
	public void testMultiply() {
		Calculator c1=new Calculator();
		int res=c1.multiply(3, 6);
		Assert.assertEquals(18, res);
	}
	@Test
	public void testdiv() {
		Calculator c1=new Calculator();
		double res=c1.divide(6, 3);
		Assert.assertEquals(2.00, res);
	}
	
	
}
