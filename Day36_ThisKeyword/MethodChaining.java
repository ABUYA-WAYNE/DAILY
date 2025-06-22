public class MethodChaining {
    int t;

    public MethodChaining setT(int value) {
        this.t = value;
        return this;
    }

    public MethodChaining showT() {
        System.out.println(this.t);
        return this;
    }
}
