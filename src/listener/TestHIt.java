package listener;

import listener.Hit.HitMan;

public class TestHIt {

	public Hit hit;

	public TestHIt() {
		hit = new Hit();
		hit.setHitListener(new HitMan() {

			@Override
			public void hitHead() {
				System.out.println(" hit head of man ");
			}
		});
	}

	public static void main(String[] args) {
		TestHIt testHIt = new TestHIt();
		testHIt.hit.checkHit();

	}

}
