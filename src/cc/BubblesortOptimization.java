package cc;

public class BubblesortOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int [] array=new int[5];
		
		array[0]=95;
		array[1]=35;
		array[2]=12;
		array[3]=23;
		array[4]=57;
		
		for(int i=1;i<(array.length);i++) {
			boolean swapped=false;
				for(int j=1;j<=(array.length-i);j++) {
					if(array[j-1]>array[j]) {
						int x=array[j];
						array[j]=array[j-1];
						array[j-1]=x;
					    swapped=true;
				}
			}
		}
		for (int n=0;n<5;n++) {
			System.out.println(array[n]);
			
		}
	}
 }


