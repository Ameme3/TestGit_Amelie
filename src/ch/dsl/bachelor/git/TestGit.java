package ch.dsl.bachelor.git;

public class TestGit {

	private String gitFromScratch;
	
	public TestGit(String parameter) 
	{
		this.gitFromScratch = parameter;
	}
//	je mets un commentaire utile
	public String returnTheString()
	{
		return this.gitFromScratch;
	}

}
