package text6;

import java.util.Date;

public class T9_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	    Date date = new Date();
	    
	    int count = 1;
	    long time = 10000;
	    
	    while (count <= 8) {
	      date.setTime(time);
	      System.out.println(date.toString());   
	      count++;
	      time *= 10;
	    }
	}

}
