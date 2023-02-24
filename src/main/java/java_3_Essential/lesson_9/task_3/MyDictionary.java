package java_3_Essential.lesson_9.task_3;

import java.util.ArrayList;

public class MyDictionary<Tkey, TValue> {
    private ArrayList<Tkey> tKeys = new ArrayList<>();
    private ArrayList<TValue> tValues = new ArrayList<>();


    public int size(){
        return tKeys.size();
    }
    public void add(Tkey tkey, TValue tValue){
        tKeys.add(tkey);
        tValues.add(tValue);
    }
    public TValue getValueByIndex(int index){
        return tValues.get(index);
    }
    public TValue getValueByKey(Tkey tkey) throws Exception {
        for (int i = 0; i < tKeys.size(); i++) {
            if(tKeys.get(i).equals(tkey)) return tValues.get(i);
        }
        throw new Exception("Не знайдено пару по ключу - "  + tkey);
    }
}
