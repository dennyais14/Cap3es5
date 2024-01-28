public class Rettangolo implements Forma {
    int base;
    int altezza;
    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public int calcoloArea(int base, int altezza) {
        return base * altezza;
    }
}
