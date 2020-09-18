package listener;

public class SecoundClass {

	public interface CheckListener {
		public void checkInput();
	}
	
	public CheckListener checkListener;
	
	public void setListener(CheckListener checkListener){
		this.checkListener=checkListener;
	}
	
	public void check(){
		if(this.checkListener!=null){
			this.checkListener.checkInput();
		}
	}
}
