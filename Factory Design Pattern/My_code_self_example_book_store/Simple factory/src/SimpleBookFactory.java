package simple_factory;


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

