package Streams;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SteamMaxMinDate {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
		
		List<LocalDate> dates = Stream.iterate(start, date ->date.plusDays(1))
									  .limit(ChronoUnit.DAYS.between(start, end))
									  .collect(Collectors.toList());
		
		
		LocalDate maxDate = dates.stream()
								 .max(Comparator.comparing(LocalDate::toEpochDay))
								 .get();
		
		LocalDate minDate = dates.stream()
				 .min(Comparator.comparing(LocalDate::toEpochDay))
				 .get();
		
		System.out.println("Max date is " + maxDate);
		System.out.println("Min date is " + minDate);
		
	}

}
