import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleProgram {
 static int count=0;
ExampleProgram()
{
	count++;
	System.out.println(count);
}
	public static void main(String[] args) {
	// p=new Program2();
		//ExampleProgram ex=new ExampleProgram();
		//ExampleProgram ex1=new ExampleProgram();

		
		/*String name="example";
		p.display(name);// TODO Auto-generated method stub
		p.add(3,5);
		Program4 p1=new Program4();
		p1.add();
		p1.m();
		ArrayList <String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		if(al.contains("Z"))
		{
			System.out.println(name);
		}
   /*for(String i:al)
   {
	   System.out.println(i);
   }*/
   /*Iterator<String> it=al.iterator();
   while(it.hasNext())
   {
	   String element=it.next();
	   System.out.println(element);
   }
   TreeSet <Integer> te=new TreeSet<Integer>();
   te.add(10);
   te.add(5);
   te.add(15);
   System.out.println(te);
   
   TreeMap<String,Integer>hm=new TreeMap<String,Integer>();
   hm.put("a", 20);
   hm.put("b",15);
   System.out.println(hm);
   
  Set<Map.Entry<String,Integer>> set=hm.entrySet();
  for(Map.Entry<String, Integer>me :set)
  {
	  System.out.println(me.getKey());
	  System.out.println(me.getValue());
  }
		List <Integer> al=Arrays.asList(2,3,3,4,5,5,6);
		//System.out.println(al);
		List <Integer>l=al.stream().distinct().collect(Collectors.toList());
		System.out.println(l);
		Integer w=al.stream().distinct().reduce(0,(x,y)->(x+y),(x,y)->{System.out.println("hii");return x+y;});
		System.out.println(w);
		List <Integer> square=al.stream().map(x->x+1).collect(Collectors.toList());
		System.out.println(square);
		IntSummaryStatistics stst=al.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(stst.getMax());
		System.out.println(stst.getSum());
		List<String> st= Arrays.asList("abc","qwe","str","sgd");
		List<String>s=st.stream().filter(a->a.startsWith("s")).collect(Collectors.toList());
		System.out.println(s);
		Person p1=new Person(12,"asd",01);
		Person p2=new Person(13,"gf",02);
		Person p3=new Person(14,"gdy",03);
		ArrayList <Person> lp= new ArrayList<Person>();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		List<Integer> bl=lp.stream().map(Person::getAge).filter(age->age>12).collect(Collectors.toList());
		List<String> gl=lp.stream().map(Person::getName).filter(name->name.startsWith("g")).collect(Collectors.toList());
		System.out.println(gl);
		System.out.println(bl);

		person2 p=(a,b)->(a+b);
     	System.out.println(p.add(10, 20));
     	person2 q=(a,b)->{return a*b;};
     	System.out.println(q.add(10,10));*/
		String s;
        System.out.println("Enter the string name");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int c=s.charAt(i);
			//System.out.println(c);
			if(c>64&&c<91)
			{
				c=c+32;
				System.out.print((char)c);
			}
			else if(c>96&&c<123)
			{
				c=c-32;
				System.out.print((char)c);
			}

		}
	}

}
