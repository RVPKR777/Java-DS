import java.util.*;
public class sample {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		int n=sc.nextInt();
		int a[]= new int[n];
		int d[]= new int[n];
		int g[] = new int[n];
		int atemp[]= new int[n];
		int m=0;
		int keym=0;
		for(int i=0; i<n;i++)
		{
			a[i]=sc.nextInt();
			d[i]=a[i];	
		}
		for(int i = 0; i<n; i++) {   //you didnt have the second input for loop
			g[i] = sc.nextInt();
		}
		
		ArrayList<Integer> t= new ArrayList<Integer>();
		ArrayList<Integer> ks= new ArrayList<Integer>();
		ArrayList<Integer> cs= new ArrayList<Integer>();
		ArrayList<Integer> kv= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)      //i<a.length not atemp.size
		{
			if(t.contains(a[i]))		//a[i] not atemp[i]
			{
				continue;
			}
			else
				
			{
				t.add(a[i]);			//same as above
			}
		}
		Collections.sort(t);
		
		for(int i=0;i<t.size();i++)
		{
			int key=t.get(i);
			int count=0;
		
		
		for(int j=0;j<a.length;j++)
		{

			if(key >=a[j] && key <=g[j])
			{
				count++;
			}
			
		}
		ks.add(key);					//This line should be outside the loop it was inside previously
		cs.add(count);					//same as above
		}
		//System.out.println(cs);
		
		for(int i=0;i<cs.size();i++)
		{
			if(cs.get(i)>m)
			{
				m=cs.get(i);
			}
		}
		
		for(int i=0;i<cs.size();i++)
			
		{
			if(cs.get(i)==m)
			{
				kv.add(ks.get(i));
			}
		}
		
		for(int i=0;i<kv.size();i++)			//kv.size not ks.size
		{
			if(i==0)
			{
				keym=kv.get(i);					//you should add in kv not ks
			}
			
			if(kv.get(i)<keym)
			{
				keym=kv.get(i);
			}
			
		}
		
		System.out.println(keym);
		System.out.println(m);
	
	}
}
		
		
		
			
			
			
			
			
			