package riccardogulin.u5d13.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Page implements Element {
	private String content;

	@Override
	public int getNumberOfPages() {
		return 1;
	}

	@Override
	public void printContent() {
		System.out.println(content);
	}
}
