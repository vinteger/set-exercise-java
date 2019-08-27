class Set {
    private boolean isEmpty = true;
    private int size = 0;
    private Object[] elements = new Object[1];

    boolean isEmpty() {
        return isEmpty;
    }

    void add(Object element) {
        if (size + 1 == elements.length) {
            grow();
        }

        if (findElementIndex(element) != -1) {
            return;
        }

        elements[size] = element;
        isEmpty = false;
        size++;
    }


    int size() {
        return size;
    }

    boolean contains(Object element) {
        return findElementIndex(element) != -1;
    }

    void remove(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
            }
        }
    }

    private void grow() {
        Object[] copyElements = elements;
        elements = new Object[(size + 1) * 2];
        System.arraycopy(copyElements, 0, elements, 0, copyElements.length);
    }

    private int findElementIndex(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
