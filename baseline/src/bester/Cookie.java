package bester;

public class Cookie {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public boolean isBetter(Cookie cookie) {
        return this.numberOfChocolateChips > cookie.numberOfChocolateChips;
    }
}
