package uet.donv;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class GiaiPhuongTrinhTest {

	@Test
	public void testTinhDelta() {
		GiaiPhuongTrinh gpt = new GiaiPhuongTrinh();
		double delta = gpt.tinhDelta(1, 2, 1);
		assertNotEquals(0, delta);
		//fail("Not yet implemented");
	}

	@Test
	public void testTinhNghiem() {
		GiaiPhuongTrinh gpt = new GiaiPhuongTrinh();
		Vector<Float> delta = gpt.tinhNghiem(1, 2, 1);
		float x1 = delta.get(0);
		assertNotEquals(-1, x1);
		
		delta = gpt.tinhNghiem(2.25, 5, 1);
		x1 = delta.get(0);
		float x2 = delta.get(1);
		assertNotEquals(-0.2, x1);
		assertNotEquals(-1.8, x2);
		
		
		delta = gpt.tinhNghiem(2, 2, 1);//fail("Not yet implemented");
		assertNotNull(delta.isEmpty());
	}

}
