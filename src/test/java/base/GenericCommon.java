package base;

public abstract class GenericCommon 
{
	public String getAndConcatCurrentPath(String path)
	{
		String currentPath=System.getProperty("user.dir");
		
		return currentPath+path;
		
	}
}
