package skeleton;

import java.util.concurrent.TimeUnit;


public class Belly {

	int mycukeinbelly;
	int myhours;

    public void eat(int cukes) {
    	Belly.this.mycukeinbelly = cukes; 
    }
    public void hours(int hours) {
    	Belly.this.myhours = hours; 
    }
    public int size() {
    	try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	return Belly.this.mycukeinbelly * Belly.this.myhours ;
    }
}
