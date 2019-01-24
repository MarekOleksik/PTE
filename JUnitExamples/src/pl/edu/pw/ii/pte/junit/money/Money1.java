package pl.edu.pw.ii.pte.junit.money;

class Money1 {
	private int fAmount;
	private String fCurrency;

	public Money1(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public Money1 add(Money1 m) {
		return new Money1(amount() + m.amount(), currency());
	}

	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money1 a = (Money1) anObject;

			return a.currency().equals(currency()) && amount() == a.amount();
		}
		return false;

	}
	public Money1 multiply(int x){
		return new Money1(amount() * x, currency());
	}
}