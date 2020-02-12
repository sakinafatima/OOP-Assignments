This is just an example of simple factory where it has a class that has one creation method with a large conditional that based on method parameters chooses which product class to instantiate and then return.
There is no sub classes in this pattern. In this folder, SimpleBookFactory class shows an implementation of simple factory pattern as following:

public class SimpleBookFactory {

	
	
	public Book PublishBook(String type) {
		
		if ("HarryPotter".equalsIgnoreCase(type))
		{
			
			return new HarryPotter();
		}
		
		if ("Halmet".equalsIgnoreCase(type))
		{
			
			return new Halmet();
		}
		
		return null;
	}
		
	}