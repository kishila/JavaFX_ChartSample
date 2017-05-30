package chartComponent;

import java.util.Random;

public class PlotData {

	public static int value[] = new int[50];

	static {
		resetData();
	}

	static public void resetData(){
		Random rnd = new Random();
        for(int i=0;i<50;i++){
        	value[i] = rnd.nextInt(50);
        }
	}

}
