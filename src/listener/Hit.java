package listener;

public class Hit {

	public interface HitMan {
		public void hitHead();
	}

	public HitMan hitMan;

	public void setHitListener(HitMan hitMan) {
		this.hitMan = hitMan;
	}

	public void checkHit() {
		if (hitMan != null) {
			hitMan.hitHead();
		}

	}

}
