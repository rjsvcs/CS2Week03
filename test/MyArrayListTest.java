import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private static final String ZERO = "def";
    private static final String ONE = "xyz";
    private static final String TWO = "qrs";

    @Test
    void create() {
        MyList<String> list = new MyArrayList<>(2);

        assertNotNull(list);
    }

    @Test
    void addOne() {
        MyList<String> list = new MyArrayList<>(2);

        String string = "abc";
        list.add(string);

        assertEquals(1, list.size());
        assertEquals(0, list.indexOf(string));
        assertSame(string, list.get(0));
    }

    @Test
    void addUntilGrow() {
        int initial = 2;
        MyList<String> list = new MyArrayList<>(initial);

        String[] copy = new String[initial*4];
        for(int i=0; i<copy.length; i++) {
            String next = Integer.toBinaryString(i);
            copy[i] = next;
            list.add(next);
        }

        assertEquals(copy.length, list.size());
        for(int i=0; i<copy.length; i++) {
            assertEquals(i, list.indexOf(copy[i]));
            assertEquals(copy[i], list.get(i));
        }
    }

    @Test
    void removeValueBeginning() {
        MyList<String> list = makeList();

        list.remove(ZERO);

        assertEquals(2, list.size());
        assertEquals(-1, list.indexOf(ZERO));
        assertEquals(0, list.indexOf(ONE));
        assertEquals(1, list.indexOf(TWO));
    }

    @Test
    void removeValueMiddle() {
        MyList<String> list = makeList();

        list.remove(ONE);

        assertEquals(2, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(-1, list.indexOf(ONE));
        assertEquals(1, list.indexOf(TWO));
    }

    @Test
    void removeValueEnd() {
        MyList<String> list = makeList();

        list.remove(TWO);

        assertEquals(2, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(1, list.indexOf(ONE));
        assertEquals(-1, list.indexOf(TWO));
    }

    @Test
    void removeIndexBeginning() {
        MyList<String> list = makeList();

        String removed = list.remove(0);

        assertEquals(removed, ZERO);
        assertEquals(2, list.size());
        assertEquals(-1, list.indexOf(ZERO));
        assertEquals(0, list.indexOf(ONE));
        assertEquals(1, list.indexOf(TWO));
    }

    @Test
    void removeIndexMiddle() {
        MyList<String> list = makeList();

        String removed = list.remove(1);

        assertEquals(removed, ONE);
        assertEquals(2, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(-1, list.indexOf(ONE));
        assertEquals(1, list.indexOf(TWO));
    }

    @Test
    void removeIndexEnd() {
        MyList<String> list = makeList();

        String removed = list.remove(2);

        assertEquals(removed, TWO);
        assertEquals(2, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(1, list.indexOf(ONE));
        assertEquals(-1, list.indexOf(TWO));
    }

    @Test
    void insertBeginning() {
        MyList<String> list = makeList();

        String inserted = "hijk";
        list.insert(inserted, 0);

        assertEquals(4, list.size());
        assertEquals(1, list.indexOf(ZERO));
        assertEquals(2, list.indexOf(ONE));
        assertEquals(3, list.indexOf(TWO));
        assertEquals(0, list.indexOf(inserted));
    }

    @Test
    void insertMiddle() {
        MyList<String> list = makeList();

        String inserted = "hijk";
        list.insert(inserted, 1);

        assertEquals(4, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(2, list.indexOf(ONE));
        assertEquals(3, list.indexOf(TWO));
        assertEquals(1, list.indexOf(inserted));
    }

    @Test
    void insertEnd() {
        MyList<String> list = makeList();

        String inserted = "hijk";
        list.insert(inserted, 3);

        assertEquals(4, list.size());
        assertEquals(0, list.indexOf(ZERO));
        assertEquals(1, list.indexOf(ONE));
        assertEquals(2, list.indexOf(TWO));
        assertEquals(3, list.indexOf(inserted));
    }

    private static MyArrayList<String> makeList() {
        MyArrayList<String> list = new MyArrayList<>(2);

        list.add(ZERO);
        list.add(ONE);
        list.add(TWO);

        return list;
    }
}