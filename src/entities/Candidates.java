package entities;

public class Candidates {

	private String number;
	private String name;
	private String party;

	int votes = 0;

	public Candidates(String number, String name, String party) {

		this.number = number;
		this.name = name;
		this.party = party;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getParty() {
		return party;
	}

	public void vote() {
		votes++;
	}

	public int getVotes() {
		return votes;
	}

	public static Object get(int i) {
		return null;
	}

}
