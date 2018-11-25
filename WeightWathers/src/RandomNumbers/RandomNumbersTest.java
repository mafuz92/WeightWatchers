package RandomNumbers;

import java.util.*;

class RandomNumbersTest {

	public static void main(String[] args) {

		Random ran=new Random();
		ArrayList<Integer> ar=new ArrayList<Integer>();

		for(int i=0;i<=500;i++){

			ar.add(ran.nextInt(1000));
		}

		//Sorting using collections

		Collections.sort(ar);
		System.out.println(ar.get(8));

		//Sorting without Collections



//		for(int k=0;k<ar.size();k++){
//			for(int j=k+1;j<ar.size();j++){
//				//int ss=(int) ar.get(k);
//				if((int) ar.get(k)>(int) ar.get(j)){
//
//					int temp=(int) ar.get(k);
//					ar.set(k, ar.get(j));
//					ar.set(j, temp);
//				}
//				System.out.println(ar.get(8));
//			}
//		}
	}}








