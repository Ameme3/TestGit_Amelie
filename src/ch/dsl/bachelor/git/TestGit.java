package ch.dsl.bachelor.git;

public class TestGit {

	private String gitFromScratch;
	
	public TestGit(String parameter) 
	{
		this.gitFromScratch = parameter;
	}
	public String returnTheString()
	{
		return this.gitFromScratch;
	}
	
	public static void main (String[] args)
	{
		System.out.println("Hello");
	}
}
