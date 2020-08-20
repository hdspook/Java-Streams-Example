import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DataStructures {

	public static void main(String[] args) {
		Integer[] numbers = { 1, 1, 1, 4, 5 };

		List<Integer> lNumbers = Arrays.asList(numbers);
		System.out.println(lNumbers);

		Set<Integer> set = lNumbers.stream().collect(Collectors.toSet());
		System.out.println(set);

		List<Integer> square = lNumbers.stream().map(c -> c * c).collect(Collectors.toList());
		System.out.println(square);

		List<Integer> squareSpecific = lNumbers.stream().filter(c -> c == 1).map(c -> c * c)
				.collect(Collectors.toList());
		System.out.println(squareSpecific);

		long sqaureAns = lNumbers.stream().map(i -> i * i).reduce(0, (sum, i) -> sum + i);
		System.out.println(sqaureAns);

		long count = lNumbers.stream().filter(i -> i == 1).count();
		System.out.println(count);

		long count_1 = Arrays.stream(numbers).count();
		System.out.println(count_1);

		// Create an empty hash map
		HashMap<String, Integer> map = new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		int sumEx = map.values().stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sumEx);

		Map<Integer, Integer> countsArray = Arrays.asList(numbers).stream()
				.collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
		
		System.out.println(countsArray);
	}

}
