package java_3_Essential.lesson_9.task_2;


public class List {
    private Object[] elements;

    public List(){
        elements = new Object[0];
    }

    public void addElement(Object element){
        Object[] newElements = new Object[elements.length + 1];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        newElements[elements.length] = element;
        elements = newElements;
    }

    public Object getElement(int index){
        return elements[index];
    }

    public int getSize(){
        return elements.length;
    }
}