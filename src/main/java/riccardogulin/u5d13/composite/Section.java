package riccardogulin.u5d13.composite;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Section implements Element {
	private List<Element> subSections;

	@Override
	public int getNumberOfPages() {
//		int total = 0;
//		for (Section section : subSections) {
//			total += section.getNumberOfPages();
//		}
//
//		return total;

		return subSections.stream().mapToInt(section -> section.getNumberOfPages()).sum();
	}

	@Override
	public void printContent() {
		subSections.forEach(section -> section.printContent());
	}
}
