class Person
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String talk()
	{
		return "我是:"+this.name+",今年："+this.age+"岁";
	}
}

class TestObjectArray1
{
		public static void main(String[] args)
		{
			Person p[]=
				{
					new Person("abc",26),new Person("bcd",23),new Person("ert",12)
				};
			for(int i=0;i<p.length;i++)
				System.out.println(p[i].talk());
		}
}