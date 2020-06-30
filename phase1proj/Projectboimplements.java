package phase1proj;
import java.io.File;
import java.util.Arrays;

public  class Projectboimplements implements Projectbo
{
	public void createfiles(String Name)
	{
		File createobj=new File("Myfolder\\"+Name);// same for deletion
		if(!createobj.exists())
		{
			try
			{
				createobj.createNewFile();
				System.out.println("file created successfully");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("file already exists");
		}
	}
public void listallfiles()
{
	File objforlist=new File("Myfolder");
	/*  File[] listFiles = objforlist.listFiles();
	 * System.out.println(objforlist.listFiles());
	 * System.out.println(objforlist.list());*/
	//objforlist.delete()
	String[] arr=objforlist.list();
	//int size=arr.length;
	Arrays.sort(arr);
	for(String iterator:arr)
	{
		System.out.println(iterator);
	 }
}
public void search(String name)
{
	String nametosearchname=name;
	File objforsearch=new File("Myfolder");
	String[] arr1=objforsearch.list();
	for(String iterator1:arr1)
	{
		if(iterator1.equals(nametosearchname))
		{
			System.out.println("the file is found now");
			System.out.println(iterator1);
		}
		else
		{
			System.out.println("the file is not found now");
		}
	}
}
public void delete(String name)
{
	File  objfordelete =new File("Myfolder\\"+name);
	if(objfordelete.exists())
	{
		try
		{
			objfordelete.delete();
			System.out.println("the file was deleted succefully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	else
	{
		System.out.println("the file already existing");
			}
}
}

