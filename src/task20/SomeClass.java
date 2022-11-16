package task20;

import java.io.Serializable;

public class SomeClass<T extends Comparable<T>, V extends Serializable, K> {
    T tVar;
    V vVar;
    K kVar;

    public SomeClass(T tVar, V vVar, K kVar) {
        this.tVar = tVar;
        this.vVar = vVar;
        this.kVar = kVar;
    }

    public T gettVar() {
        return tVar;
    }

    public void settVar(T tVar) {
        this.tVar = tVar;
    }

    public V getvVar() {
        return vVar;
    }

    public void setvVar(V vVar) {
        this.vVar = vVar;
    }

    public K getkVar() {
        return kVar;
    }

    public void setkVar(K kVar) {
        this.kVar = kVar;
    }
}
