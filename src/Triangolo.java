class Triangolo implements Forma{
    int base;
    int altezza;
    public Triangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public int calcoloArea(int base, int altezza) {
        return (base * altezza)/2;
    }
}
