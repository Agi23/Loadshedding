class Counter{
    int ArrayFind;
    int BSTFind;
    int iternum;

    public Counter(int itnum){
        this.ArrayFind = 0;
        this.BSTFind = 0;
        this.iternum = itnum;
    }

    public void setArrayFind(int count){
        ArrayFind = count;
    }

    public void setBSTFind(int count){
        BSTFind = count;
    }

    private void reset(){
        ArrayFind = 0;
        BSTFind = 0;
        iternum =0;
    }

    public String toString(){
        String out = Integer.toString(iternum) + "," + Integer.toString(ArrayFind) + "," + Integer.toString(BSTFind);
        reset();
        return out;

    }
}