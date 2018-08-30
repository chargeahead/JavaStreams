import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		
		Stream<String> namesStream = Stream.of("Tom","Bob","Tim");
		System.out.println("names stream count is "+namesStream.count());
		IntStream integerStream = IntStream.range(1, 5);
		System.out.println("int stream count is "+integerStream.count());
		integerStream = IntStream.of(1,5,8);
		
		String[] names = {"Tom","Bob","Tim"};
		Stream<String> namesStream2 = Stream.of(names);
		System.out.println("names stream2  count is "+namesStream2.count());
		
		ArrayList myList = new ArrayList();
		myList.add("Tom");
		myList.add("Bob");
		myList.add("Tim");
		Stream<String> streamFromList = myList.stream();
		System.out.println("streamFromList count is "+streamFromList.count());
		
		Stream<String> stEmpty = Stream.empty();
		System.out.println("stEmpty count is "+stEmpty.count());
		
		Stream.Builder<String> stbuilder = Stream.builder();
		stbuilder.accept("Tom");
		stbuilder.accept("Bob");
		stbuilder.accept("Tim");
		Stream<String> myStream = stbuilder.build();
		System.out.println("myStream count is "+myStream.count());
	}

}
