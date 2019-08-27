public class Set {
    private boolean isEmpty = true;
    private int size = 0;
    private Object[] elements = new Object[1];

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(Object element) {
        if (size + 1 == elements.length) {
            grow();
        }
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                return;
            }
        }
        elements[size] = element;
        isEmpty = false;
        size++;
    }

    public void grow() {
        Object[] copyElements = elements;
        elements = new Object[(size + 1) * 2];
        System.arraycopy(copyElements, 0, elements, 0, copyElements.length);
    }

    public int size() {
        return size;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("isEmpty: " + isEmpty + "\n" + "size: " + size + "\n" + "elements.length: " + elements.length);
    }
}
