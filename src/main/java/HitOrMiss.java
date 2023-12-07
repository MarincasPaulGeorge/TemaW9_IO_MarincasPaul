enum HitOrMiss {

    HIT('x'), MISS('o');

    private final char symbol;

    HitOrMiss(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
