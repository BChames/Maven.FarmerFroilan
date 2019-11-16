package interfaces;

public interface FarmStuff<T> {

    Boolean addFarmObject(T farmObject);
    Boolean removeFarmObject(T farmObject);
}
