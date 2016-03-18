import static org.junit.Assert.*;

import org.junit.Test;

public class junit_case {

	@Test
	public void test() {
		assertEquals(2,TestTri.checkTri(3, 4, 5));
	}
	
	@Test
	public void test1(){
		assertEquals(3,TestTri.checkTri(3, 4, 6));
	}
	
	@Test
	public void test2(){
		assertEquals(1,TestTri.checkTri(5, 5, 5));
	}
	
	@Test
	public void test3(){
		assertEquals(1,TestTri.checkTri(5, 5, 4));
	}
	
	@Test
	public void test4(){
		assertEquals(1,TestTri.checkTri(4, 4, 5));
	}
	
	@Test
	public void test5(){
		assertEquals(2,TestTri.checkTri(5, 4, 3));
	}
	
	@Test
	public void test6(){
		assertEquals(2,TestTri.checkTri(3, 5, 4));
	}
	
	@Test
	public void test7(){
		assertEquals(3,TestTri.checkTri(3, 6, 4));
	}
	
	@Test
	public void test8(){
		assertEquals(3,TestTri.checkTri(6, 3, 4));
	}
}
