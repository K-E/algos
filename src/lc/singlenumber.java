package lc;

import java.util.ArrayList;
import java.util.Arrays;

public class singlenumber {

	public static void main(String[] args) {
		int[] A	= {2,2,3,3,4,5,5,6,6,11,11,7};
		ArrayList<int> hm	= new ArrayList<int>(Arrays.asList(A));
		System.out.println(hm.toString());
		for(int i=0;i<hm.size();i++)
		{
			/*int temp = Integer.valueOf(hm.get(i).toString());
			hm.remove(i);
			if(!hm.contains(temp))
				System.out.println(temp);
			*/	//return temp;
		}
		//return 0;
	}
}
