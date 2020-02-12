package simple_factory;

public class AbstractFactoryTest {

	
public static void main(String[] args) {
		
		
		SimpleBookFactory factory = new SimpleBookFactory();
		Book book1= factory.PublishBook("HarryPotter");
		book1.aboutBook();
		
		SimpleBookFactory factory2 = new SimpleBookFactory();
		Book book2= factory2.PublishBook("Halmet");
		book2.aboutBook();
		
	}
}
