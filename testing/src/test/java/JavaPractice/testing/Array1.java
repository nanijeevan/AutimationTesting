package JavaPractice.testing;

public class Array1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object a[]=new Object[5];
			a[0]=10;
			a[1]="abcd";
			a[2]=true;
			a[3]='c';
			a[4]=5.2;	
           for(int i=0;i<a.length;i++)
           {
        	   System.out.println(a[i]);
           }
}
}