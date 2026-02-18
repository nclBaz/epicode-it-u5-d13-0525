package riccardogulin.u5d13.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Libro {
	private String title;
	private String author;
	private List<Section> chapters;

	public void printContent() {
		chapters.forEach(chapter -> chapter.printContent());
	}

	public int getNumberOfPages() {
		return chapters.stream().mapToInt(section -> section.getNumberOfPages()).sum();
	}
}
