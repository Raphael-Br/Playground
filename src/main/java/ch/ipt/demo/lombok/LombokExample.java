package ch.ipt.demo.lombok;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LombokExample {
	final String name;
	final String vorname;
	@NonNull
	int alter;
	@ToString.Exclude
	boolean active;
}
